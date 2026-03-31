package com.letcode.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchURL {

	public static void main(String[] args) throws InterruptedException {
		
		//Test case 1: Positive LogIn test
		
		// Launch browser
		WebDriver driver = new ChromeDriver();
		
		//Navigate to URL 'http://automationexercise.com'
			driver.get("https://practicetestautomation.com/practice/");
			
			//Maximze the Window
				driver.manage().window().maximize();
		
				//Click on 'Signup / Login' button
				driver.findElement(By.linkText("Test Login Page")).click();
				driver.findElement(By.id("username")).sendKeys("student");
				driver.findElement(By.id("password")).sendKeys("Password123");
				driver.findElement(By.xpath("//button[.='Submit']")).click();

				Thread.sleep(3000);
				
				driver.findElement(By.linkText("Log out")).click();
				
				//Test case 2: Negative username test
				
				driver.findElement(By.id("username")).sendKeys("students");
				
				driver.findElement(By.id("password")).sendKeys("Password123");
				
				driver.findElement(By.xpath("//button[.='Submit']")).click();
				
				Thread.sleep(3000);
				
				//Test case 3: Negative password test
				
				driver.findElement(By.id("username")).sendKeys("student");
				
				driver.findElement(By.id("password")).sendKeys("Password1234");
				
				driver.findElement(By.xpath("//button[.='Submit']")).click();
	} 
}
