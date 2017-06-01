package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class LoginPage extends BasePage{


    @FindBy(id ="email")
    public WebElement email;

    @FindBy (id = "submit_btn")
    public WebElement submitButton;

    @FindBy (id = "password")
    public WebElement password;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail(String accEmail){
       email.sendKeys(accEmail);
    }

    public void setPassword(String accPassword){
        password.sendKeys(accPassword, Keys.ENTER);
    }

    public void loginWait(){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(elementToBeClickable(submitButton)).click();
        wait.until(visibilityOf(password));
    }


}
