package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import regression.LoginPage;

public class TestLonginPage extends CommonAPI {
    LoginPage loginPage;
    String url = "https://www.facebook.com/";

    @BeforeClass
    public void init() {
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        driver.get(url);

    }

    @AfterMethod
    public void recap() {
        driver.get(url);
    }

    @Test
    public void click_login() throws InterruptedException {
        loginPage.setEmail();
        loginPage.setPassword();
        loginPage.setLogin();
        loginPage.setBillgates();
        loginPage.setSearch();
    }
}
