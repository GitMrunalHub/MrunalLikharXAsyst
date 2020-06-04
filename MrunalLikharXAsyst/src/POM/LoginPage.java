package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="//a[contains(.,'Sign in')]")
	private WebElement SignIn  ;
	
	@FindBy(id = "email_create")
	private WebElement EmailId;
	
	@FindBy(id="SubmitCreate")
	private WebElement createBtn;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="passwd")
	private WebElement pswd;
	
	@FindBy(id="SubmitLogin")
	private WebElement sbtBtn;
	
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void clickSignIn() {
		SignIn.click();
			
		}
	
	public void EmailIdTxtbx(String EmailID) {
		EmailId.sendKeys(EmailID);
	}
	
	public void clickCreatebtn() {
		createBtn.click();
	}
	
	public void enterEmailId(String EmailID) {
		email.sendKeys(EmailID);
	}
	
	public void enterpswd(String pd) {
		pswd.sendKeys(pd);
	}
	
	public void clickSubmitbtn() {
		sbtBtn.click();
	}

}
