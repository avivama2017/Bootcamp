package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class HomePage extends CommonAPI {
    @FindBy(id = "creditcards")
    WebElement creditcards;
    public void setCreditcards() throws InterruptedException {
        Actions actions = new Actions(driver);
        actions.moveToElement(creditcards).build().perform();
        Thread.sleep(3000);
    }
    @FindBy(id = "viewAllCards_Link")
    WebElement viewallcard;
    public void setViewallcard() throws InterruptedException {
        viewallcard.click();
        Thread.sleep(3000);


    }
    @FindBy (xpath = "//*[@id=\"allCrd-Mnybar-TestA\"]/div/div/div/ul/li[5]/a")
    WebElement lowinterest;
    public void setLowinterest() throws InterruptedException {
        lowinterest.click();
        Thread.sleep(3000);
    }
}
