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
    WebElement campoEndereco;

    @FindBy(id = "btn_pesquisar")
    WebElement btnPesquisar;
    

    public ConsultaCepPage informarEndereco(String logradouro){
        aguardarElementoEstarVisivel(campoEndereco);        
        escrever(this.campoEndereco, logradouro);
        return this;
    }

    public ResultadoPage clicarPesquisar(){        
        clicar(this.btnPesquisar);
        return new ResultadoPage(driver);
    }
}
