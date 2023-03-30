package base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;

public class TestBase {
   protected WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverUtil.getDriver("chrome");
        driver.get("file:///C:/Users/karad/OneDrive/Masa%C3%BCst%C3%BC/QE-index.html");
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void closing(){
        driver.close();
    }
}
