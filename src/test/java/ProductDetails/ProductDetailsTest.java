package ProductDetails;

import Base.BaseTest;
import Pages.ProductDetailsPage;
import Pages.ProductPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class ProductDetailsTest extends BaseTest {
    @Test
    public void testProductDetails(){
        loginPage.setUserName("problem_user");
        loginPage.setPassword("secret_sauce");
        ProductPage productPage=loginPage.clickOnLoginButton();
        ProductDetailsPage productDetailsPage= productPage.clickOnProductLabel();
        String prodTitle=productDetailsPage.getProductTitle();
        assertTrue("Product label is not matching product details",prodTitle.contains("Sauce Labs Backpack"));
    }

}
