package Tests;
import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test4 extends TestBase {

    @Test
    public void testButtonState() {
        WebElement test4Div = driver.findElement(By.id("test-4-div"));
        WebElement firstButton = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary']"));
        WebElement secondButton = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-secondary']"));
        Assert.assertTrue(firstButton.isEnabled(), "First button is not enabled");
        Assert.assertFalse(secondButton.isEnabled(), "Second button is not disabled");
    }
}

