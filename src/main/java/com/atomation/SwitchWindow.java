package com.atomation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		
		WebElement element = driver.findElement(By.linkText("Click Here"));
		element.click();
		Set<String>winIds = driver.getWindowHandles();
		
		Iterator<String> its = winIds.iterator();
		String pwin = its.next();
		String cwin = its.next();
		
		driver.switchTo().window(cwin);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(pwin);
		System.out.println(driver.getTitle());
		
		

		
	}

}
