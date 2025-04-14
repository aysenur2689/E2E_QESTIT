package com.qestit.locators;

import org.openqa.selenium.By;

public class ServicePageLocators {
    public static final By MENU_SERVICES = By.xpath("//button[contains(text(),'Services')]");
    public static final By LIEN_TEST_LOGICIEL = By.xpath("//a[@id='1']//p[@class='text-white h4'][normalize-space()='Test Logiciel']");
    public static final By TITRE_TEST_LOGICIEL = By.xpath("//h1[@class='text-white']");
    public static final String LIEN_AUTOMATISATION_TESTS = "//a[contains(.,'Automatisation des tests')]";
}
