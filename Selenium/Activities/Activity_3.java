package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {
		
	public static void main (String[] args) throws InterruptedException {
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		driver.navigate().to("https://training-support.net/selenium/simple-form");
		Thread.sleep(60);
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);
		
		driver.findElement(By.id("firstName")).sendKeys("Sahana");
		driver.findElement(By.id("lastName")).sendKeys("Prasad");
		driver.findElement(By.id("email")).sendKeys("sahana.prasad@gmail.com");
		driver.findElement(By.id("number")).sendKeys("9656745345");
		driver.findElement(By.cssSelector(".ui.green.button")).click();
		driver.close();

		
	}

}
