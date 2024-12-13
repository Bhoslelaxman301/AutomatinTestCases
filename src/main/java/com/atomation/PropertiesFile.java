package com.atomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		FileInputStream file = new FileInputStream("config.propertiesfile");
		Properties properties = new Properties();
		properties.load(file);
		String valurl = properties.getProperty("url");
		System.out.println(valurl);
		driver.get(valurl);
		WebElement webElement = driver.findElement(By.xpath("/html/body/div/div/p"));
		String txt = webElement.getText();
		System.out.println(txt);
		String xpathheading = properties.getProperty("xpathheading");
		System.out.println(xpathheading);
		driver.get(xpathheading);

		String txtsecond = driver.findElement(By.xpath("xpathusername")).getText();
		System.out.println(txtsecond);
	
		driver.findElement(By.xpath(properties.getProperty("xpathusername"))).sendKeys("admin");

		driver.findElement(By.xpath("//*[@id=\"username\"]"))
				.sendKeys(properties.getProperty("passwordofapplication"));
		
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("password123");
		
		driver.findElement(By.xpath("//*[@id=\"login-form\"]/button")).click();

	}

}
