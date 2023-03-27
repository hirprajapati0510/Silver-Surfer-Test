package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.testng.selenium.V1.customeraddresspage;
import com.testng.selenium.V1.customerdetailspage;
import com.testng.selenium.V1.dealpage;
import com.testng.selenium.V1.disposationpage;
import com.testng.selenium.V1.loginpage;
import com.testng.selenium.V1.menupage;

public class verifytestcases
{
  WebDriver driver;
  
  public verifytestcases() {}
  
  @Parameters({"env"})
  @org.testng.annotations.BeforeClass
  public void setup(String env)
  {
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get(env);
  }
  

  @Test(priority=1)
  public void verifyvalidlogin()
    throws InterruptedException
  {
    loginpage login = new loginpage(driver);
    login.verifylogin("Developer", "Pr0m3th3us!");
  }
  
  @Test(priority=2)
  public void verifyvalidmenu() throws InterruptedException {
    menupage menu = new menupage(driver);
    menu.verifymenu();
  }
  
  @Test(priority=3)
  public void verifycampaign() throws InterruptedException
  {
    dealpage selectcampaign = new dealpage(driver);
    selectcampaign.verifycampaign();
  }
  
  @Test(priority=4)
  public void verifydisposationpage() throws InterruptedException
  {
    disposationpage record = new disposationpage(driver);
    record.verifydisposationpage();
  }
  
  @Test(priority=5)
  public void verifyvalidcustomerdetails() throws InterruptedException {
    customerdetailspage customerdetials = new customerdetailspage(driver);
    customerdetials.verifycustomerdetails();
  }
  
  @Test(priority=6)
  public void verifyvalidcustomeraddress() throws InterruptedException {
    customeraddresspage customeraddress = new customeraddresspage(driver);
    customeraddress.verifycustomeraddress();
  }
  
  @Parameters({"providertyp", "providername"})
  @Test(priority=7)
  public void verifydeal(String providertyp, String providername) throws InterruptedException {
    dealpage deal = new dealpage(driver);
    deal.verifydealpage(providertyp, providername);
  }
  
  @AfterClass
  public void closeoff()
  {
    driver.close();
  }
}