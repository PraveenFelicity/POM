package com.org.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome extends BaseClass {
public static void main(String[] args) throws Throwable {
	LaunchChrome("http:\\www.facebook.com");
	LoginPage l = new LoginPage ();
	enterText(l.getUserName(), "8754392139");
	actionContextClick(l.getContextClick());
	Down();
	Enter();
	Paste();
	ScreenShot();
	String g = getAttribute(l.getGetAttribute(), "value");
	System.out.println(g);
	
}	
}
