package Logout;

import Base.BaseTest;
import Pages.ProductPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class LogoutTest extends BaseTest {
    @Test
    public void testLogout(){
        loginPage.setUserName("problem_user");
        loginPage.setPassword("secret_sauce");
        ProductPage productPage=loginPage.clickOnLoginButton();
       loginPage= productPage.clickOnLogoutButton();
      String buttonId=loginPage.getButtonsId();
        assertTrue("Logout failed",buttonId.contains("login-button"));
    }
}
