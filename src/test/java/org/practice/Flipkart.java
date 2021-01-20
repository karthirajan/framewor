package org.practice;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\workspace\\May\\framework\\driver\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
		
		
	}
	
	@After
	public void afterTest() {

        System.out.println("After");
        Date date =new Date();
        System.out.println(date);

	}
	
	@Test
	public void searchProduct() {
		
		WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("Mobiles",Keys.ENTER);
	

	}
	
	@Before
	public void beforeTest() {
		
		System.out.println("Before");
        Date date =new Date();
        System.out.println(date);

	}
	
	@AfterClass
	public static void afterClass() {
		
		System.out.println("After Class");
		driver.quit();

	}

}
