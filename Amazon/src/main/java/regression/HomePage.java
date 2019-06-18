package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

public class HomePage extends CommonAPI {
    @FindBy(id = "nav-link-accountList")
    WebElement signin;
    public void setSignin() throws InterruptedException {
        signin.click();
        Thread.sleep(5000);
    }
    @FindBy(id = "ap_email")
    WebElement email_fillup_singin;
    public void setEmail_fillup_singin(){
        email_fillup_singin.sendKeys("mdleton@yahoo.com");
    }
    @FindBy(id = "ap_password")
    WebElement password;
    public void setPassword() throws InterruptedException {
        password.sendKeys("nazmun1230");
        Thread.sleep(5000);
    }
    @FindBy(id = "signInSubmit")
    WebElement submit_signin;

    public void setSubmit_signin() throws InterruptedException {
        submit_signin.click();
        Thread.sleep(5000);
    }
    @FindBy(xpath = "//*[@id=\"nav-item-signout\"]/span")
    WebElement signout;
    public void setSignout(){
        signout.click();

    }
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]/span[1]")
    WebElement mouseover_mdmriad;
    public void setMouseover_mdmriad() throws InterruptedException {
        Actions actions=new Actions(driver);
        actions.moveToElement(mouseover_mdmriad).build().perform();
        Thread.sleep(5000);
    }

    }

//    public void setMouseover1() throws InterruptedException {
//        Actions actions = new Actions(driver);
//        actions.moveToElement(mouseover1);
//        Thread.sleep(3000);