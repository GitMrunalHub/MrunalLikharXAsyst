package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Generic.TakeSnapshot;

public class BaseTest implements Constant{
	
	public WebDriver driver;
	
	
	@BeforeSuite
	public void launchApp() throws InterruptedException {
	
		
		System.setProperty(chromekey, chromevalue);
		driver = new ChromeDriver();
		driver.get(" http://automationpractice.com/index.php");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	
	@AfterSuite
	public void cloaseapp(ITestContext r)
	{
		String name = r.getName();
		
		TakeSnapshot.getphoto(driver,snapshots,name);
		
		driver.close();
	}
	

}
