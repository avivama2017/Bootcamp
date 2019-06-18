package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"email\"]")
    WebElement email;
    public void setEmail() throws InterruptedException {
        email.sendKeys("mdleton@yahoo.com");
        Thread.sleep(2000);
    }
    @FindBy(id = "pass")
    WebElement password;
    public void setPassword() throws InterruptedException {
        password.sendKeys("aviva2017");
        Thread.sleep(2000);
    }
    @FindBy(xpath = "//*[@id=\"loginbutton\"]")
    WebElement login;
    public void setLogin() throws InterruptedException {
        login.click();
        Thread.sleep(2000);
    }
    @FindBy(name = "q")
    WebElement billgates;
    public void setBillgates() throws InterruptedException {
        billgates.sendKeys("billGates");
        Thread.sleep(2000);
    }
    @FindBy(xpath = "//*[@id=\"js_1a\"]/form/button")
    WebElement search;
    public void setSearch() throws InterruptedException {
        search.click();
        Thread.sleep(5000);
    }
}
