package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class ConsultaCepPage extends BasePage {

    public ConsultaCepPage(WebDriver driver) {
        super(driver);        
    }

    @FindBy(id = "endereco")
    protected WebElement campoEndereco;

    @FindBy(id = "btn_pesquisar")
    protected WebElement btnPesquisar;

    @FindBy(className = "logo")
    protected WebElement logoCorreios;
    

    public ConsultaCepPage informarEndereco(String logradouro){
        aguardarElementoEstarVisivel(campoEndereco);        
        escrever(this.campoEndereco, logradouro);
        return this;
    }

    public ResultadoPage clicarPesquisar(){        
        clicar(this.btnPesquisar);
        return new ResultadoPage(driver);
    }

    public TelaInicialCorreios clicarLogoCorreios(){
        aguardarElementoEstarVisivel(logoCorreios);
        clicar(logoCorreios);
        return new TelaInicialCorreios(driver);
    }
}
