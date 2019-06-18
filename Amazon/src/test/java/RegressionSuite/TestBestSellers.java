package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import regression.BestSellers;

public class TestBestSellers extends CommonAPI {
    BestSellers bestSellers;
    String url = "https://www.amazon.com/";
    @BeforeClass
    public void ints(){
        bestSellers = PageFactory.initElements(driver,BestSellers.class);

    }
    @AfterMethod
    public void recap(){
        driver.get(url);
    }
    @Test(enabled = false)
    public void setBestSellerss() throws InterruptedException {
        bestSellers.setBestsellers();

    }

}