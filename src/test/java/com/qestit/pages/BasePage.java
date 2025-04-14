package com.qestit.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    /**
     * Élément cliquez sur un élément
     */
    protected void cliquer(By locator) {
        trouverElement(locator).click();
    }

    /**
     * Trouver un élément web
     */
    protected WebElement trouverElement(By locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    /**
     * Vérifier si l'élément est affiché
     */
    protected boolean estVisible(By locator) {
        try {
            return trouverElement(locator).isDisplayed();
        } catch (TimeoutException | NoSuchElementException e) {
            return false;
        }
    }

    /**
     * Obtenir le texte d'un élément
     */
    protected String obtenirTexte(By locator) {
        return trouverElement(locator).getText();
    }

    /**
     * Attendre que l'élément soit cliquable
     */
    protected void attendreElementCliquable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    /**
     * Attendre que l'élément soit visible
     */
    protected void attendreElementVisible(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    /**
     * Saisir du texte dans un champ
     */
    protected void saisirTexte(By locator, String texte) {
        WebElement element = trouverElement(locator);
        element.clear();
        element.sendKeys(texte);
    }

    /**
     * Vérifier si l'élément existe
     */
    protected boolean elementExiste(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    /**
     * Obtenir l'attribut d'un élément
     */
    protected String obtenirAttribut(By locator, String attribut) {
        return trouverElement(locator).getAttribute(attribut);
    }

    /**
     * Faire défiler jusqu'à l'élément
     */
    protected void defilerVersElement(By locator) {
        WebElement element = trouverElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    /**
     * Attendre que la page soit chargée
     */
    protected void attendreChargementPage() {
        wait.until(webDriver -> ((JavascriptExecutor) webDriver)
                .executeScript("return document.readyState").equals("complete"));
    }

    /**
     * Cliquez sur un élément en utilisant JavaScript
     */
    protected void clickWithJS(By locator) {
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }
}
