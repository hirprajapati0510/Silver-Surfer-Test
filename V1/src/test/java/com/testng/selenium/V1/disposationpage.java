package com.testng.selenium.V1;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class disposationpage
{
  WebDriver driver;
  By disposition = By.id("dispositionTab");
  By ordervoicerecord = By.id("WavRecording");
  By Dialerlead = By.id("DialerLeadReference");
  String randomordervoice = RandomStringUtils.randomNumeric(8);
  String randomdialerlead = RandomStringUtils.randomAlphabetic(6);
  
  public disposationpage(WebDriver driver)
  {
    this.driver = driver;
  }
  
  public void verifydisposationpage()
    throws InterruptedException
  {
    driver.findElement(disposition).click();
    driver.findElement(ordervoicerecord).sendKeys("randomordervoice");
    driver.findElement(Dialerlead).sendKeys("randomdialerlead");
  }
}