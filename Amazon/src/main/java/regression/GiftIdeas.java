package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GiftIdeas extends CommonAPI {
    @FindBy (linkText = "Gift Ideas")
    WebElement giftideas;
    public void setGiftideas() throws InterruptedException {
        giftideas.click();
        Thread.sleep(5000);
    }
    @FindBy(xpath = "//*[@id=\"zg_left_col1\"]/div[1]/div[2]/div/div[2]/a/div[1]/img")
    WebElement cat;
    public void setCat() throws InterruptedException {
        cat.click();
        Thread.sleep(3000);
    }
    @FindBy(xpath = "//*[@id=\"zg_left_col1\"]/div[1]/div[1]/a")
    WebElement seemore_giftideas;
    public void setSeemore_giftideas() throws InterruptedException {
        seemore_giftideas.click();
        Thread.sleep(3000);
    }
    @FindBy(xpath = "//*[@id=\"zg-ordered-list\"]/li[1]/span/div/span/a/div")
    WebElement buy_puppy;
    public void setBuy_puppy() throws InterruptedException {
        buy_puppy.click();
        Thread.sleep(4000);
    }
    @FindBy(id = "add-to-cart-button")
    WebElement add_cart;
    public void setAdd_cart() throws InterruptedException {
        add_cart.click();
        Thread.sleep(5000);
    }
}
