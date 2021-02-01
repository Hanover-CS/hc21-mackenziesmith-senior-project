package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUserHome {

    WebDriver driver;

    public PageUserHome(WebDriver driver){
        this.driver = driver;
    }

    public String getPageHeader(){
        return driver.findElement(By.cssSelector("body > div > div > div.col-sm-9 > h3")).getText();
    }

    private WebElement getHomeTab(){
        return driver.findElement(By.cssSelector("body > nav > ul.navbar-nav.mr-auto > li > a"));
    }

    private WebElement getLogoutLink(){
        return driver.findElement(By.cssSelector("body > nav > ul.navbar-nav.mt-2 > li > a"));
    }

    public void clickHomeTab(){
        getHomeTab().click();
    }

    public void clickLogoutLink(){
        getLogoutLink().click();
    }
}
