package AddToCart;

import Base.BaseTest;
import Pages.CartPage;
import Pages.ProductPage;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;


import static org.testng.AssertJUnit.assertEquals;
import static org.testng.AssertJUnit.assertTrue;

public class AddToCartTest extends BaseTest {
    @Test
    public void testAddToCart() {
        loginPage.setUserName("problem_user");
        loginPage.setPassword("secret_sauce");
        ProductPage productPage = loginPage.clickOnLoginButton();
        productPage.clickOnAddToCartButton();
        CartPage cartPage = productPage.clickOnCartButton();
        assertTrue("item is not added to Cart", cartPage.getProductTitleInCart().contains("Sauce Labs Backpack"));
    }
        @Test
         public void testRemoveItemFromCart(){
            loginPage.setUserName("problem_user");
            loginPage.setPassword("secret_sauce");
            ProductPage productPage = loginPage.clickOnLoginButton();
            productPage.clickOnAddToCartButton();
            CartPage cartPage = productPage.clickOnCartButton();
            cartPage.clickOnRemoveButton();
            int numberOfProduct=cartPage.getSizeofAddedProduct();
            assertEquals("item is still in the Cart",0,numberOfProduct);

        }



}
