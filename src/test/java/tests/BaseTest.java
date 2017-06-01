package tests;
        import org.junit.AfterClass;
        import org.junit.Before;
        import org.junit.BeforeClass;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import pages.BasePage;
        import pages.HomePage;

        import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected static WebDriver driver;
    protected BasePage page;
    protected HomePage homePage;
    protected WebDriverWait wait = new WebDriverWait(driver,30);


    protected static String baseUrl = "https://www.selectspecs.com/";


    @BeforeClass
    public static void beforeClass() {
        initialization();
    }

    @Before
    public void before() {
        open(baseUrl);
        page = new BasePage(driver);
        homePage = page.createPage(HomePage.class);
    }

     @AfterClass
    public static void after() {
        driver.quit();
    }

    private static void initialization() {
        System.setProperty("webdriver.gecko.driver",
                "src\\main\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void open(String url){
        driver.get(url);
    }


}

