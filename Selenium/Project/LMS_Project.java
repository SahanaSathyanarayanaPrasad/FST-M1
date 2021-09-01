package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class LMS_Project {

	WebDriver driver;
	
		
	public void verifyTitle() {
			
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		String actualTitle = driver.getTitle();
		System.out.println("The title of the page is " + actualTitle);
		String expectedTitle = "Alchemy LMS – An LMS Application";
		Assert.assertEquals(expectedTitle,actualTitle);
		System.out.println("Assert passed");
		driver.close();
		}
	
	public void verifyHeading() {
		
		driver = new FirefoxDriver();
		driver.navigate().to("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		WebElement pageHeading = driver.findElement(By.xpath("//h1[contains(@class, 'title')]"));
		String actualHeading = pageHeading.getText();
		String expectedHeading = "Learn from Industry Experts";
		Assert.assertEquals(actualHeading,expectedHeading);
		System.out.println("Assert passed");
		driver.close();
	}
		
	public void verifyFirstInfoBox() {
		
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		String infoTitle = driver.findElement(By.xpath("//h3[contains(@class, 'title')]")).getText();
		//String infoTitle = driver.findElement(By.cssSelector(".uagb.ifb.title")).getText();
		System.out.println(infoTitle);
		String actualinfoTitle = infoTitle;
		String expectedinfoTitle = "Actionable Training";
		
		if (expectedinfoTitle.equals(actualinfoTitle)) {
			System.out.println("Title is matching");
			driver.close();
		} else {
			System.out.println("Title is NOT matching");
		}
		
	}
	
	public void verifySecodnMostPopular() {
		
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		//String linkTitle = driver.findElement(By.xpath("//h3[contains(@class, 'entry-title')]")).getText();
		String linkTitle = driver.findElement(By.xpath("//h3[contains(@class, 'entry-title') and text() = 'Email Marketing Strategies']")).getText();
		System.out.println(linkTitle);
		String expectedLinkTitle = linkTitle;
		String actualLinkTitle = "Email Marketing Strategies";
		
	
	if (expectedLinkTitle.equals(actualLinkTitle)) {
		System.out.println("Hurray!!! your search is matching with the result");
		driver.close();
	} else {
		System.out.println("Oops...your search is not matching");
	}
		
	}
	
	public void myAccount() {
		
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("My Account")).click();
		String myAccountTitle = driver.getTitle();
		System.out.println("The tile of MyAccount is: " + myAccountTitle);
		String pageTitle = driver.findElement(By.xpath("//h1[contains(text(),'My Account')]")).getText();
		System.out.println(pageTitle);                
		
		if (pageTitle.equals("My Account")) {
			System.out.println("its a match!!");
			driver.close();
		} else {
			System.out.println("keep checking");
		}
		
	}
	
	public void myLogin() {
		
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("My Account")).click();
		String myAccountTitle = driver.getTitle();
		System.out.println("The tile of MyAccount is: " + myAccountTitle);
		String pageTitle = driver.findElement(By.xpath("//h1[contains(text(),'My Account')]")).getText();
		System.out.println(pageTitle);                
		
		if (pageTitle.equals("My Account")) {
			System.out.println("its a match!!");
			driver.findElement(By.cssSelector("a[href='#login']")).click();
			driver.findElement(By.id("user_login")).sendKeys("root");
			driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
			driver.findElement(By.id("wp-submit")).click();
			
			//Actions action = new Actions(driver);
			WebElement myLogOut = driver.findElement(By.id("wp-admin-bar-my-account"));
			//action.moveToElement(myLogOut).build().perform();
					   
					   if(myLogOut.isDisplayed()) 
					   { 
					      System.out.println("Login is successful" ); 
					   } 
					   else 
					   { 
					      System.out.println("Login is not successful try again");
					   } 
			driver.close();
			
		} else {
			System.out.println("keep checking");
		}
		
	}
		
	public void allCourses() {
		
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("All Courses")).click();
		List<WebElement> links = driver.findElements(By.xpath("//h3[contains(@class, 'entry-title')]"));
		int linkCount = links.size(); 
		System.out.println("The number of courses avilable on the page is: " + linkCount);
		driver.close();
		
	}
	
	public void contactUs() {
		
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Contact")).click();
		driver.findElement(By.id("wpforms-8-field_0")).sendKeys("Sahana");
		driver.findElement(By.id("wpforms-8-field_1")).sendKeys("sahana.prasad@gmail.com");
		driver.findElement(By.id("wpforms-8-field_3")).sendKeys("Project");
		driver.findElement(By.id("wpforms-8-field_2")).sendKeys("This is my Selenium Project");
		driver.findElement(By.id("wpforms-submit-8")).click();
		
		String message = driver.findElement(By.xpath("//div[@id='wpforms-confirmation-8']/p")).getText();
		System.out.println("The message diaplyed after submission is: " + message);
		
		driver.close();
		
	}
	
	public void courseData() {
		
		driver = new FirefoxDriver();
		driver.get("https://alchemy.hguy.co/lms");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("My Account")).click();
		String myAccountTitle = driver.getTitle();
		System.out.println("The tile of MyAccount is: " + myAccountTitle);
		String pageTitle = driver.findElement(By.xpath("//h1[contains(text(),'My Account')]")).getText();
		System.out.println(pageTitle);                
		
		if (pageTitle.equals("My Account")) {
			driver.findElement(By.cssSelector("a[href='#login']")).click();
			driver.findElement(By.id("user_login")).sendKeys("root");
			driver.findElement(By.id("user_pass")).sendKeys("pa$$w0rd");
			driver.findElement(By.id("wp-submit")).click();
			System.out.println("Login Successful");
		}
			
		driver.findElement(By.linkText("All Courses")).click();		
		driver.findElement(By.xpath("//h3[contains(@class, 'entry-title') and text() = 'Social Media Marketing']"));
		driver.findElement(By.xpath("//img[contains (@class, 'wp-post-image')]")).click();
		driver.findElement(By.xpath("//div[contains(@class, 'ld-item-title')]")).click();
		String actualCourseTitle = driver.getTitle();
		System.out.println(actualCourseTitle);
		String expetedCourseTitle = "Developing Strategy – Alchemy LMS";
		Assert.assertEquals(actualCourseTitle,expetedCourseTitle);
		System.out.println("Assert Matched");	
		
		driver.close();
	}
	
public static void main (String[] args) {
	
	LMS_Project activity = new LMS_Project();
	//activity.verifyTitle();
	//activity.verifyHeading();
	//activity.verifyFirstInfoBox();
	//activity.verifySecodnMostPopular();
	//activity.myAccount();
	//activity.myLogin();
	//activity.allCourses();
	//activity.contactUs();
	//activity.courseData();
}
}
