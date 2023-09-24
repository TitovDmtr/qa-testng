package ua.ithillel.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class SeleniumTest {
    @Test
    public void TitleTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // open full size window
        driver.get("https://www.google.com/?hl=en-US");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Accept All']"))).click();

        Assert.assertEquals(driver.getTitle(), "Google", "Strings aren't matched");

        driver.quit();
    }
}
