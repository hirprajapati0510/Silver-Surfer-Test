package com.testng.selenium.V1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class menupage
{
  WebDriver driver;
  By sale = By.linkText("Sales");
  By startselling = By.linkText("Start Selling");
  
  public menupage(WebDriver driver)
  {
    this.driver = driver;
  }
  
  public void verifymenu() throws InterruptedException
  {
    driver.findElement(sale).click();
    Thread.sleep(2000L);
    driver.findElement(startselling).click();
    Thread.sleep(2000L);
  }
}
