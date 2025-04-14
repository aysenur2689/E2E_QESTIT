package com.qestit.steps;

import com.qestit.hooks.Hooks;
import com.qestit.pages.ServicePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;

public class ServiceSteps {
    private WebDriver driver;
    private ServicePage servicePage;

    public ServiceSteps() {
        this.driver = Hooks.getDriver();
        this.servicePage = new ServicePage(driver);
    }

    @Given("je suis sur la page d'accueil de QESTIT")
    public void je_suis_sur_la_page_daccueil() {
        servicePage.naviguerVersAccueil();
    }

    @When("je clique sur le menu Services")
    public void je_clique_sur_le_menu_services() {
        servicePage.cliquerSurServices();
    }

    @When("je clique sur l'option Test Logiciel")
    public void je_clique_sur_test_logiciel() {
        servicePage.cliquerSurTestLogiciel();
    }

    @Then("je dois voir le titre Test Logiciel")
    public void je_dois_voir_le_titre_test_logiciel() {
        assertTrue("Le titre Test Logiciel n'est pas affiché", servicePage.verifierTitreTestLogiciel());
    }

    @When("je clique sur Automatisation des tests")
    public void je_clique_sur_automatisation_des_tests() {
        servicePage.cliquerSurAutomatisationTests();
    }
}
