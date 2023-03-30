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

public class Test2 extends TestBase {

    @Test
    public void testListGroup() {
        WebElement test2Div = driver.findElement(By.id("test-2-div"));
        List<WebElement> listItems = test2Div.findElements(By.tagName("li"));
        Assert.assertEquals(listItems.size(), 3, "Number of list items is not 3");
        WebElement secondListItem = listItems.get(1);
        WebElement badge = secondListItem.findElement(By.tagName("span"));
        Assert.assertEquals(secondListItem.getText(), "List Item 2 6", "Second list item text is not List Item 2");
        Assert.assertEquals(badge.getText(), "6", "Second list item badge value is not 6");
    }
}
