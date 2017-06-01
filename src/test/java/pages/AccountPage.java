package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends BasePage {
    public AccountPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="html/body/div[1]/div/div/div[2]/div/div/div/p[1]/a")
    public WebElement signOut;

    public void clickSignOut(){
        signOut.click();
    }
}
