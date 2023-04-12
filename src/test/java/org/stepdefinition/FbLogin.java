package org.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.Baseclass1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends Baseclass1{
	@Given("To launch the chrome browser and maximize window")
	public void to_launch_the_chrome_browser_and_maximize_window() {
	LaunchBrowser();
	windowMaximize();
	}
	@When("To launch URL of the face book application")
	public void to_launch_URL_of_the_Flipkart_application() {
		LaunchUrl("https://www.facebook.com/");
	}
	@When("To pass the valid user name in email field")
	public void to_pass_the_valid_user_name_in_email_field() {
		driver.get("https://www.facebook.com/");
		WebElement email1 = driver.findElement(By.id("email"));
		email1.sendKeys("Manigandan2491@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345");
		
	}
	@When("TO pass the invalid password in password field")
	public void to_pass_the_invalid_password_in_password_field() {
		driver.get("https://www.facebook.com/");
		WebElement email1 = driver.findElement(By.id("email"));
		email1.sendKeys("Manigandan2491@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345");
	}
	@When("To click the login button")
	public void to_click_the_login_button() {
		System.out.println("Click the button");
	}
	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {
		System.out.println("To check your login botton");
	}
	@Then("To close the browser")
	public void to_close_the_browser() {
		closeEntireBrowser();
	}

	

}
