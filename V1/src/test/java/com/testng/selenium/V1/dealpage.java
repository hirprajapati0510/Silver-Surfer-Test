package com.testng.selenium.V1;
//import java.io.PrintStream;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class dealpage
{
  WebDriver driver;
  By DealDetails = By.linkText("Deal Details");
  By SelectCampaign = By.id("ddlCampaigns");
  By SelectProviderType = By.id("ddlDealProvider");
  By SelectProvider = By.id("ddlVasProvider");
  By SelectDeal = By.id("ddlDeals");
  By AccountNo = By.name("AccNumber");
  String randomacctnumber = RandomStringUtils.randomNumeric(8);
  By Bank = By.id("ddlBanks");
  By Bankbranch = By.id("ddlBranches");
  By Accountholder = By.name("AccHolder");
  String acctname = RandomStringUtils.randomAlphabetic(5);
  By Accounttype = By.id("ddlAccTypes");
  By Debitday = By.id("ddlDebitDays");
  By AddButton = By.xpath("//*[@id='bankDialogue']/div/div/div[2]/div/div[1]/div[4]/div/button");
  By SaveBankingInfo = By.xpath("//*[@id='bankDialogue']/div/div/div[3]/button[2]");
  By MSISDN = By.id("msisdn");
  By SaveProviderSpecific = By.id("SvChanges");
  By saveorder = By.xpath("//*[@id=\"saveOrder\"]");
  By idnumber = By.id("idNumberLabel");
  By customercare = By.xpath("//*[@id=\"side-menu\"]/li[8]/a");
  By searchcustomer = By.xpath("//*[@id=\"side-menu\"]/li[8]/ul/li/a");
  By ordersearch = By.id("customer-search-input");
  By Customersreach = By.xpath("//*[@id=\"customer-search-index\"]/div[2]/div/label[2]/input");
  By Submitsearch = By.id("submit-search");
  By Customerview = By.xpath("//*[@id=\"index-customers\"]/tbody/tr/td[3]/a[2]");
  By ordertab = By.xpath("//*[@id=\"ordersTab\"]/a");
  String randomNumbe = RandomStringUtils.randomNumeric(9);
  String phNo = 0 + randomNumbe;
  By SelectCity = By.id("provinceSelection");
  By msisdnbutton = By.xpath("//*[@id=\"providerModalBody\"]/div[2]");
  By Imei = By.id("imei");
  By Registration = By.id("registrationNumber");
  

  public dealpage(WebDriver driver)
  {
    this.driver = driver;
  }
  
  public void verifycampaign() throws InterruptedException
  {
    driver.findElement(DealDetails).click();
    Select campaign = new Select(driver.findElement(SelectCampaign));
    campaign.selectByVisibleText("Test Lead Campaign");
    Thread.sleep(3000L);
  }
  
  public void verifydealpage(String providertyp, String providername) throws InterruptedException
  {
    driver.findElement(DealDetails).click();
    
    Select providertype = new Select(driver.findElement(SelectProviderType));
    providertype.selectByVisibleText(providertyp);
    
    Select provider = new Select(driver.findElement(SelectProvider));
    provider.selectByVisibleText(providername);
    
    driver.findElement(SelectDeal).sendKeys(Keys.DOWN);
    Thread.sleep(2000L);
    

    Thread.sleep(5000L);
    
    driver.findElement(AccountNo).sendKeys(randomacctnumber);
    Select bank = new Select(driver.findElement(Bank));
    bank.selectByVisibleText("BIDVEST BANK");
    Select branch = new Select(driver.findElement(Bankbranch));
    branch.selectByVisibleText("BIDVEST BANK (GENERIC)");
    
    driver.findElement(Accountholder).sendKeys(acctname);
    Select acctype = new Select(driver.findElement(Accounttype));
    acctype.selectByVisibleText("Current");
    Select debitdte = new Select(driver.findElement(Debitday));
    debitdte.selectByVisibleText("17");
    driver.findElement(AddButton).click();
    Thread.sleep(3000L);
    driver.findElement(SaveBankingInfo).click();
    Thread.sleep(4000L);
    
    boolean providerspecificinfo = driver.findElement(msisdnbutton).isDisplayed();
    
    if (providerspecificinfo)
    {
      MSSIDNProviderspecific();
    }
    else
    {
      System.out.println("Test");
    } 
    driver.findElement(saveorder).click();
    Thread.sleep(2000L);
    String id1 = driver.findElement(idnumber).getText();
    Thread.sleep(3000L);   
    driver.findElement(customercare).click();
    Thread.sleep(2000L);
    driver.findElement(searchcustomer).click();
    Thread.sleep(2000L);
    driver.findElement(ordersearch).sendKeys(id1);
    driver.findElement(Customersreach).click();
    Thread.sleep(2000L);
    driver.findElement(Submitsearch).click();
    Thread.sleep(3000L);
    driver.findElement(Customerview).click();
    Thread.sleep(2000L);
    driver.findElement(ordertab).click();
    Thread.sleep(3000L);
  } 
  private void MSSIDNProviderspecific()
    throws InterruptedException
  {
    Thread.sleep(2000L);
    driver.findElement(MSISDN).sendKeys(phNo);
    Thread.sleep(2000L);
    driver.findElement(SaveProviderSpecific).click();
    Thread.sleep(2000L);
  }
}
