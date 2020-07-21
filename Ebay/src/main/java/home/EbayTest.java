package home;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

import java.util.List;

public class EbayTest extends CommonAPI {


    @BeforeMethod
    public void ebaySetup() {
        setUp(UrlSetup.Ebay);
    }

    WebDriverWait wait;

    @FindBy(id = "gh-ac")
    public static WebElement searchBar;
    @FindBy(xpath = "//h1[@class='srp-controls__count-heading']")
    public static WebElement testSearchBar;
    @FindBy(id = "gh-cat")
    public static WebElement allCategoriesDropDown;
    @FindBy(xpath = "//h1")
    public static WebElement header;
    @FindBy(id = "gh-btn")
    public static WebElement searchButton;
    @FindBy(xpath = "//a[@title='Your shopping cart']")
    public static WebElement shoppingCartButton;
    @FindBy(xpath = "b-visualnav__title")
    public static WebElement ShopByCategory;
    @FindBy(xpath ="b-visualnav__img b-visualnav__img__default")
    public static WebElement artCategories;

    public void searchForHarryPotter() {
        searchBar.sendKeys("Harry Potter Books");
        new Actions(driver).sendKeys(Keys.ENTER).perform();
        Assert.assertTrue(testSearchBar.getText().contains("Harry Potter Books"));
    }

    public void clickBooks() {
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Books");
        searchButton.click();
        explicitlyWait(5).until(ExpectedConditions.visibilityOf(header));
        Assert.assertTrue(header.getText().equalsIgnoreCase("Books"));
    }


    public void clickShoppingCar() {
        shoppingCartButton.click();
        Assert.assertTrue(header.getText().equalsIgnoreCase("Shopping cart"));
    }

    public void clickEbayArt() {
        Select select = new Select(allCategoriesDropDown);
        select.selectByVisibleText("Art");
        searchButton.click();
        explicitlyWait(5).until(ExpectedConditions.visibilityOf(header));
        Assert.assertTrue(header.getText().equalsIgnoreCase("Welcome to eBay Art"));
    }

}
