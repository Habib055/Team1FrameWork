package home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver = null;

    public void setUp(UrlSetup moduleName){
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\jesse\\IdeaProjects\\Team1FrameWork\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
        switch(moduleName) {

            case AMAZON:
                driver.get("http://www.amazon.com/");
                break;
            case Ebay:
                driver.get("http://www.ebay.com/");
                break;


        }
    }

    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }

    public WebDriverWait explicitlyWait (int timeOut){
        return new WebDriverWait(driver,timeOut);
    }

    public boolean retryingFindClick(WebElement element) {
        boolean result = false;
        int attempts = 0;
        while(attempts < 2) {
            try {
                element.click();
                result = true;
                break;
            } catch(Exception e) {
                System.out.println(e.getMessage());
            }
            attempts++;
        }
        return result;
    }
}

