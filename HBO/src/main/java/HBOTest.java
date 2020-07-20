import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HBOTest {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jesse\\IdeaProjects\\Team1FrameWork\\driver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.hbo.com/");
        driver.manage().window().maximize();
        driver.findElement(By.className("bands/MainNavigation--searchIcon")).sendKeys("", Keys.ENTER);
        Thread.sleep(5000);
        driver.close();
    }
}