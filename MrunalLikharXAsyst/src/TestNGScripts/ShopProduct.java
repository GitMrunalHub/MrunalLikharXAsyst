package TestNGScripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import Generic.BaseTest;
import POM.AddtoCartPage;
import POM.HomePage;

public class ShopProduct extends BaseTest {
	
  @Test
  public void onlineShopping() throws InterruptedException {
	  
	  HomePage hp = new HomePage(driver);
	  hp.clickWomen();
	  Thread.sleep(2000);
	  hp.clickOverview(driver);
	  Thread.sleep(2000);
	  
	  AddtoCartPage acp = new AddtoCartPage(driver);
	  //acp.loadForm(driver);
	  acp.enterQuantity("2", driver);
	  Thread.sleep(2000);
	  acp.clickAddCart();
	  Thread.sleep(2000);
	  Reporter.log(acp.getTotalCost(), true);
	  Thread.sleep(2000);
	  acp.clickCheckout();
	  Thread.sleep(2000);
	  
  }
}
//form[@id='buy_block']