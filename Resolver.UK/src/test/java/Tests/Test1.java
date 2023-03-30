package Tests;
import base.TestBase;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 extends TestBase {

    @Test
    public void testLoginPage() {
        WebElement email = driver.findElement(By.id("inputEmail"));
        WebElement password = driver.findElement(By.id("inputPassword"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));
        Assert.assertTrue(email.isDisplayed(), "Email input is not displayed");
        Assert.assertTrue(password.isDisplayed(), "Password input is not displayed");
        Assert.assertTrue(loginButton.isDisplayed(), "Login button is not displayed");
        Faker faker = new Faker();
        email.sendKeys(faker.internet().emailAddress());
        password.sendKeys(faker.internet().password());
        loginButton.click();
    }
}
