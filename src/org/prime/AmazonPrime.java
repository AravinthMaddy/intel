package org.prime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonPrime {
	private void empId() {
		System.out.println("id is 13");

		}
		private void empName() {
		System.out.println("name is aravind");

		}
		
		
		
		
		
//	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\aravi\\eclipse-workspace\\Amazon\\driver\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.get(" https://www.shopclues.com/wholesale.html");
//		driver.manage().window().maximize();
//		Actions action=new Actions(driver);
//		WebElement button = driver.findElement(By.xpath("//a[text()='Sports & More']"));
//		action.moveToElement(button);
//		Thread.sleep(1000);
//		WebElement above = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
//	    above.click();
	//
	//    
	//    
	//    
	//    

	
	
	private void cusId() {
	System.out.println("ud is 23");

	}
	private void cusName() {
	System.out.println("name is ara");

	}
	
	
	
	
	
	
	
	
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\aravi\\eclipse-workspace\\Amazon\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get(" https://www.shopclues.com/wholesale.html");
	driver.manage().window().maximize();
	Actions action=new Actions(driver);
	WebElement button = driver.findElement(By.xpath("//a[text()='Sports & More']"));
	action.moveToElement(button);
	Thread.sleep(1000);
	WebElement above = driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
    above.click();
	
	
	
	
	
}}	
