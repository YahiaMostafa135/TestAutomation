package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private By userNameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");




    public void setUserName(String userName) {
        driver.findElement(userNameField).sendKeys(userName);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public ProductPage clickOnLoginButton() {
        driver.findElement(loginButton).click();
        return new ProductPage(driver);
    }
    public String  getButtonsId(){
        return driver.findElement(loginButton).getAttribute("id");
    }
}
