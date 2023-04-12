package org.sam;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.sam.Baseclass1;
public class SampleProject extends Baseclass1 {
@Test
public void tc1() {
	System.out.println("Test case 1");
}
@Before
public void Startbefore() {
	LaunchBrowser();
	windowMaximize();
}
@After
public void Beforend() {
	closeEntireBrowser();
}
@BeforeClass
public static void Startpage() {
LaunchBrowser();
windowMaximize();
}
@AfterClass
public static void Endpage() {
closeEntireBrowser();
}
@Test
public void tc3() {
System.out.println("Text case 3");
LaunchUrl("https://www.facebook.com/");
}
@Ignore
@Test
public void tc2() {
	System.out.println("Test case 2");
	LaunchUrl("https://www.amazon.in/");
}
@Test
public void tc5() {
	System.out.println("Test case 5");
	LaunchUrl("https://www.myntra.com/");
}
}
