package com.qa.shoaib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomHeadlessBrowser {

	public static void main(String[] args) {
         //Phantom JS internally uses Ghost Driver
		//GhostDriver--> is used as JSON wire protocol --HTTP Rest calls
		//Headless Browser Testing
		//No Browser will be launched
		//Testing is happening behind the scene
		//It's very fast
		//It directly interacts with your app HTML DOM
		
		System.setProperty("phantomjs.binary.path", "C:\\Users\\SHOAIB HANNURE\\Downloads\\phantomjs-2.1.1-windows\\bin\\phantomjs.exe");
WebDriver driver = new PhantomJSDriver();
driver.get("https://www.flipkart.com/");
	String title=driver.getTitle();
	System.out.println("Title before Login---->"+ title);
	
	
	}

}
