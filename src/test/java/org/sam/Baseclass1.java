package org.sam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass1 {
	
	public static WebDriver driver;

	public static void LaunchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void LaunchUrl(String Url) {
		driver.get(Url);
	}

	public static void PageTitle() {
		String title = driver.getTitle();
		System.out.println(title);
	}

	public static void passtext(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}

	public static void closeEntireBrowser() {
		driver.quit();
	}

	public static void clickBtn(By by) {
		by.click();
	}

	public static void Screenshot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+ imgName.png");
		FileUtils.copyFile(image, f);
	}

	public static Actions a;

	public static void moveTheCursor(WebElement targetWebElement) {
		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}

	public static void dragDrop(WebElement dragwebElement, WebElement dropElement) {
		a = new Actions(driver);
		a.dragAndDrop(dragwebElement, dropElement).perform();
	}
	public static JavascriptExecutor js;
public static void scrollThePage(WebElement tarWebele) {
js=(JavascriptExecutor)driver;
js.executeScript("arguements[0] scrollIntoView(true)", tarWebele);
}
public static void scroll(WebElement element) {
	js=(JavascriptExecutor)driver;
	js.executeScript("arguements[0] scrollIntoView(false)", element);
}

	public static void excellRead(String sheetName, int rowNum, int cellNum) throws IOException {
		
	File f = new File("C:\\Users\\MANIKANDAN.P\\eclipse-workspace\\MavenProject\\Excel\\Newfile.xlsx");
	FileInputStream fis= new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet mysheet = wb.getSheet("Data");
	Row r = mysheet.getRow(rowNum);
	Cell c = r.getCell(cellNum);
	int cellType = c.getCellType();
	String value ="";
	if (cellType ==1) {
		String value2 = c.getStringCellValue();	
	}
	else if (DateUtil.isCellDateFormatted(c)) {
		Date dd = c.getDateCellValue();
		SimpleDateFormat s = new SimpleDateFormat(value);
		String value1 = s.format(dd);
	}
		else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String valueof = String.valueOf(l);
	}
	}
	public static void createNewExcelFile(int rowNum, int cellNum, String writeData)throws IOException {
		File f = new File("C:\\Users\\MANIKANDAN.P\\eclipse-workspace\\MavenProject\\Excel\\Newfile.xlsx");
		Workbook w = new XSSFWorkbook();
		Sheet newsheet = w.createSheet("Datas");
		Row newrow = newsheet.createRow(rowNum);
		Cell newCell = newrow.createCell(cellNum);
		newCell.setCellValue(writeData);
		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);
		}
		public static void createCell(int getRow, int crecell, String newData) throws IOException {
		File f = new File("C:\\Users\\MANIKANDAN.P\\eclipse-workspace\\MavenProject\\Excel\\Newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.createSheet("Datas");
		Row r = s.getRow(getRow);
		Cell c = r.createCell(crecell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		}
		public static void createRow(int creRow, int creCell, String newData) throws IOException {
		File f = new File("C:\\Users\\MANIKANDAN.P\\eclipse-workspace\\MavenProject\\Excel\\Newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Datas");
		Row r = s.createRow(creRow);
		Cell c = r.createCell(creCell);
		c.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		}
		public static void UpdateDataToParticularCell(int getTheRow, int getTheCell, String exicitingDtata, String writeNewData) throws IOException {
			
		File f = new File("Excel Location.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheet("Datas");
		Row r = s.getRow(getTheCell);
		Cell c = r.getCell(getTheCell);
		String Str = c.getStringCellValue();
		if (Str.equals(exicitingDtata)) {
			c.setCellValue(writeNewData);
			
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		}
		public static void main(String[] args) throws IOException {
			File f = new File("C:\\Users\\MANIKANDAN.P\\eclipse-workspace\\MavenProject\\Excel\\Newfile.xlsx");
			Workbook wb = new XSSFWorkbook();
			Sheet mysheet = wb.createSheet("Datas");
			Row r = mysheet.createRow(0);
			Cell c = r.createCell(0);
			c.setCellValue("Selenium");
			FileOutputStream fos = new FileOutputStream(f);
			wb.write(fos);
		}
}
