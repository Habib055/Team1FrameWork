import home.EbayTest;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EbayTestSetup extends EbayTest {
    EbayTestSetup ebayTestSetup;
    @BeforeMethod
    public void initelements(){
        ebayTestSetup = PageFactory.initElements(driver,EbayTestSetup.class);
    }
    @Test
    public void testSearchBar(){
        searchForHarryPotter();
    }
    @Test
    public void testAllCategories_Books(){
        clickBooks();
    }
    @Test
    public void testShoppingCartButton(){
        clickShoppingCar();
    }
    @Test
    public void testAllCategories_Art() {
        clickEbayArt();
    }

}
