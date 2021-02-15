package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAdminCommittees {

    WebDriver driver;

    public PageAdminCommittees(WebDriver driver) { this.driver = driver; }

    private WebElement getCoFCommitteeTab() {
        return driver.findElement(By.xpath("//a[@id='committee-1-tab']"));
    }

    private WebElement getFECCommitteeTab() {
        return driver.findElement(By.xpath("//a[@id='committee-2-tab']"));
    }

    private WebElement getFSCCommitteeTab() {
        return driver.findElement(By.xpath("//a[@id='committee-3-tab']"));
    }

    private WebElement getPPRCCommitteeTab() {
        return driver.findElement(By.xpath("//a[@id='committee-4-tab']"));
    }

    private WebElement getRACCommitteeTab() {
        return driver.findElement(By.xpath("//a[@id='committee-5-tab']"));
    }

    private WebElement getBoTRepCommitteeTab() {
        return driver.findElement(By.xpath("//a[@id='committee-5-tab']"));
    }

    private WebElement getFECFirstManageElectionButton() {
        return driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]/form[1]/div[1]/input[1]"));
    }

    private WebElement getFECFirstStartElectionButton() {
        return driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[3]/form[1]/div[1]/input[2]"));
    }

    public void clickCoFCommitteeTab() { getCoFCommitteeTab().click(); }

    public void clickFECCommitteeTab() { getFECCommitteeTab().click(); }

    public void clickFSCCommitteeTab() { getFSCCommitteeTab().click(); }

    public void clickPPRCCommitteeTab() { getPPRCCommitteeTab().click(); }

    public void clickRACCommitteeTab() { getRACCommitteeTab().click(); }

    public void clickBoTRepCommitteeTab() { getBoTRepCommitteeTab().click(); }

    public void clickFECFirstManageElectionButton() { getFECFirstManageElectionButton().click(); }

    public void clickFECFirstStartElectionButton() { getFECFirstStartElectionButton().click(); }
}
