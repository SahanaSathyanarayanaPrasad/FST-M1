package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_2 {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/simple-form");
		System.out.println("The title of the page is " + driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id='firstName']")).sendKeys("Sahana");
		
		WebElement lastName =  driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("Prasad");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("sahana.prasad@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='number']")).sendKeys("9876564563");
		
		driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();
		
		//WebElement submit = driver.findElement(By.cssSelector(".ui.green.button"));
		//System.out.println(submit.getText());
		//submit.click();
		
		
		//driver.close();
		
		
		
		
	}

	
	
}
