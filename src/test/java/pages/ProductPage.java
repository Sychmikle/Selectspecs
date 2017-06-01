package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage{
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".productPagePrice")
    public WebElement productPrice;

    @FindBy(css =".float-right>a")
    public WebElement accountButton;

    public AccountPage clickAccButton(){
        accountButton.click();
        return createPage(AccountPage.class);
    }

    public static double productPrice(WebElement webElement){
        String s = webElement.getText();
        String strEnd = s.replaceFirst("\\D","");
        double i = Double.parseDouble(strEnd);
        return i;
    }

}
