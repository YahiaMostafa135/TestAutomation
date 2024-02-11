package Login;

import Base.BaseTest;
import Pages.LoginPage;
import Pages.ProductPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertTrue;

public class LoginTests extends BaseTest{
    private ProductPage productPage;
    @Test(dataProvider = "testdata")
public void testSuccessfulLogin(String username,String password){
        loginPage.setUserName(username);
        loginPage.setPassword(password);
        ProductPage productPage=loginPage.clickOnLoginButton();
    assertTrue("failed to login",productPage.getTitle().contains("Products"));
}
    @DataProvider(name = "testdata")
    public Object[][] tData()
    {
        return new Object[][]
                {
                        {"WrongUsername","WrongPassword"},
                        {" "," "},
                        {"standard_user","WrongPassword"},
                        {"WrongUsername","secret_sauce"},
                        {"standard_user","secret_sauce"}
                };
    }
}
