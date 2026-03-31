package com.letcode.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;

public class TestExceptions {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		//Navigate to URL 'http://automationexercise.com'
			driver.get("https://practicetestautomation.com/practice/");
			
			//Maximze the Window
				driver.manage().window().maximize();
				//Test case 1: NoSuchElementException
				//Open page
				driver.findElement(By.linkText("Test Exceptions")).click();
				//Click Add button
				driver.findElement(By.xpath("//button[.='Add']")).click();
				
				//Test case 2: ElementNotInteractableException
				//Open page
				driver.findElement(By.linkText("Test Exceptions")).click();
				//Click Add button
				driver.findElement(By.xpath("//button[.='Add']")).click();
				
				driver.findElement(By.className(null));
	}
}
