package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage {
    private WebDriver driver;
    private By prodInternalLabel= By.xpath("//div[@class='inventory_details_name large_size']");
    public ProductDetailsPage(WebDriver driver){
        this.driver=driver;
    }



   public String getProductTitle(){
        return driver.findElement(prodInternalLabel).getText();
    }
}
