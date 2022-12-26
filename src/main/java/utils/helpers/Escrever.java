package utils.helpers;

import org.openqa.selenium.WebElement;

import utils.WebDriverSettings;

public class Escrever {

    WebDriverSettings webDriverSettings;

    public Escrever(WebDriverSettings webDriverSettings) {
        this.webDriverSettings = webDriverSettings;
    }

    public void escrever(WebElement element, CharSequence assunto) {
        element.sendKeys(assunto);
    }

}
