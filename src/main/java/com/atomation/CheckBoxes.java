package com.atomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class CheckBoxes {
	@Test
	void check() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cdn.digialm.com/EForms/configuredHtml/32813/87992/Registration.html");
		WebElement web = driver.findElement(By.xpath("//*[@id=\"txtNameChanged_R\"]"));
		web.click();
		boolean bl =web.isSelected();
		Assert.assertTrue(bl);
		
		
	}
	

}
