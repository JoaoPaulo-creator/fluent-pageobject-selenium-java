package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;


public class ResultadoPage extends BasePage {

    public ResultadoPage(WebDriver driver) {
        super(driver);        
    }

    @FindBy(id = "mensagem-resultado")
    WebElement mensagemResultadoPesquisa;

    @FindBy(id = "btn_nbusca")
    WebElement btnNovaBusca;

    public String mensagemResultadoPesquisa(){
        aguardarElementoEstarVisivel(mensagemResultadoPesquisa);
        return mensagemResultadoPesquisa.getText().trim(); 
    }

    public void clicarBtnNovaBusca(){
        clicar(btnNovaBusca);
    }



}
