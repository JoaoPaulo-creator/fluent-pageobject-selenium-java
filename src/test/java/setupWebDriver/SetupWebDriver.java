package setupWebDriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class SetupWebDriver {

    protected WebDriver driver;

    @Before
    public void setupTeste(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/" + getOperatingSystem());

        driver = new ChromeDriver();
        driver.navigate().to("https://buscacepinter.correios.com.br/app/endereco/index.php");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
    }

    @After
    public void tearDown(){
        driver.close();
        driver.quit();
    }

    private String getOperatingSystem() {
        String operatingSystem = System.getProperty("os.name");
        String webDriver = "";

        if(operatingSystem.equals("Linux")){
            webDriver = "chromedriver";
        }
        if(operatingSystem.equals("Windows")){
            webDriver = "chromedriver.exe";
        }
        return webDriver;
    }


}
