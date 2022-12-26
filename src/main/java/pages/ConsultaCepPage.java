package pages;

import org.omg.CORBA.BAD_CONTEXT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import utils.BasePage;
import utils.WebDriverSettings;
import utils.helpers.AguardarEmelentoEstarVisivel;
import utils.helpers.Clicar;
import utils.helpers.Escrever;

public class ConsultaCepPage extends BasePage {

    @FindBy(id = "endereco")
    protected WebElement campoEndereco;

    @FindBy(id = "btn_pesquisar")
    protected WebElement btnPesquisar;

    @FindBy(className = "logo")
    protected WebElement logoCorreios;

    public ConsultaCepPage(WebDriver driver) {
        super(driver);
    }

    WebDriverSettings webDriverSettings = new WebDriverSettings(driver);

    Clicar clicar = new Clicar(webDriverSettings);
    AguardarEmelentoEstarVisivel aguardarElemento = new AguardarEmelentoEstarVisivel(driver);
    Escrever escrever = new Escrever(webDriverSettings);

    public ConsultaCepPage informarEndereco(String logradouro) {
        this.aguardarElemento.estarVisivel(btnPesquisar);
        this.escrever.escrever(campoEndereco, logradouro);
        return this;
    }

    public ResultadoPage clicarPesquisar() {
        this.clicar.clicarElemento(btnPesquisar);
        return new ResultadoPage(driver);
    }

    public TelaInicialCorreios clicarLogoCorreios() {
        this.aguardarElemento.estarVisivel(logoCorreios);
        this.clicar.clicarElemento(logoCorreios);
        return new TelaInicialCorreios(driver);
    }
}
