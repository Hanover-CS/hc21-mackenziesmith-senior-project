package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAdminUpload {

    WebDriver driver;

    public PageAdminUpload(WebDriver driver) { this.driver = driver;}

    private WebElement getChooseFileButton() {
        return driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[1]/input[1]"));
    }

    private WebElement getUploadButton() {
        return driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[2]/input[1]"));
    }

    public void clickChooseFileButton() { getChooseFileButton().click(); }

    public void clickUploadButton() { getUploadButton().click(); }
}
