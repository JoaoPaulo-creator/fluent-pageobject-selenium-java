package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;
import utils.WebDriverSettings;
import utils.helpers.AguardarEmelentoEstarVisivel;

public class ResultadoPage extends BasePage {

    public ResultadoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "mensagem-resultado")
    WebElement mensagemResultadoPesquisa;

    @FindBy(id = "btn_nbusca")
    WebElement btnNovaBusca;

    AguardarEmelentoEstarVisivel aguardarElemento = new AguardarEmelentoEstarVisivel(driver);

    public String mensagemResultadoPesquisa() {
        aguardarElemento.estarVisivel(mensagemResultadoPesquisa);
        return mensagemResultadoPesquisa.getText().trim();
    }

    public void clicarBtnNovaBusca() {
        clicar(btnNovaBusca);
    }

}
