package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.HomePage;
import org.openqa.selenium.WebDriver;
import util.Util;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected HomePage homePage;
    protected String email = "qasetesting@gmail.com";
    protected String pw = "QA123456";


    public WebDriver getDriver() {
        return driver;
    }

    @BeforeEach
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        //System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        //options.setExperimentalOption("useAutomationExtension", false);
        //options.addArguments("disable-infobars");
        //options.addArguments("--disable-extensions");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        //options.addArguments("--single-process");

        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 2);
        driver.get("http://myvip.com/index.php?");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
        homePage.clickEnLanguageButton();
    }

    public void doLogin() {
        Util util = new Util(driver, wait);
        homePage.typeEmailAddressFieldLogin(email);
        homePage.typePasswordFieldLogin(pw);
        homePage.clickLoginRememberEmailCheckbox();
        homePage.clickLoginRememberPasswordCheckbox();
        homePage.clickLoginHiddenCheckbox();
        homePage.clickLoginLoginButton();
        util.clickOnHANDLE_TOO_MANY_LOGIN();
    }

    @AfterEach
    public void tearDown() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
