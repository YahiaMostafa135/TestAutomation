package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    private By title=By.className("title");
    private By addToCart=By.id("add-to-cart-sauce-labs-backpack");
    private By cartButton=By.className("shopping_cart_link");
    private By productLabel=By.id("item_4_img_link");
    private By burgerMenu=By.id("react-burger-menu-btn");
    private By logoutButton=By.id("logout_sidebar_link");
    public ProductPage(WebDriver driver){
        this.driver=driver;
    }
    public String getTitle(){
        return driver.findElement(title).getText();
    }
    public void clickOnAddToCartButton(){
        driver.findElement(addToCart).click();
    }
    public CartPage clickOnCartButton(){
        driver.findElement(cartButton).click();
        return new CartPage(driver);

    }
    public ProductDetailsPage clickOnProductLabel(){
        driver.findElement(productLabel).click();
        return new ProductDetailsPage(driver);
    }
    public LoginPage clickOnLogoutButton(){
        driver.findElement(burgerMenu).click();
        driver.findElement(logoutButton).click();
        return new LoginPage(driver);
    }

}
