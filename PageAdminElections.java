package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAdminElections {

    WebDriver driver;

    public PageAdminElections(WebDriver driver) { this.driver = driver; }

    public WebElement getFirstElectionEditButton() {
        return driver.findElement(By.xpath("//tbody/tr[1]/td[1]/form[1]/button[1]"));
    }

    public WebElement getSecondElectionEditButton() {
        return driver.findElement(By.xpath("//tbody/tr[2]/td[1]/form[1]/button[1]"));
    }

    public WebElement getThirdElectionEditButton() {
        return driver.findElement(By.xpath("//tbody/tr[3]/td[1]/form[1]/button[1]"));
    }

    public WebElement getFourthElectionEditButton() {
        return driver.findElement(By.xpath("//tbody/tr[4]/td[1]/form[1]/button[1]"));
    }

    public void clickFirstElectionEditButton() { getFirstElectionEditButton().click(); }

    public void clickSecondElectionEditButton() { getSecondElectionEditButton().click(); }

    public void clickThirdElectionEditButton() { getThirdElectionEditButton().click(); }

    public void clickFourthElectionEditButton() { getFourthElectionEditButton().click(); }
}
