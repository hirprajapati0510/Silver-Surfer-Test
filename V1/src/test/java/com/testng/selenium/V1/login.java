package com.testng.selenium.V1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class login {

	WebDriver driver;
	By username = By.id("txtUsername");
	By password = By.id("txtPassword");
	By login    = By.id("btnSignIn");
	
    public login(WebDriver driver) 
	{
          this.driver = driver;
	}

	public void Logintoportal() 
	{
		driver.findElement(username).sendKeys("Developer");
		driver.findElement(password).sendKeys("Pr0m3th3us!");		
		driver.findElement(login).click();
	}
	
}
