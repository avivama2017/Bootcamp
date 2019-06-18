package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends CommonAPI {
@FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/nav[2]/div/ul/li[2]/a[1]")
    WebElement login;
public void setLogin() throws InterruptedException {
    login.click();
    Thread.sleep(5000);
}
@FindBy(tagName = "spellcheck")
        WebElement username;

public void setUsername() throws InterruptedException {
    username.sendKeys("riad");
    Thread.sleep(5000);
}
}

