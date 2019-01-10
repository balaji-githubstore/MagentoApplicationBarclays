package com.vinsys.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {
	 By logOutLoc= By.partialLinkText("Out");
	 
	 WebDriverWait wait;
	 WebDriver driver;
	 
	 public MainPage(WebDriver driver, WebDriverWait wait)
	 {
		 this.driver=driver;
		 this.wait=wait;
	 }
	 
	public String getCurrentTitle()
	{
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(logOutLoc));
		String actualTitle = driver.getTitle();
		return actualTitle;	
	}
	
	public void clickOnLogOut()
	{
		WebElement logOutEle = driver.findElement(logOutLoc);
		logOutEle.click();
	}

}
