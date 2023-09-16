package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    /*** Page Elements Locators**/
    WebDriver driver;
    By loginEmailTextBox = By.xpath("//input[@class=\"email\"]");
    By loginPasswordTextBox = By.xpath("//input[@name=\"Password\"]");
    By loginButton = By.xpath("//button[@class=\"button-1 login-button\"]");

    /*** Page Constructor ***/

    public  LoginPage(WebDriver driver)
    {
        this.driver= driver;
    }


    /***Page Functions ***/

    public void enterTextOnEmailBox(String text)
    {
        driver.findElement(loginEmailTextBox).sendKeys(text);
    }
    public void enterTextOnPasswordBox (String text)
    {
        driver.findElement(loginPasswordTextBox).sendKeys(text);
    }
    public void ClickOnLogin ()
    {
        driver.findElement(loginButton).click();
    }


}
