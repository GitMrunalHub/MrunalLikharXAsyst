package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Generic.Mousehover;

public class AddtoCartPage {
	
	@FindBy(xpath="//form[@id='buy_block']")
	private WebElement formCart;
	
	@FindBy(xpath="//form[@id='buy_block']/div/div[2]/p[@id='quantity_wanted_p']/input[@id='quantity_wanted']")
	private WebElement quantity;
	
	@FindBy(xpath="//p[@id='add_to_cart']/button/span")
	private WebElement addCart;
	
	@FindBy(xpath="//div[@class='layer_cart_row']/span[@class='ajax_block_cart_total']")
	private WebElement totalCost;
	
	@FindBy(xpath="//a[@title='Proceed to checkout']/span")
	private WebElement checkout;

	public AddtoCartPage(WebDriver driver){
	PageFactory.initElements(driver,this);

	}
	
	public void loadForm(WebDriver driver) {
	
	WebDriverWait wait_form = new WebDriverWait(driver, 3);
	  wait_form.until(ExpectedConditions.visibilityOf(formCart));
	  driver.switchTo().frame(formCart);
	  
	}
	
	public void enterQuantity(String q, WebDriver driver) throws InterruptedException {
		Mousehover.performMouseHover(driver, quantity);
		Thread.sleep(2000);
		quantity.sendKeys(q);
	}
		
	public void clickAddCart() {
			addCart.click();
				
			}
	
	public String getTotalCost() {
		return(totalCost.getText());
			
		}
	
	public void clickCheckout() {
		checkout.click();
			
		}
	}

