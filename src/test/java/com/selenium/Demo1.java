package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	public void testing(){
		System.setProperty("webdriver.chrome.driver", "F:/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.quora.com/I-have-a-Lenovo-laptop-with-4GB-RAM-How-do-I-increase-the-4GB-to-8GB-RAM-in-an-i3-processor");
		System.out.println("class 2"+ driver.getCurrentUrl());
	}
	
	@Test
	public void testing2(){
		System.setProperty("webdriver.chrome.driver", "F:/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.quora.com/");
		System.out.println("class 2"+ driver.getCurrentUrl());
	}
	
	@Test
	public void testing3(){
		System.setProperty("webdriver.chrome.driver", "F:/Automation/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://maven.apache.org/surefire/maven-surefire-plugin/");
		System.out.println("class 2"+ driver.getCurrentUrl());
	}

}
