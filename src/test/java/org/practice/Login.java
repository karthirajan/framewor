package org.practice;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		
		System.out.println("Before Class");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Lenovo\\workspace\\May\\framework\\driver\\chromedriver.exe");
         driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
		
		
	}
	
	@After
	public void afterTest() {

        System.out.println("After");
        Date date =new Date();
        System.out.println(date);

	}
	
	@Test
	public void test1() {
		
		System.out.println("**************test1***********");
		WebElement usrName = driver.findElement(By.id("email"));
		usrName.sendKeys("karthi");
		System.out.println("user enters username");
		WebElement pswrd = driver.findElement(By.id("pass"));
		pswrd.sendKeys("3456776");
		System.out.println("user enters password");

	}
	
	@Test
	public void test2() {
		
		System.out.println("**************test2***********");
		WebElement Button = driver.findElement(By.xpath("//input[@type='submit']"));
		Button.click();
		System.out.println("Login clicked successfully");


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
