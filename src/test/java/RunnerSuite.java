import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import consultacep.DeveConsultarCepNoSiteDosCorreios;
import irparatelainicial.DeveIrParaTelaInicial;

@SelectClasses({
    DeveConsultarCepNoSiteDosCorreios.class,
    DeveIrParaTelaInicial.class
})


@Suite
public class RunnerSuite {
    
}
