package TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

import Generic.BaseTest;
import Generic.Excel;
import POM.LoginPage;

public class LoginUser extends BaseTest {
  @BeforeClass
  public void loginApp() throws InterruptedException {
	  
	    LoginPage l =new LoginPage(driver);
		l.clickSignIn();
		Thread.sleep(3000);
		
		String EmailID =Excel.getExcelData(excelpath, "Sheet1", 0, 0);
		l.enterEmailId(EmailID);
		Thread.sleep(2000);
		String password =Excel.getExcelData(excelpath, "Sheet1", 3, 0);
		l.enterpswd(password);
		Thread.sleep(2000);
		l.clickSubmitbtn();
		
		String exp_usr = Excel.getExcelData(excelpath, "Sheet1", 9, 0);
		WebDriverWait wait=new WebDriverWait(driver, 3);
		String actuser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[@title='View my customer account']/span"))).getText();
		//String act_usr = actuser.getText();
		Assert.assertEquals(exp_usr, actuser);
		Reporter.log("User is logged in", true);
  }
}
