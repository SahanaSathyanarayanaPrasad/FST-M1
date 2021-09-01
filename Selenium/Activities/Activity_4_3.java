package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_3 {

	public static void main (String []args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.training-support.net/selenium/target-practice");
		
		System.out.println("The title of the page is " + driver.getTitle());
		
		String ThirdHeader = driver.findElement(By.xpath("//*[@id='third-header']")).getText();
		System.out.println("The title of the header is " + ThirdHeader);
		
		String FifthHeader = driver.findElement(By.xpath("//h5[contains(@class, 'green')]")).getCssValue("color");
		System.out.println("The color of the fifthheader is " + FifthHeader);
		
		String voiletColorbutton = driver.findElement(By.xpath("//button[contains(@class, 'violet')]")).getAttribute("class");
		System.out.println("voilet button classes are " + voiletColorbutton);
		
		String purpleButton = driver.findElement(By.xpath("//button[@id='purple-button']")).getAttribute("id");
		System.out.println("voilet button ID is " + purpleButton);
		
		String greyButton = driver.findElement(By.xpath("/html/body/div/div[2]/div/div[2]/div/div/div/div[2]/div[3]/button[2]")).getText();
		System.out.println("The text of the button is " + greyButton);
		
		driver.close();
		
				
		 
		
	}
	
}
