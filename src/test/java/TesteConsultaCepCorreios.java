
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import pages.ConsultaCepPage;
import setupWebDriver.SetupWebDriver;


public class TesteConsultaCepCorreios extends SetupWebDriver {

    @Test
    public void deveInformarUmEndereco(){
        ConsultaCepPage consultaCepPage = new ConsultaCepPage(driver);

        String mensagemResultadoPesquisaConsultaCep = 
                consultaCepPage.informarEndereco("Rua Professor Gabizo - até 130 - lado par")
                .clicarPesquisar()
                .mensagemResultadoPesquisa();

        assertEquals(mensagemResultadoPesquisaConsultaCep, "Resultado da Busca por Endereço ou CEP");
    }

}
