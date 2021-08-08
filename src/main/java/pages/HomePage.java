package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage
{
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    private WebDriver driver;

    private final By registrationButton = By.xpath("//*[@id='index_panel_id_login']/div[1]/div[1]/a/span[1]");
    private final By enLanguageButton = By.xpath("//div[8]/a[2]");
    private final By ACCEPT_COOKIE_BUTTON = By.xpath("/html/body/div[1]/div/a[1]");
    private final By lastNameField = By.xpath("//*[@id='formrow_rform_reg_lastname']/div/div[2]/span/input");
    private final By firstNameField = By.xpath("//*[@id='formrow_rform_reg_firstname']/div/div[2]/span/input");
    private final By mailAddressField = By.xpath("//*[@id='formrow_rform_reg_email']/div/div[2]/span/input");
    private final By passwordField = By.xpath("//*[@id='formrow_rform_reg_passw']/div/div[2]/span/input");
    private final By genderButtonMale = By.xpath("//*[@id='formrow_rform_reg_sex']/div/div[2]/span[1]/label");
    private final By dateOfBirthYear = By.xpath ("//*[@id='formrow_rform_reg_birthdate']/div/div[2]/span[1]/select");
    private final By dateOfBirthMonth = By.xpath("//*[@id='formrow_rform_reg_birthdate']/div/div[2]/span[2]/select");
    private final By dateOfBirthDay = By.xpath("//*[@id='formrow_rform_reg_birthdate']/div/div[2]/span[3]/select");
    private final By agreementCheckBox = By.xpath("//*[@id='formrow__']/div/div[2]/div/span/label");
    private final By captchaCheckBox = By.xpath(".recaptcha-checkbox-border");
    private final By captchaIFrame = By.xpath("recaptcha-anchor-label");
    private final By registrationFinishingButton = By.xpath("//*[@id='formrow__']/div/div[2]/a/span[2]");
    private final By loginEmailField = By.xpath("//input[@id='belep_emailinput']");
    private final By loginPasswordField = By.xpath("//div[@id='formrow_mform_login_passw']//input[1]");
    private final By loginRememberEmailCheckbox = By.xpath("//*[@id='formrow__']/div/div[2]/span[1]/label");
    private final By loginRememberPasswordCheckbox = By.xpath("//*[@id='formrow__']/div/div[2]/span[2]/label");
    private final By loginHiddenCheckbox = By.xpath("//*[@id='formrow__']/div/div[2]/span[3]/label");
    private final By loginLoginButton = By.xpath("//*[@id='formrow__']/div/div[2]/a/span[2]");
    private final By privacyStatement = By.xpath("//*[@id='index_panel_id_login']/div[1]/div[2]/ul/li[4]/a");
    private final By exitPrivacyStatement = By.xpath("//div[@class='box-header']/a[@href='javascript:;']");
    public  final By wholeOfPrivacyStatement = By.xpath("//div[@class='site-popup-content']//div[@class='box-content cf']");

    public void clickRegistrationButton(){
        driver.findElement(registrationButton).click();
    }
    public void clickEnLanguageButton(){
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(enLanguageButton).click();
    }
    public void clickOnAcceptCookie(){
        driver.findElement(ACCEPT_COOKIE_BUTTON).click();
    }
    public void typeInLastNameField(){
        driver.findElement(lastNameField).sendKeys("QA");
    }
    public void typeInFirstNameField(){
        driver.findElement(firstNameField).sendKeys("Tester");
    }
    public void typeEmailAddressField(String email){
        driver.findElement(mailAddressField).sendKeys(email);
}
    public void typePasswordField(String pw){
        driver.findElement(passwordField).sendKeys(pw);
    }
    public void clickGenderButtonMale(){
        driver.findElement(genderButtonMale).click();
    }
    public void clickDateOfBirthYear(String option){
        Select ageSelect = new Select(driver.findElement(dateOfBirthYear));
        ageSelect.selectByVisibleText(option);
    }
    public void clickDateOfBirthMonth(String option){
        Select ageSelectMonth = new Select(driver.findElement(dateOfBirthMonth));
        ageSelectMonth.selectByVisibleText(option);
    }
    public void clickDateOfBirthDay(String option) throws InterruptedException {
        Select ageSelectDay = new Select(driver.findElement(dateOfBirthDay));
        ageSelectDay.selectByVisibleText(option);

    }
    public void clickAgreementCheckBox() throws InterruptedException {
        driver.findElement(agreementCheckBox).click();
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

    public void clickRegistrationFinishingButton() throws InterruptedException {
        List<WebElement> buttons = driver.findElements(registrationFinishingButton);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        buttons.get(1).click();
    }
    public void typeEmailAddressFieldLogin(String email){
        driver.findElement(loginEmailField).sendKeys(email);
    }
    public void typePasswordFieldLogin(String pw){
        driver.findElement(loginPasswordField).sendKeys(pw);
    }
    public void clickLoginRememberEmailCheckbox(){
        driver.findElement(loginRememberEmailCheckbox).click();
    }
    public void clickLoginRememberPasswordCheckbox(){
        driver.findElement(loginRememberPasswordCheckbox).click();
    }
    public void clickLoginHiddenCheckbox(){
        driver.findElement(loginHiddenCheckbox).click();
    }
    public void clickLoginLoginButton(){
        driver.findElement(loginLoginButton).click();
    }
    public void clickPrivacyStatement() throws InterruptedException {
        driver.findElement(privacyStatement).click();
        Thread.sleep(2000);
    }
    public void clickExitPrivacyStatement(){
        driver.findElement(exitPrivacyStatement).click();
    }
}
