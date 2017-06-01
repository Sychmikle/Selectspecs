package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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
       email.sendKeys(accEmail, Keys.ENTER);
    }

    public void clickSubmitButton(){
        submitButton.click();
    }

    public void setPassword(String accPassword){
        password.sendKeys(accPassword, Keys.ENTER);
    }


}
