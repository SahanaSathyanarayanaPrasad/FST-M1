package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4 {
	
	public static void main (String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		System.out.println("The title of the page is "+ driver.getTitle());
		
		WebElement idLocator = driver.findElement(By.xpath("//*[@id='about-link']"));
		idLocator.click();
		
		String newTitle = driver.getTitle();
		System.out.println("The title of the new page is " + newTitle);
		
		String text = driver.findElement(By.cssSelector(".mono.style.text")).getText();
		System.out.println(text);
		
		driver.close();
		
	}

}
