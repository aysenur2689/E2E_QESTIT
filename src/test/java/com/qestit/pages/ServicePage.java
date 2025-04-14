package com.qestit.pages;

import com.qestit.locators.ServicePageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ServicePage extends BasePage {
    
    public ServicePage(WebDriver driver) {
        super(driver);
    }

    public void naviguerVersAccueil() {
        driver.get("https://qestit.com/fr/");
        attendreChargementPage();
    }

    public void cliquerSurServices() {
        attendreElementCliquable(ServicePageLocators.MENU_SERVICES);
        cliquer(ServicePageLocators.MENU_SERVICES);
    }

    public void cliquerSurTestLogiciel() {
        attendreElementCliquable(ServicePageLocators.LIEN_TEST_LOGICIEL);
        cliquer(ServicePageLocators.LIEN_TEST_LOGICIEL);
    }

    public boolean verifierTitreTestLogiciel() {
        attendreElementVisible(ServicePageLocators.TITRE_TEST_LOGICIEL);
        return estVisible(ServicePageLocators.TITRE_TEST_LOGICIEL);
    }

    public void cliquerSurAutomatisationTests() {
        try {
            Thread.sleep(2000); // Add a small wait
            clickWithJS(By.xpath(ServicePageLocators.LIEN_AUTOMATISATION_TESTS));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Interrupted while waiting", e);
        }
    }
}
