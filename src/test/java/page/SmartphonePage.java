package page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class SmartphonePage {
	@FindBy(xpath="/html/body/div[1]/div[5]/div/div/section/div/div/div/div[1]/div/h2\r\n")
	List<WebElement> menus;
	
	@FindBy(xpath="/html/body/div[2]/div[4]/div[2]/div/div/div/section[1]/div/div[2]/div/section/div/div/div/div[1]/div/h2")
	WebElement verifproduct;
	
	
	public SmartphonePage(){
		PageFactory.initElements(Config.driver, this);
	}
		public void clickOnProduct (String productTitle) {
			try {
			for (WebElement menu: menus){
				if(menu.getText().contains(productTitle)) {
					menu.click();
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		}
		public void verifproduct (String productTitle) {
		Assert.assertEquals(productTitle, verifproduct.getText());

}
}
