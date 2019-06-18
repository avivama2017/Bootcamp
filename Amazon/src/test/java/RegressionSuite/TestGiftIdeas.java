package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import regression.GiftIdeas;
import regression.HomePage;

public class TestGiftIdeas extends CommonAPI {
    GiftIdeas giftIdeas;
    String url = "https://www.amazon.com/";
    @BeforeClass
    public void init(){
        giftIdeas = PageFactory.initElements(driver,GiftIdeas.class);

    }
@AfterMethod
    public void recap(){
        driver.get(url);
}
@Test(enabled = false)//perfect
    public void setGiftIdeass() throws InterruptedException {
        giftIdeas.setGiftideas();
        giftIdeas.setSeemore_giftideas();
        giftIdeas.setBuy_puppy();
        giftIdeas.setAdd_cart();
        //giftIdeas.setCat();
}

}
