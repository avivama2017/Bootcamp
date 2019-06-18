package regression;

import base.CommonAPI;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchBox extends CommonAPI {
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchbox;
    public void setSearchbox() throws InterruptedException {
        searchbox.sendKeys("drone");
        Thread.sleep(5000);
    }
    @FindBy(className = "mediaCentralImage imageContainer__image")
    WebElement lego;
    public void setLego() throws InterruptedException {
        lego.click();
        Thread.sleep(5000);
    }
    @FindBy(css = "#nav-search > form > div.nav-right > div > input")
    WebElement click_search_button;
    public void setClick_search_button() throws InterruptedException {
        click_search_button.click();
        Thread.sleep(3000);
    }
    @FindBy(id = "pdagDesktopSparkleDescription1")
    WebElement holystone;
    public void setHolystone() throws InterruptedException {
        holystone.click();
        Thread.sleep(4000);
    }
}
