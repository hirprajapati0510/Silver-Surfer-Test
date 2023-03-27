package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import com.testng.selenium.V1.login;
import com.testng.selenium.V1.Logout;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.Test;

public class scenario 
{  
   @Test
   public void testcase()	throws Exception
   {
    //public static void mainString[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	//WebDriver driver = new ChromeDriver();
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");

	WebDriver driver = new ChromeDriver(options);
	//maximize window
	driver.manage().window().maximize();
	driver.get("http://t2.silversurfer.ignitiongroup.co.za/");
	
	//login logedin = new login(driver);
	//logedin.Logintoportal();
	Thread.sleep(5000);
    Logout logout = new Logout(driver);
    logout.clickLogout();
    driver.quit();
	}
}
