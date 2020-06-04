package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic.Mousehover;

public class HomePage {
	
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement SignOut;
	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	
	@FindBy(xpath="//a[@title='Faded Short Sleeve T-shirts']/../a/../div[1]/..")
	private WebElement item1;
	
	@FindBy(xpath="//div[@class='product-image-container']/a[@title='Faded Short Sleeve T-shirts']/../a[2]/span[.='Quick view']")
	private WebElement Qview;
	
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver,this);
	}
	
	public void clickSignOut() {
		SignOut.click();
			
		}
	
	public void clickWomen() {
		women.click();
			
		}
	
	public void clickOverview(WebDriver driver) throws InterruptedException {
		Mousehover.performMouseHover(driver, item1);
		Thread.sleep(2000);
		Qview.click();
	}


}
