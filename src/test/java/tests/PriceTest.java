package tests;
import org.junit.Assert;
import org.junit.Test;
import pages.AccountPage;
import pages.LoginPage;
import pages.ProductPage;
import utils.Convert;
import static org.openqa.selenium.support.ui.ExpectedConditions.urlToBe;


public class PriceTest extends BaseTest {


    @Test
    public void testWap() {
        LoginPage loginPage = homePage.loginClick();
        loginPage.setEmail("ukrain@gmail.com");
        loginPage.loginWait();
        loginPage.setPassword("q1w2e3");
        ProductPage productPage = homePage.productClick();
        double ukrPrice = productPage.productPrice(productPage.productPrice);
        AccountPage accountPage = productPage.clickAccButton();
        accountPage.clickSignOut();
        wait.until(urlToBe("https://www.selectspecs.com/"));
        homePage.login.click();
        loginPage.setEmail("england@gmail.com");
        loginPage.loginWait();
        loginPage.setPassword("q1w2e3");
        homePage.product.click();
        double engPrice  = productPage.productPrice(productPage.productPrice);

        Assert.assertTrue(Convert.wapCheck(engPrice,ukrPrice) > 10); // первое значение больше
    }


}
