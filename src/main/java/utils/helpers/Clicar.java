package utils.helpers;

import org.openqa.selenium.WebElement;
import utils.WebDriverSettings;

public class Clicar {

    protected WebDriverSettings webDriverSettings;

    public Clicar(WebDriverSettings webDriverSettings) {
        this.webDriverSettings = webDriverSettings;
    }

    public void clicarElemento(WebElement button) {
        button.click();
    }

}
