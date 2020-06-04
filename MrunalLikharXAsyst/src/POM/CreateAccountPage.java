package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Listbox;

public class CreateAccountPage {
	
	@FindBy(id="id_gender2")
	private WebElement title;
	
	@FindBy(id="customer_firstname")
	private WebElement fn;
	
	@FindBy(id="customer_lastname")
	private WebElement ln;
	
	@FindBy(id="passwd")
	private WebElement pwd;
	
	@FindBy(id="firstname")
	private WebElement afn;
	
	@FindBy(id="lastname")
	private WebElement aln;
	
	@FindBy(id="address1")
	private WebElement add1;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="id_state")
	private WebElement state;
	
	@FindBy(id="postcode")
	private WebElement zip;
	
	@FindBy(id="phone_mobile")
	private WebElement mobile;
	
	@FindBy(id="submitAccount")
	private WebElement register;
	
	public CreateAccountPage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void selectTitle() {
		title.click();
	}
	
	public void fnTxtbx(String fname) {
		fn.sendKeys(fname);
	}
	
	
	public void lnTxtbx(String lname) {
		ln.sendKeys(lname);
	}
	
	public void pwdTxtbx(String password) {
		pwd.sendKeys(password);
	}
	
	public void afnTxtbx(String fname) {
		afn.sendKeys(fname);
	}
	
	
	public void alnTxtbx(String lname) {
		aln.sendKeys(lname);
	}
	
	public void add1Txtbx(String adl1) {
		add1.sendKeys(adl1);
	}
	
	public void cityTxtbx(String ct) {
		city.sendKeys(ct);
	}
	
	public void selectState(String text) throws InterruptedException {
		
		Listbox.dropdown(state, text);
			
	}
	
	public void zipTxtbx(String code) {
		zip.sendKeys(code);
	}
	
	public void mobileTxtbx(String pno) {
		mobile.sendKeys(pno);
	}
	
	public void clickRegister() {
		register.click();;
	}
	

}
