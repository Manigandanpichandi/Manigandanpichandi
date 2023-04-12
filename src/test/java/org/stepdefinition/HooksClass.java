package org.stepdefinition;

import org.sam.Baseclass1;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends Baseclass1{
	
@Before(order = 1)
//precondition
private void precondition2() {
	windowMaximize();
}
@Before(order = 2)
//precondition
private void precondition1() {
	LaunchBrowser();
	System.out.println("Launch the browser");
}
@Before(order = 3)
//precondition
private void precondition3() {
	System.out.println("precondition Condition 3");
}
@After(order=5)
//Postcondition
private void Postcondition() {
	closeEntireBrowser();
}
@After(order=4)
//Postcondition
private void Postcondition2() {
	System.out.println("Take screenshot");
}
}
