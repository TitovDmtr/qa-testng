package ua.ithillel.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class Titov_HW10Test {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("==========TEST START==========");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("===========TEST END===========");
    }

    @Test
    public void FindAllElementsTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize(); // open full size window
        driver.get("https://www.google.com/?hl=en-US");
        driver.findElement(By.name("q")).sendKeys("hillel it school");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        Thread.sleep(3000); //waiting

        List<WebElement> elements = driver.findElements(By.xpath("//a/h3"));
        int i = 0;
        for (WebElement element : elements) {
            if (!element.getText().toLowerCase().contains("hillel it school")) {
                System.out.println("Element with number " + i + " " + element.getText() + " Doesn't contain \"hillel it school\"");
            }
            i++;
        }
        driver.quit();
    }

    @Test
    public void FindFirstElementTest() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // open full size window
        driver.get("https://www.google.com/?hl=en-US");

        driver.findElement(By.name("q")).sendKeys("Linkedin test");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
        Thread.sleep(3000); //waiting

        List<WebElement> elements = driver.findElements(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div.kb0PBd.cvP2Ce.jGGQ5e > div > div > span > a > h3"));
                String firstElement = elements.get(0).getText().toLowerCase();
                Assert.assertEquals(firstElement, "linkedin test", "Strings aren't matched");
        driver.quit(); //the window newer closing because the AR != ER and get get an error
    }
}
