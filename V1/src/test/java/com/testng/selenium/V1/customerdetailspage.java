package com.testng.selenium.V1;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class customerdetailspage
{
  WebDriver driver;
  By custdetails = By.id("detailsTab");
  By custname = By.id("CustomerName");
  String fname = RandomStringUtils.randomAlphabetic(8);
  By surename = By.id("CustomerSurname");
  String sname = RandomStringUtils.randomAlphabetic(8);
  By passportredio = By.id("id_2");
  By passportno = By.xpath("//*[@id=\"id_2\" and @value=2]");
  String randompassport = RandomStringUtils.randomNumeric(13);
  By enterrandompass = By.id("IdNumber");
  By Contactno1 = By.id("Contact1");
  By email = By.id("Contact4");
  By leadauth = By.xpath("//*[@id=\"6\" and @value=2]");
  By spot = By.xpath("//*[@id=\"8\" and @value=2]");
  
  public customerdetailspage(WebDriver driver)
  {
    this.driver = driver;
  }
  
  public void verifycustomerdetails()
  {
    driver.findElement(custdetails).click();
    Select title = new Select(driver.findElement(By.id("customerTitles")));
    title.selectByVisibleText("Mrs");
    driver.findElement(custname).sendKeys("fname");
    String sname = RandomStringUtils.randomAlphabetic(8);
    driver.findElement(surename).sendKeys(sname);
    driver.findElement(passportredio).click();
    driver.findElement(passportno).click();
    driver.findElement(enterrandompass).sendKeys("randompassport");
    
    Select education = new Select(driver.findElement(By.id("levelOfEducation")));
    education.selectByVisibleText("Advanced");
    String randomNumbe = RandomStringUtils.randomNumeric(9);
    String phNo = 0 + randomNumbe;
    driver.findElement(Contactno1).sendKeys(phNo);
    
    Random randomGenerator = new Random();
    int randomInt = randomGenerator.nextInt(1000);
    driver.findElement(email).sendKeys("order" + randomInt + "@yopmail.com");
    driver.findElement(leadauth).click();
    driver.findElement(spot).click();
  }
}