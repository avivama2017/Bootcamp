package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import regression.HomePage;

public class TestHomePage extends CommonAPI {
HomePage homePage;
String url = "https://www.amazon.com/";



@BeforeClass
public void init() {
    homePage = PageFactory.initElements(driver, HomePage.class);
    driver.get(url);
}
@AfterMethod
    public void recap(){
    driver.get(url);
}
@Test(enabled = false)//perfect perfect
    public void click_signin() throws InterruptedException {
    homePage.setSignin();
    homePage.setEmail_fillup_singin();
    homePage.setPassword();
    homePage.setSubmit_signin();
    homePage.setMouseover_mdmriad();
    homePage.setSignout();
}
}



