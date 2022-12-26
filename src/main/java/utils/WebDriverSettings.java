package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebDriverSettings {

    WebDriver driver;

    public WebDriverSettings(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
