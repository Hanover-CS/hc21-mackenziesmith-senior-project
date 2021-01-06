package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageLogin {
    WebDriver driver;

    public PageLogin(WebDriver driver){
        this.driver = driver;
    }

    public String getPageHeader(){
        return driver.findElement(By.cssSelector("body > div > div > div > h3")).getText();
    }

    private WebElement getUsernameField(){
        return driver.findElement(By.name("username"));
    }

    private WebElement getPasswordField(){
        return driver.findElement(By.name("password"));
    }

    private WebElement getLoginBtn(){
        return driver.findElement(By.xpath("/html/body/div/div/div/form/div[3]/input"));
    }

    public void enterUsername(String username){
        getUsernameField().sendKeys(username);
    }

    public void enterPassword(String password){
        getPasswordField().sendKeys(password);
    }

    public void clickLoginBtn(){
        getLoginBtn().click();
    }
}
