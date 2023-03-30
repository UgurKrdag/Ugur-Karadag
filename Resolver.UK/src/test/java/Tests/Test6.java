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

public class Test6 extends TestBase {

    @Test
    public void TableTest () {
        String cellValue = getCellValue(2, 2);
        Assert.assertEquals(cellValue,"Ventosanzap");
    }
    public String getCellValue(int row, int col) {
        WebElement table = driver.findElement(By.xpath("//table[@class='table table-bordered table-dark']"));
        WebElement tableRow = table.findElement(By.xpath(".//tr[" + (row + 1) + "]"));
        WebElement cell = tableRow.findElement(By.xpath(".//td[" + (col + 1) + "]"));
        return cell.getText();
    }
}