package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage{

    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    protected void aguardarElementoEstarVisivel(WebElement element){
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(element));
    }

    protected void escrever(WebElement element, String assunto){
        element.sendKeys(assunto);
    }

    protected void clicar(WebElement botao){
        botao.click();
    }

    protected void aguardarElementoDesaparecer(WebElement element){
        try {
            new WebDriverWait(driver, 10).until(ExpectedConditions.invisibilityOfElementLocated((By) element));
            if(!element.isDisplayed()){
                System.out.println("Elemento desapareceu");
            }
        } catch (Exception e) {
            e.getMessage();
        }
        
    }
  
}