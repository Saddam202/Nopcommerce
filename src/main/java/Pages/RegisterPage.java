package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    /***Elements locators ***/
    WebDriver driver;
    By FirstNameTextBox = By.id("FirstName");
    By LastNameTextBox = By.id("LastName");
    By EmailTextBox = By.id("Email");
    By PasswordTextBox = By.xpath("//input[@type=\"password\"]");
    By ConfirmPasswordTextBox = By.xpath("//input[@name=\"ConfirmPassword\"]");
    By RegisterButton =By.id("register-button");
    By ContinueButton = By.xpath("//a[@class=\"button-1 register-continue-button\"]");

    /***Page Constructor**/

    public  RegisterPage (WebDriver driver)
    {
        this.driver=driver;
    }

    /***Page Functions ***/

    public void EnterTextOnFirstNameBox (String text)
    {
        driver.findElement(FirstNameTextBox).sendKeys(text);
    }

    public void EnterTextOnLastName (String text)
    {
        driver.findElement(LastNameTextBox).sendKeys(text);
    }

    public void EnterTextOnEmail (String text)
    {
        driver.findElement(EmailTextBox).sendKeys(text);
    }

    public void EnterTextOnPassword (String text)
    {
        driver.findElement(PasswordTextBox).sendKeys(text);
    }

    public void EnterTextOnConfirmPassword (String text)
    {
        driver.findElement(ConfirmPasswordTextBox).sendKeys(text);
    }

    public void ClickOnRegisterButton ()
    {
        driver.findElement(RegisterButton).click();

    }

    public void ClickOnContinueButton ()
    {
        driver.findElement(ContinueButton).click();
    }


}
