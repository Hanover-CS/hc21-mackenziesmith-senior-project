package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAdminHome {

    WebDriver driver;

    public PageAdminHome(WebDriver driver){
        this.driver = driver;
    }

    private WebElement getViewProfilesLink(){
        return driver.findElement(By.cssSelector("body > div > div > div > div > a:nth-child(1)"));
    }

    private WebElement getMonitorElectionLink(){
        return driver.findElement(By.cssSelector("body > div > div > div > div > a:nth-child(2)"));
    }

    private WebElement getReviewCommitteesAndStartElectionLink(){
        return driver.findElement(By.cssSelector("body > div > div > div > div > a:nth-child(3)"));
    }

    private WebElement getHomeTab(){
        return driver.findElement(By.cssSelector("body > nav > ul.navbar-nav.mr-auto > li:nth-child(1) > a"));
    }

    private WebElement getProfliesTab(){
        return driver.findElement(By.cssSelector("body > nav > ul.navbar-nav.mr-auto > li:nth-child(2) > a"));
    }

    private WebElement getElectionTab(){
        return driver.findElement(By.cssSelector("body > nav > ul.navbar-nav.mr-auto > li:nth-child(3) > a"));
    }

    private WebElement getCommitteeTab(){
        return driver.findElement(By.cssSelector("body > nav > ul.navbar-nav.mr-auto > li:nth-child(4) > a"));
    }

    private WebElement getQueriesTab(){
        return driver.findElement(By.cssSelector("body > nav > ul.navbar-nav.mr-auto > li:nth-child(5) > a"));
    }

    private WebElement getUploadTab(){
        return driver.findElement(By.cssSelector("body > nav > ul.navbar-nav.mr-auto > li:nth-child(7) > a"));
    }

    private WebElement getLogoutLink(){
        return driver.findElement(By.cssSelector("body > nav > ul.navbar-nav.mt-2 > li > a"));
    }

    public void clickViewProfilesLink(){

        getViewProfilesLink().click();
    }

    public void clickMonitorElectionLink(){

        getMonitorElectionLink().click();
    }

    public void clickReviewCommitteesAndStartElectionsLink()
    {
        getReviewCommitteesAndStartElectionLink().click();
    }

    public void clickHomeTab(){

        getHomeTab().click();
    }

    public void clickProfilesTab(){

        getProfliesTab().click();
    }

    public void clickElectionTab(){

        getElectionTab().click();
    }

    public void clickCommitteeTab(){

        getCommitteeTab().click();
    }

    public void clickQueriesTab(){

        getQueriesTab().click();
    }

    public void clickUploadTab() {
        getUploadTab().click();
    }

    public void clickLogoutLink(){
        getLogoutLink().click();
    }
}
