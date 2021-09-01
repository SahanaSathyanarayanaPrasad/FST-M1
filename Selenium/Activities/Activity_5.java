package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public interface Activity_5 {

	public static void main(String[]args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://training-support.net/selenium/dynamic-controls");
		String pageTitle = driver.getTitle();
		System.out.println("The title of the page is " + pageTitle);
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("The checkbox is "+ checkbox.isDisplayed());
		
		driver.findElement(By.xpath("//button[@id='toggleCheckbox']")).click();
		
		System.out.println("The checkbox is "+ checkbox.isDisplayed());
		
		driver.close();
		
		
	}
	
}
