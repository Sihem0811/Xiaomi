package stepdef;

import helper.Config;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.HomePage;

public class HomeStepDef {
	@Given("L utilisateur dans la page d acceuil")
	public void l_utilisateur_dans_la_page_d_acceuil() {
		Config.ConfigChrome();
		Config.maximiszeWindow();
		String url="https://www.xiaomistore.tn/";
		Config.driver.get(url);
	
	}

	@When("L utilisateur clique sur le menu {string}")
	public void l_utilisateur_clique_sur_le_menu(String menuTitle) {
		HomePage page =new HomePage();
		page.clickOnMenu(menuTitle);
	
	}

	@Then("L utilisateur est dirige vers la page {string}")
	public void l_utilisateur_est_dirige_vers_la_page(String menuTitle) {
		HomePage page = new HomePage();
		page.verif(menuTitle);
	  
	}




}
