package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".fa.fa-user-circle-o.nav-icons")
    public WebElement login;

    @FindBy(css = ".large-4.medium-4.columns:nth-child(4)")
    public WebElement product;

    public LoginPage loginClick(){
        login.click();
        return createPage(LoginPage.class);
    }

    public ProductPage productClick(){
        product.click();
        return createPage(ProductPage.class);
    }

}