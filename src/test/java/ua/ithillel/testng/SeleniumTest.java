package ua.ithillel.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;

public class SeleniumTest {
    @Test
    public void TitleTest() {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // open full size window
        driver.get("https://www.google.com/?hl=en-US");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        Assert.assertEquals(driver.getTitle(), "Google", "Strings aren't matched");

        driver.quit();
    }
}
