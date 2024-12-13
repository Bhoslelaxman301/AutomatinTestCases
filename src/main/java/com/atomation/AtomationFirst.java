package com.atomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AtomationFirst {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://javabykiran.com/selenium/login.html");
		//Option 1
		WebElement webElement = driver.findElement(By.xpath("/html/body/div/div/h1"));
		String txt =webElement.getText();
		System.out.println(txt);
		
		//Option2
		
		String txtSecond = driver.findElement(By.xpath("/html/body/div/div/p")).getText();
		System.out.println(txtSecond);
		
		driver.findElement(By.xpath("//*[@id=\"username\"]\r\n")).sendKeys("admin");
		driver.findElement(By.xpath("//*[@id=\"password\"]\r\n")).sendKeys("password123");
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button\r\n")).click();
		
		
	}

}
