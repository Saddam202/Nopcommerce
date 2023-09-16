package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
   WebDriver driver;
    /***Elements locators***/
    By RegisterButton =By.xpath("//a[@class=\"ico-register\"]");
    By loginButton = By.xpath("//a[@class=\"ico-login\"]");
    By SearchTextBox = By.id("small-searchterms");
    By SearchButton =By.xpath("//button[@class=\"button-1 search-box-button\"]");


    /***Page Constructor ***/

    public  HomePage (WebDriver driver)
    {
        this.driver =driver;

    }

    /***Page Functions***/

    public void ClickOnRegisterButton ()
    {
        driver.findElement(RegisterButton).click();
    }
    public void ClickOnLoginButton ()
    {
        driver.findElement(loginButton).click();
    }

    public void EnterTextInSearchTextBox (String text)
    {
        driver.findElement(SearchTextBox).sendKeys(text);
    }

    public void ClickOnSearchButton ()
    {
        driver.findElement(SearchButton).click();
    }

}
