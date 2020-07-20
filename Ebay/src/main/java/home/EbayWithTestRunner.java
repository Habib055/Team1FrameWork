package home;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class EbayWithTestRunner {
    WebDriver driver = null;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jesse\\IdeaProjects\\Team1FrameWork\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        }
    @AfterMethod
    public void cleanUp() {
        driver.close();

    }
    @Test
    public void test1() throws InterruptedException {
        driver.findElement(By.id("gh-tb ui-autocomplete-input")).sendKeys("Adidas", Keys.ENTER);
        Thread.sleep(2000);
    }

}





