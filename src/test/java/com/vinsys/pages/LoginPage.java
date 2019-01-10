package com.vinsys.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage  {
	By emailLoc=By.xpath("//input[@title='Email']");
	By passLoc=By.xpath("//input[@id='pass']");
	By loginLoc=By.id("send2");
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	
	}

	public void sendEmailAddress(String userName) {
		WebElement emailEle = driver.findElement(emailLoc);
		emailEle.sendKeys(userName);

	}

	public void sendPassword(String password) {
		WebElement passEle = driver.findElement(passLoc);
		passEle.sendKeys(password);

	}

	public void clickOnLogin() {
		WebElement loginEle = driver.findElement(loginLoc);
		loginEle.click();
	}
}
