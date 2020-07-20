package home;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class EbayTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kashfia\\IdeaProjects\\Team1FrameWork\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ebay.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("gh-tb ui-autocomplete-input")).sendKeys("Adidas", Keys.ENTER);
        Thread.sleep(2000);
        driver.close();
    }
}
