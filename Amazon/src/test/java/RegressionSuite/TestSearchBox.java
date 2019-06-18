package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import regression.HomePage;
import regression.SearchBox;

public class TestSearchBox extends CommonAPI {
    SearchBox searchBox;
    String url = "https://www.amazon.com/";

    @BeforeClass
    public void init(){
        searchBox= PageFactory.initElements(driver,SearchBox.class);
        driver.get(url);
    }
    @AfterMethod
    public void recaps(){
        driver.get(url);
    }
    @Test(enabled = false)//perfect
    public void search_box() throws InterruptedException {
        searchBox.setSearchbox();
        searchBox.setClick_search_button();
        searchBox.setHolystone();
       // searchBox.setLego();
    }
}
