package irparatelainicial;

import org.junit.jupiter.api.Test;

import pages.ConsultaCepPage;
import setupWebDriver.SetupWebDriver;

public class DeveIrParaTelaInicial extends SetupWebDriver{

    @Test
    public void DeveIrParaTelaInicialDoSiteDosCorreios(){
        ConsultaCepPage consultaCepPage = new ConsultaCepPage(driver);
        
        consultaCepPage.clicarLogoCorreios().clicarBtnCookie();
    }
    
}
