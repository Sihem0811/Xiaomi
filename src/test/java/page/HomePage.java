package page;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Config;

public class HomePage {
	@FindBy(xpath="/html/body/div[2]/header/div[1]/div/section/div/div[2]/div/div/div/nav[1]/ul/li/a")
	List<WebElement> menus;
	
	public HomePage() {
	PageFactory.initElements(Config.driver,this);
	}
	public void clickOnMenu (String menuTitle) {
		try {
			Config.attente(10);
		for (WebElement menu: menus){
			System.out.println(menu.getText());
			if(menu.getText().contains(menuTitle)) {
				menu.click();
			}
		
	}
}catch (Exception e) {
	// TODO: handle exception
}
	}

	
	
public void verif (String menuTitle) {
	String verify= Config.driver.getCurrentUrl();
	Assert.assertTrue(verify.contains(menuTitle.toLowerCase()));
	
}
}
