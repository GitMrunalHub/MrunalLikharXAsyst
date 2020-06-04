package TestNGScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import Generic.BaseTest;
import Generic.Excel;
import POM.CreateAccountPage;
import POM.HomePage;
import POM.LoginPage;

public class CreateAccount extends BaseTest {
  
	@Test(enabled = false)
  public void createUser() throws InterruptedException {
		
		LoginPage l =new LoginPage(driver);
		l.clickSignIn();
		Thread.sleep(3000);
		String EmailID =Excel.getExcelData(excelpath, "Sheet1", 0, 0);
		l.EmailIdTxtbx(EmailID);
		Thread.sleep(2000);
		l.clickCreatebtn();
		Thread.sleep(2000);
		
		CreateAccountPage cap = new CreateAccountPage(driver);
		//cap.selectTitle();
		String fname =Excel.getExcelData(excelpath, "Sheet1", 1, 0);
		cap.fnTxtbx(fname);
		Thread.sleep(2000);
		String lname =Excel.getExcelData(excelpath, "Sheet1", 2, 0);
		cap.lnTxtbx(lname);
		Thread.sleep(2000);
		String pwd =Excel.getExcelData(excelpath, "Sheet1", 3, 0);
		cap.pwdTxtbx(pwd);
		Thread.sleep(2000);
	  
		/*String afname =Excel.getExcelData(excelpath, "Sheet1", 1, 0);
		cap.afnTxtbx(afname);
		Thread.sleep(2000);
		String alname =Excel.getExcelData(excelpath, "Sheet1", 2, 0);
		cap.alnTxtbx(alname);
		Thread.sleep(2000);*/
		String address1 =Excel.getExcelData(excelpath, "Sheet1", 4, 0);
		cap.add1Txtbx(address1);
		Thread.sleep(2000);
		String city =Excel.getExcelData(excelpath, "Sheet1", 5, 0);
		cap.cityTxtbx(city);
		Thread.sleep(2000);
		String state =Excel.getExcelData(excelpath, "Sheet1", 6, 0);
		cap.selectState(state);
		Thread.sleep(2000);
		String zcode =Excel.getExcelData(excelpath, "Sheet1", 7, 0);
		cap.zipTxtbx(zcode);
		Thread.sleep(2000);
		String mno =Excel.getExcelData(excelpath, "Sheet1", 8, 0);
		cap.mobileTxtbx(mno);
		Thread.sleep(2000);
		cap.clickRegister();
		Thread.sleep(2000);
		
		String exp_usr = Excel.getExcelData(excelpath, "Sheet1", 9, 0);
		WebDriverWait wait=new WebDriverWait(driver, 3);
		String actuser = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "//a[@title='View my customer account']/span"))).getText();
		//String act_usr = actuser.getText();
		Assert.assertEquals(exp_usr, actuser);
		
		HomePage hp = new HomePage (driver);
		hp.clickSignOut();
  }
}
