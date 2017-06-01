package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;


    public BasePage(WebDriver driver){
        this.driver = driver;
    }

    public  <T> T createPage(Class<T> pageClass){
        return PageFactory.initElements(driver,pageClass);
    }


}


