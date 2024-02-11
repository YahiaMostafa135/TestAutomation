package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By productTitleInCart=By.id("item_4_title_link");
    private By removeButton=By.id("remove-sauce-labs-backpack");
    public CartPage(WebDriver driver){
        this.driver=driver;
    }
    public String getProductTitleInCart(){
        return driver.findElement(productTitleInCart).getText();
    }
    public void clickOnRemoveButton(){
        driver.findElement(removeButton).click();

    }
    public int getSizeofAddedProduct(){
        return driver.findElements(productTitleInCart).size();
    }
}
