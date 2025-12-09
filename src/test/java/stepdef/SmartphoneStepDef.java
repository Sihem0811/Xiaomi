package stepdef;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.SmartphonePage;

public class SmartphoneStepDef {
	
	
	@Given("L utilisateur est sur la page du smartphone")
	public void l_utilisateur_est_sur_la_page_du_smartphone() {
		Config.ConfigChrome();
		Config.maximiszeWindow();
		String url="https://www.xiaomistore.tn/smartphones/";
		Config.driver.get(url);
	 
	}

	@When("L utilisateur clique sur le produit {string}")
	public void l_utilisateur_clique_sur_le_produit(String menuTitle) {
		SmartphonePage page = new SmartphonePage();
		page.clickOnProduct(menuTitle);
		
		
	}

	@Then("L utilisateur est dirige vers la page du smartphones {string}")
	public void l_utilisateur_est_dirige_vers_la_page_du_smartphones(String nn) {
		SmartphonePage page = new SmartphonePage();
		page.verifproduct(nn);





}
}
