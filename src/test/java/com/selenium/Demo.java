package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void testing(){
		System.setProperty("webdriver.chrome.driver", "F:/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.cybage.com/");
		System.out.println("class 1"+ driver.getCurrentUrl());
	}
	
	@Test
	public void testing2(){
		System.setProperty("webdriver.chrome.driver", "F:/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		System.out.println("class 1"+ driver.getCurrentUrl());
	}
	
	@Test
	public void testing3(){
		System.setProperty("webdriver.chrome.driver", "F:/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		System.out.println("class 1"+ driver.getCurrentUrl());
	}

}
