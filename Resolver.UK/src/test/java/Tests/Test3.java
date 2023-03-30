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

import java.util.List;

public class Test3 extends TestBase {

    @Test
    public void testSelectList() {
        WebElement test3Div = driver.findElement(By.id("test-3-div"));
        WebElement selectList = test3Div.findElement(By.id("dropdownMenuButton"));
        Assert.assertEquals(selectList.getText(),"Option 1","Default selected value is not Option 1");
        selectList.click();
        WebElement option3 = selectList.findElement(By.xpath("//a[@class='dropdown-item'][3]"));
        option3.click();
    }
}

