package testcases;

import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class order 
{

	
	@Test (enabled = true)
	public void test2() throws Exception 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://t2.silversurfer.ignitiongroup.co.za/Auth");
	
	//login
	WebElement username=driver.findElement(By.id("txtUsername"));
	WebElement password=driver.findElement(By.id("txtPassword"));
	WebElement login=driver.findElement(By.id("btnSignIn"));
	username.sendKeys("Developer");
	password.sendKeys("Pr0m3th3us!");
	login.click();
	
	//menu
	WebElement sales = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/a"));
	sales.click();
	WebElement start = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/ul/li[2]/a"));
	start.click();
	Thread.sleep(4000);
	
	// Campaign select First
	driver.findElement(By.id("dealsTab")).click();
	Select campaign = new Select(driver.findElement(By.id("ddlCampaigns")));
	campaign.selectByVisibleText("Test Lead Campaign");
	Thread.sleep(7000);
	
	//Disposition
	driver.findElement(By.id("dispositionTab")).click();
	String ordervoice = RandomStringUtils.randomNumeric(8);
	driver.findElement(By.id("WavRecording")).sendKeys(ordervoice);
	String dialerlead = RandomStringUtils.randomAlphabetic(6);
	driver.findElement(By.id("DialerLeadReference")).sendKeys(dialerlead);
	
	//Customer Details
	WebElement details = driver.findElement(By.id("detailsTab"));
	details.click();
	Select title = new Select(driver.findElement(By.id("customerTitles")));
	title.selectByVisibleText("Mrs");
	String fname = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.id("CustomerName")).sendKeys(fname);
	String sname = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.id("CustomerSurname")).sendKeys(sname);
	//test
	WebElement saID = driver.findElement(By.id("IdNumber"));
	saID.click();
	saID.sendKeys("7403251452081");
	
	Select education = new Select(driver.findElement(By.id("levelOfEducation")));
	education.selectByVisibleText("Advanced");
	String randomNumbe = RandomStringUtils.randomNumeric(9);
	String phNo = 0+randomNumbe;
	driver.findElement(By.id("Contact1")).sendKeys(phNo);
	WebElement email = driver.findElement(By.id("Contact4"));
	email.click();  
	Random randomGenerator = new Random();  
	int randomInt = randomGenerator.nextInt(1000);  
	email.sendKeys("order"+ randomInt +"@yopmail.com");
	WebElement leadauth = driver.findElement(By.xpath("//*[@id=\"6\" and @value=2]"));
	leadauth.click();
	WebElement spot = driver.findElement(By.xpath("//*[@id=\"8\" and @value=2]"));
	spot.click();
	
	//Customer Address
	WebElement addressTab = driver.findElement(By.id("addressTab"));
	addressTab.click();
	Thread.sleep(4000);
	WebElement residentaddress = driver.findElement(By.id("addDeliveredTo_2"));
	residentaddress.click();
	Thread.sleep(4000);
	WebElement check = driver.findElement(By.id("chkDisclaimer"));
	check.click();
	Thread.sleep(4000);
	String search = RandomStringUtils.randomNumeric(2);
	driver.findElement(By.id("searchInputMain")).sendKeys(search);
	Thread.sleep(4000);
	WebElement searchInput = driver.findElement(By.id("searchInput"));
	searchInput.click();
	Thread.sleep(4000);
	searchInput.sendKeys(Keys.DOWN);
	searchInput.sendKeys(Keys.ENTER);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"CustomerAddSaveClearButtons\"]/input[1]")).click();
	Thread.sleep(4000);
	
	// Residential
	driver.findElement(By.xpath("//*[@id=\"addType_2\"]")).click();
	driver.findElement(By.id("chkSameAsDelivery")).click();
	Select residenctype = new Select(driver.findElement(By.id("residenceTypes")));
	residenctype.selectByVisibleText("Renting");
	Thread.sleep(2000);	
	WebElement dateselect = driver.findElement(By.id("dateAtAddress"));
	dateselect.click();
	String date = "12";
	Thread.sleep(4000);
	String month = RandomStringUtils.random(1, date);
	String day = RandomStringUtils.random(2, date);	
	String yr = "23";
	String year = RandomStringUtils.random(4, yr);
	dateselect.sendKeys(year + "-" +  month + "-" + day);
	driver.findElement(By.xpath("//*[@id=\"CustomerAddSaveClearButtons\"]/input[1]")).click();

   // Deal Tab
	driver.findElement(By.id("dealsTab")).click();
	//Select campaign = new Select(driver.findElement(By.id("ddlCampaigns")));
	//campaign.selectByVisibleText("Test Lead Campaign");
	Select providertype = new Select(driver.findElement(By.id("ddlDealProvider")));
	providertype.selectByVisibleText("Telco");
	Select provider = new Select(driver.findElement(By.id("ddlVasProvider")));
	provider.selectByVisibleText("EMedia");
	Select deal = new Select(driver.findElement(By.id("ddlDeals")));
	Thread.sleep(2000);
    deal.selectByVisibleText("EMedia Testing deal");
	Thread.sleep(2000);
		
	// Bank Details
	Thread.sleep(5000);
	String acctnumber = RandomStringUtils.randomNumeric(8);
	driver.findElement(By.name("AccNumber")).sendKeys(acctnumber);
	Select bank = new Select(driver.findElement(By.id("ddlBanks")));
	bank.selectByVisibleText("BIDVEST BANK");
	Select branch = new Select(driver.findElement(By.id("ddlBranches")));
	branch.selectByVisibleText("BIDVEST BANK (GENERIC)");
	String acctname = RandomStringUtils.randomAlphabetic(5);
	driver.findElement(By.name("AccHolder")).sendKeys(acctname);
	Select acctype = new Select(driver.findElement(By.id("ddlAccTypes")));
	acctype.selectByVisibleText("Current");
	Select debitdte = new Select(driver.findElement(By.id("ddlDebitDays")));
	debitdte.selectByVisibleText("17");
	driver.findElement(By.xpath("//*[@id=\"bankDialogue\"]/div/div/div[2]/div/div[1]/div[4]/div/button")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"bankDialogue\"]/div/div/div[3]/button[2]")).click();
	Thread.sleep(6000);
	
  // FOR MSSIDN 
//	WebElement mssidn = driver.findElement(By.id("msisdn"));
//	mssidn.click();
//	mssidn.sendKeys(phNo);
//	Thread.sleep(2000);
//	driver.findElement(By.id("SvChanges")).click();
//	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@id=\"saveOrder\"]")).click();
	//get text or copy order
	WebElement ordref = driver.findElement(By.id("idNumberLabel"));
	String id1 = ordref.getText();
	Thread.sleep(4000);
	
	//Search order
	driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[8]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[8]/ul/li/a")).click();
	Thread.sleep(2000);
	WebElement ordsearch = driver.findElement(By.id("customer-search-input"));
	
	//ordsearch.click();
	ordsearch.sendKeys(id1);
	driver.findElement(By.xpath("//*[@id=\"customer-search-index\"]/div[2]/div/label[2]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("submit-search")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"index-customers\"]/tbody/tr/td[3]/a[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"ordersTab\"]/a")).click();
	Thread.sleep(5000);
	
	Select status = new Select (driver.findElement(By.xpath("//*[@id=\"orders\"]/div[1]/table/tbody[1]/tr/td[2]/table/tbody/tr/td[11]/div")));
	status.selectByVisibleText("Status History");
	
	driver.close();
	}
	
	
	@Test (enabled = false)
	public void avsfail() throws Exception 
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://t2.silversurfer.ignitiongroup.co.za/Auth");
	
	//login
	WebElement username=driver.findElement(By.id("txtUsername"));
	WebElement password=driver.findElement(By.id("txtPassword"));
	WebElement login=driver.findElement(By.id("btnSignIn"));
	username.sendKeys("Developer");
	password.sendKeys("Pr0m3th3us!");
	login.click();
	
	//menu
	WebElement sales = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/a"));
	sales.click();
	WebElement start = driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[6]/ul/li[2]/a"));
	start.click();
	Thread.sleep(4000);
	
	//Disposition
	String ordervoice = RandomStringUtils.randomNumeric(8);
	driver.findElement(By.id("WavRecording")).sendKeys(ordervoice);
	String dialerlead = RandomStringUtils.randomAlphabetic(6);
	driver.findElement(By.id("DialerLeadReference")).sendKeys(dialerlead);
	
	//Customer Details
	WebElement details = driver.findElement(By.id("detailsTab"));
	details.click();
	Select title = new Select(driver.findElement(By.id("customerTitles")));
	title.selectByVisibleText("Mrs");
	String fname = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.id("CustomerName")).sendKeys(fname);
	String sname = RandomStringUtils.randomAlphabetic(8);
	driver.findElement(By.id("CustomerSurname")).sendKeys(sname);
	String randomNumbers = RandomStringUtils.randomNumeric(13);
	driver.findElement(By.id("IdNumber")).sendKeys(randomNumbers);
	Select education = new Select(driver.findElement(By.id("levelOfEducation")));
	education.selectByVisibleText("Advanced");
	String randomNumbe = RandomStringUtils.randomNumeric(9);
	String phNo = 0+randomNumbe;
	driver.findElement(By.id("Contact1")).sendKeys(phNo);
	WebElement email = driver.findElement(By.id("Contact4"));
	email.click();  
	Random randomGenerator = new Random();  
	int randomInt = randomGenerator.nextInt(1000);  
	email.sendKeys("order"+ randomInt +"@yopmail.com");  
	WebElement leadauth = driver.findElement(By.xpath("//*[@id=\"6\" and @value=2]"));
	leadauth.click();
	WebElement spot = driver.findElement(By.xpath("//*[@id=\"8\" and @value=2]"));
	spot.click();
	
	//Customer Address
	WebElement addressTab = driver.findElement(By.id("addressTab"));
	addressTab.click();
	Thread.sleep(2000);
	WebElement residentaddress = driver.findElement(By.id("addDeliveredTo_2"));
	residentaddress.click();
	Thread.sleep(2000);
	WebElement check = driver.findElement(By.id("chkDisclaimer"));
	check.click();
	Thread.sleep(2000);
	String search = RandomStringUtils.randomNumeric(2);
	driver.findElement(By.id("searchInputMain")).sendKeys(search);
	Thread.sleep(3000);
	WebElement searchInput = driver.findElement(By.id("searchInput"));
	searchInput.click();
	Thread.sleep(3000);
	searchInput.sendKeys(Keys.DOWN);
	searchInput.sendKeys(Keys.ENTER);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"CustomerAddSaveClearButtons\"]/input[1]")).click();
	Thread.sleep(4000);
	
	// Residential
	driver.findElement(By.xpath("//*[@id=\"addType_2\"]")).click();
	driver.findElement(By.id("chkSameAsDelivery")).click();
	Select residenctype = new Select(driver.findElement(By.id("residenceTypes")));
	residenctype.selectByVisibleText("Renting");
	Thread.sleep(2000);	
	WebElement dateselect = driver.findElement(By.id("dateAtAddress"));
	dateselect.click();
	String date = "12";
	Thread.sleep(4000);
	String month = RandomStringUtils.random(1, date);
	String day = RandomStringUtils.random(2, date);	
	String yr = "012";
	String year = RandomStringUtils.random(4, yr);
	dateselect.sendKeys(year + "-" +  month + "-" + day);
	driver.findElement(By.xpath("//*[@id=\"CustomerAddSaveClearButtons\"]/input[1]")).click();

   // Deal Tab
	driver.findElement(By.id("dealsTab")).click();
	Select campaign = new Select(driver.findElement(By.id("ddlCampaigns")));
	campaign.selectByVisibleText("Test Lead Campaign");
	Select providertype = new Select(driver.findElement(By.id("ddlDealProvider")));
	providertype.selectByVisibleText("Telco");
	Select provider = new Select(driver.findElement(By.id("ddlVasProvider")));
	provider.selectByVisibleText("Vodacom Newlines");
//	Select deal = new Select(driver.findElement(By.id("ddlDeals")));
//	deal.selectByVisibleText("@R249.00 Per Month");
	WebElement deal = driver.findElement(By.id("ddlDeals"));
	deal.click();
	Thread.sleep(2000);
	deal.sendKeys(Keys.DOWN);
	deal.sendKeys(Keys.ENTER);
	
	// Bank Details
	Thread.sleep(5000);
	String acctnumber = RandomStringUtils.randomNumeric(8);
	driver.findElement(By.name("AccNumber")).sendKeys(acctnumber);
	Select bank = new Select(driver.findElement(By.id("ddlBanks")));
	bank.selectByVisibleText("STANDARD BANK");
	Select branch = new Select(driver.findElement(By.id("ddlBranches")));
	branch.selectByVisibleText("STANDARD BANK (GENERIC)");
	String acctname = RandomStringUtils.randomAlphabetic(5);
	driver.findElement(By.name("AccHolder")).sendKeys(acctname);
	Select acctype = new Select(driver.findElement(By.id("ddlAccTypes")));
	acctype.selectByVisibleText("Current");
	Select debitdte = new Select(driver.findElement(By.id("ddlDebitDays")));
	debitdte.selectByVisibleText("17");
	for (int i = 0; i < 3; i++)
	{
	driver.findElement(By.xpath("//*[@id=\"bankDialogue\"]/div/div/div[2]/div/div[1]/div[4]/div/button")).click();
	Thread.sleep(4000);
	}
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"bankDialogue\"]/div/div/div[3]/button[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@id=\"saveOrder\"]")).click();
	Thread.sleep(6000);
	//get text or copy order
	WebElement ordref = driver.findElement(By.id("OrderReference"));
	String ord = ordref.getText();
	
	//Search order
	driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[8]/a")).click();
	driver.findElement(By.xpath("//*[@id=\"side-menu\"]/li[8]/ul/li/a")).click();
	WebElement ordsearch = driver.findElement(By.id("customer-search-input"));
	ordsearch.click();
	ordsearch.sendKeys(ord);
	driver.findElement(By.id("OrderRef")).click();
	driver.findElement(By.id("submit-search")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//*[@id=\"index-customers\"]/tbody/tr/td[3]/a[2]"));
	Thread.sleep(18000);
	driver.close();
	}

}

