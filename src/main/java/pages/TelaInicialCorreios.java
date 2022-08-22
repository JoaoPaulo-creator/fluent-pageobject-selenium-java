package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.BasePage;

public class TelaInicialCorreios extends BasePage{

    public TelaInicialCorreios(WebDriver driver) {
        super(driver);        
    }

    @FindBy(id = "btnCookie")
    protected WebElement btnCookie;

    public void clicarBtnCookie(){
        aguardarElementoEstarVisivel(btnCookie);
        clicar(btnCookie);
    }
    
}
