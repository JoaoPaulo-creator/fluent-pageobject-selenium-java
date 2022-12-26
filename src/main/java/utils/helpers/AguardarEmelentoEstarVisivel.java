package utils.helpers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AguardarEmelentoEstarVisivel {

    WebDriver driver;

    public AguardarEmelentoEstarVisivel(WebDriver webDriverSettings) {
        this.driver = webDriverSettings;
    }

    // TODO: Ajustar método, para que funcionar com uma função de espera diferente
    public void estarVisivel(WebElement element) {
        new WebDriverWait((WebDriver) driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(element));
    }

}
