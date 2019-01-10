package com.vinsys.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	By myAccLoc=By.xpath("//span[text()='My Account']/ancestor::a");
	
	public void clickOnMyAccountIcon(WebDriver driver)
	{

		WebElement myAccEle = driver.findElement(myAccLoc);
		myAccEle.click();
	}
}
