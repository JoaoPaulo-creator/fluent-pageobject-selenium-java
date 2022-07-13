
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.ConsultaCepPage;

import java.util.concurrent.TimeUnit;


public class TesteConsultaCepCorreios {

    WebDriver driver;
    WebDriverWait wait;


    @Before
    public void setupTeste(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/chromedriver.exe");

        driver = new ChromeDriver();
        driver.navigate().to("https://buscacepinter.correios.com.br/app/endereco/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
    }


    @Test
    public void deveInformarUmEndereco(){
        ConsultaCepPage consultaCepPage = new ConsultaCepPage(driver);

        String mensagemResultadoPesquisaConsultaCep = 
                consultaCepPage.informarEndereco("Rua Professor Gabizo - até 130 - lado par")
                .clicarPesquisar()
                .mensagemResultadoPesquisa();

        assertEquals(mensagemResultadoPesquisaConsultaCep, "Resultado da Busca por Endereço ou CEP");
    }

    @After
    public void killDriver(){
       driver.close();
       driver.quit();
    }



}
