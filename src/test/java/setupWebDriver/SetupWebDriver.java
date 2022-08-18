package setupWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public abstract class SetupWebDriver {

    protected WebDriver driver;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://buscacepinter.correios.com.br/app/endereco/index.php");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--incognito");

    }

    @AfterEach
    void teardown() {
        driver.quit();
    }

//    @Before
//    public void setupTeste(){
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/webdriver/" + getOperatingSystem());
//
//        driver = new ChromeDriver();
//        driver.navigate().to("https://buscacepinter.correios.com.br/app/endereco/index.php");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--incognito");
//    }
//
//    @After
//    public void tearDown(){
//        driver.close();
//        driver.quit();
//    }
//
//    private String getOperatingSystem() {
//        String operatingSystem = System.getProperty("os.name");
//        String webDriver = "";
//
//        if(operatingSystem.equals("Linux")){
//            webDriver = "chromedriver";
//        }
//        if(operatingSystem.equals("Windows")){
//            webDriver = "chromedriver.exe";
//        }
//        return webDriver;
//    }


}
