package RegressionSuite;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import regression.Login;

public class TestLogin extends CommonAPI {
    Login login;
    String url = "https://www.cigna.com/";

    @BeforeClass
    public void init() {
        login=PageFactory.initElements(driver,Login.class);
    }
    @AfterMethod
    public void recap(){
        driver.get(url);
    }
    @Test
    public void setLogins() throws InterruptedException {
        login.setLogin();


    }
}
