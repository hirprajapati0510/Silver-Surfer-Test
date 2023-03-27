package com.testng.selenium.V1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class loginpage
{
  WebDriver driver;
  By username = By.id("txtUsername");
  By passwd = By.id("txtPassword");
  By btn = By.id("btnSignIn");
  

  public loginpage(WebDriver driver)
  {
    this.driver = driver;
  }
  
  public void verifylogin(String uname, String pwd)
  {
    driver.findElement(username).sendKeys("uname");
    driver.findElement(passwd).sendKeys("pwd");
    driver.findElement(btn).click();
  }
}