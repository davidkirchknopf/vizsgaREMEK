package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage {
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;

    private final By REGISTRATION_BUTTON = By.xpath("//*[@id='index_panel_id_login']/div[1]/div[1]/a/span[1]");
    private final By EN_LANGUAGE_BUTTON = By.xpath("//div[8]/a[2]");
    private final By ACCEPT_COOKIE_BUTTON = By.xpath("/html/body/div[1]/div/a[1]");
    private final By LAST_NAME_FIELD = By.xpath("//*[@id='formrow_rform_reg_lastname']/div/div[2]/span/input");
    private final By FIRST_NAME_FIELD = By.xpath("//*[@id='formrow_rform_reg_firstname']/div/div[2]/span/input");
    private final By MAIL_ADDRESS_FIELD = By.xpath("//*[@id='formrow_rform_reg_email']/div/div[2]/span/input");
    private final By PASSWORD_FIELD = By.xpath("//*[@id='formrow_rform_reg_passw']/div/div[2]/span/input");
    private final By GENDER_MALE_CHECKBOX = By.xpath("//*[@id='formrow_rform_reg_sex']/div/div[2]/span[1]/label");
    private final By DATE_OF_BIRTH_YEAR_DROPDOWN = By.xpath("//*[@id='formrow_rform_reg_birthdate']/div/div[2]/span[1]/select");
    private final By DATE_OF_BIRTH_MONTH_DROPDOWN = By.xpath("//*[@id='formrow_rform_reg_birthdate']/div/div[2]/span[2]/select");
    private final By DATE_OF_BIRTH_DAY_DROPDOWN = By.xpath("//*[@id='formrow_rform_reg_birthdate']/div/div[2]/span[3]/select");
    private final By AGREEMENT_CHECKBOX = By.xpath("//*[@id='formrow__']/div/div[2]/div/span/label");
    private final By captchaCheckBox = By.xpath(".recaptcha-checkbox-border");
    private final By captchaIFrame = By.xpath("recaptcha-anchor-label");
    private final By REGISTRATION_FINISHING_BUTTON = By.xpath("//*[@id='formrow__']/div/div[2]/a/span[2]");
    private final By LOGIN_EMAIL_FIELD = By.xpath("//input[@id='belep_emailinput']");
    private final By LOGIN_PASSWORD_FIELD = By.xpath("//div[@id='formrow_mform_login_passw']//input[1]");
    private final By LOGIN_REMEMBER_EMAIL_CHECKBOX = By.xpath("//*[@id='formrow__']/div/div[2]/span[1]/label");
    private final By LOGIN_REMEMBER_PASSWORD_CHECKBOX = By.xpath("//*[@id='formrow__']/div/div[2]/span[2]/label");
    private final By LOGIN_HIDDEN_CHECKBOX = By.xpath("//*[@id='formrow__']/div/div[2]/span[3]/label");
    private final By LOGIN_LOGIN_BUTTON = By.xpath("//*[@id='formrow__']/div/div[2]/a/span[2]");
    private final By PRIVACY_STATEMENT = By.xpath("//*[@id='index_panel_id_login']/div[1]/div[2]/ul/li[4]/a");
    private final By EXIT_FROM_PRIVACY_STATEMENT_BUTTON = By.xpath("//div[@class='box-header']/a[@href='javascript:;']");
    public final By WHOLE_TEXT_FROM_PRIVACY_STATEMENT = By.xpath("//div[@class='site-popup-content']//div[@class='box-content cf']");

    public void clickRegistrationButton() {
        driver.findElement(REGISTRATION_BUTTON).click();
    }

    public void clickEnLanguageButton() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(EN_LANGUAGE_BUTTON).click();
    }

    public void clickOnAcceptCookie() {
        driver.findElement(ACCEPT_COOKIE_BUTTON).click();
    }

    public void typeInLastNameField() {
        driver.findElement(LAST_NAME_FIELD).sendKeys("QA");
    }

    public void typeInFirstNameField() {
        driver.findElement(FIRST_NAME_FIELD).sendKeys("Tester");
    }

    public void typeEmailAddressField(String email) {
        driver.findElement(MAIL_ADDRESS_FIELD).sendKeys(email);
    }

    public void typePasswordField(String pw) {
        driver.findElement(PASSWORD_FIELD).sendKeys(pw);
    }

    public void clickGenderButtonMale() {
        driver.findElement(GENDER_MALE_CHECKBOX).click();
    }

    public void clickDateOfBirthYear(String option) {
        Select ageSelect = new Select(driver.findElement(DATE_OF_BIRTH_YEAR_DROPDOWN));
        ageSelect.selectByVisibleText(option);
    }

    public void clickDateOfBirthMonth(String option) {
        Select ageSelectMonth = new Select(driver.findElement(DATE_OF_BIRTH_MONTH_DROPDOWN));
        ageSelectMonth.selectByVisibleText(option);
    }

    public void clickDateOfBirthDay(String option) {
        Select ageSelectDay = new Select(driver.findElement(DATE_OF_BIRTH_DAY_DROPDOWN));
        ageSelectDay.selectByVisibleText(option);

    }

    public void clickAgreementCheckBox() throws InterruptedException {
        driver.findElement(AGREEMENT_CHECKBOX).click();
        Thread.sleep(5000);
    }

    /* public void clickCaptchaCheckBox() throws InterruptedException {
       WebDriverWait wait = new WebDriverWait(driver, 5);
         wait.until(ExpectedConditions.visibilityOfElementLocated(captchaCheckBox));
            driver.switchTo().frame(driver.findElement(captchaIFrame));
        WebElement haTeMeL = driver.findElement(By.xpath("/html/body/div[2]"));
        Actions builder = new Actions(driver);
        builder.moveToElement(haTeMeL, 13, 53).click().build().perform();
    }*/

    public void clickRegistrationFinishingButton() {
        List<WebElement> buttons = driver.findElements(REGISTRATION_FINISHING_BUTTON);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        buttons.get(1).click();
    }

    public void typeEmailAddressFieldLogin(String email) {
        driver.findElement(LOGIN_EMAIL_FIELD).sendKeys(email);
    }

    public void typePasswordFieldLogin(String pw) {
        driver.findElement(LOGIN_PASSWORD_FIELD).sendKeys(pw);
    }

    public void clickLoginRememberEmailCheckbox() {
        driver.findElement(LOGIN_REMEMBER_EMAIL_CHECKBOX).click();
    }

    public void clickLoginRememberPasswordCheckbox() {
        driver.findElement(LOGIN_REMEMBER_PASSWORD_CHECKBOX).click();
    }

    public void clickLoginHiddenCheckbox() {
        driver.findElement(LOGIN_HIDDEN_CHECKBOX).click();
    }

    public void clickLoginLoginButton() {
        driver.findElement(LOGIN_LOGIN_BUTTON).click();
    }

    public void clickPrivacyStatement() throws InterruptedException {
        driver.findElement(PRIVACY_STATEMENT).click();
        Thread.sleep(2000);
    }

    public void clickExitPrivacyStatement() {
        driver.findElement(EXIT_FROM_PRIVACY_STATEMENT_BUTTON).click();
    }
}
