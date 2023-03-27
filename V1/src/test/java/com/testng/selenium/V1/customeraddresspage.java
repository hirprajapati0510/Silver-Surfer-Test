package com.testng.selenium.V1;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class customeraddresspage
{
  WebDriver driver;
  By addresstab = By.id("addressTab");
  By residentaddres = By.id("addDeliveredTo_2");
  By check = By.id("chkDisclaimer");
  By searching = By.id("searchInputMain");
  String search = RandomStringUtils.randomNumeric(2);
  By searchbox = By.id("searchInput");
  By saveaddress1 = By.xpath("//*[@id=\"CustomerAddSaveClearButtons\"]/input[1]");
  By resident = By.xpath("//*[@id=\"addType_2\"]");
  By checkbox = By.id("chkSameAsDelivery");
  By dateselect = By.id("dateAtAddress");
  

  public customeraddresspage(WebDriver driver)
  {
    this.driver = driver;
  }
  
  public void verifycustomeraddress() throws InterruptedException
  {
    driver.findElement(addresstab).click();
    Thread.sleep(2000L);
    driver.findElement(residentaddres).click();
    Thread.sleep(2000L);
    driver.findElement(check).click();
    Thread.sleep(2000L);
    driver.findElement(searching).sendKeys(new CharSequence[] { search });
    Thread.sleep(3000L);
    
    driver.findElement(searchbox).click();
    Thread.sleep(2000L);
    driver.findElement(searchbox).sendKeys(new CharSequence[] { Keys.DOWN });
    driver.findElement(searchbox).sendKeys(new CharSequence[] { Keys.ENTER });
    Thread.sleep(2000L);
    
    driver.findElement(saveaddress1).click();
    Thread.sleep(2000L);
    

    driver.findElement(resident).click();
    driver.findElement(checkbox).click();
    Select residenctype = new Select(driver.findElement(By.id("residenceTypes")));
    residenctype.selectByVisibleText("Renting");
    Thread.sleep(2000L);
    driver.findElement(dateselect).click();
    String date = "12";
    Thread.sleep(3000L);
    String month = RandomStringUtils.random(1, date);
    String day = RandomStringUtils.random(2, date);
    String yr = "23";
    String year = RandomStringUtils.random(4, yr);
    driver.findElement(dateselect).sendKeys(new CharSequence[] { year + "-" + month + "-" + day });
    driver.findElement(saveaddress1).click();
  }
}

