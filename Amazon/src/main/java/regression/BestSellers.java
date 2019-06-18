package regression;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BestSellers extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    WebElement bestsellers;
     public void setBestsellers() throws InterruptedException {
         bestsellers.click();
         Thread.sleep(4000);
     }
     @FindBy(xpath = "//*[@id=\"zg_left_col1\"]/div[1]/div[2]/div/div[2]/a/div[1]/img")
    WebElement toys;
     public void setToys() throws InterruptedException {
         toys.click();
         Thread.sleep(5000);
     }

}