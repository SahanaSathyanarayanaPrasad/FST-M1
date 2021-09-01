package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_2 {
	
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net");
		String title = driver.getTitle();
		System.out.println("The title of the page is " + title);
		
		String idLocator = driver.findElement(By.id("about-link")).getText();
		System.out.println("The text in the link is " + idLocator);
		
		String classLocator = driver.findElement(By.className("green")).getText();
		System.out.println("The text in the link is " + classLocator);
		
		String cssLocator = driver.findElement(By.cssSelector(".green")).getText();
		System.out.println("The text in the link is " + cssLocator);
		
		String linkLocator = driver.findElement(By.linkText("About Us")).getText();
		System.out.println("The text in the link is " + linkLocator);
		
		driver.close();
		
	}

}
