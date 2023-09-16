import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleTest {

@Test
    public void SampleTest1 ()
{
    SoftAssert softAssert = new SoftAssert();
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();

    driver.get("https://demo.nopcommerce.com/");
    driver.manage().window().maximize();
    HomePage homePage = new HomePage(driver);
    homePage.ClickOnRegisterButton();
    RegisterPage registerPage = new RegisterPage(driver);
    registerPage.EnterTextOnFirstNameBox("Saddam");
    registerPage.EnterTextOnLastName("Awad");
    registerPage.EnterTextOnEmail("Saddam23@gmail.com");
    registerPage.EnterTextOnPassword("Saddam@25");
    registerPage.EnterTextOnConfirmPassword("Saddam@25");
    registerPage.ClickOnRegisterButton();

    String ExpectedResult = "Your registration completed";
    WebElement MessageResult = driver.findElement(By.className("result"));
    Assert.assertEquals(MessageResult.getText(),"Your registration completed");

    registerPage.ClickOnContinueButton();
    LoginPage loginPage = new LoginPage(driver);
    homePage.ClickOnLoginButton();
    loginPage.enterTextOnEmailBox("Saddam23@gmail.com");
    loginPage.enterTextOnPasswordBox("Saddam@25");
    loginPage.ClickOnLogin();

    WebElement SucessLogin = driver.findElement(By.xpath("//a[@class=\"ico-account\"]"));
    Assert.assertTrue(SucessLogin.isDisplayed());
    softAssert.assertAll();
    driver.quit();








}


}
