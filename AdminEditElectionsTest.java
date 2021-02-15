package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAdminEditElection {

    WebDriver driver;

    public PageAdminEditElection(WebDriver driver) { this.driver = driver; }

    private WebElement getUserToAddDropdown() {
        return driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/button[1]"));
    }

    private WebElement getAddCandidateButton() {
        return driver.findElement(By.xpath("//button[contains(text(),'Add Candidate')]"));
    }

    private WebElement getRemoveFirstCandidateButton() {
        return driver.findElement(By.xpath("//tbody/tr[1]/td[3]/form[1]/button[1]"));
    }

    private WebElement getRemoveSecondCandidateButton() {
        return driver.findElement(By.xpath("//tbody/tr[2]/td[3]/form[1]/button[1]"));
    }

    private WebElement getRemoveThirdCandidateButton() {
        return driver.findElement(By.xpath("//tbody/tr[3]/td[3]/form[1]/button[1]"));
    }

    private WebElement getRemoveFourthCandidateButton() {
        return driver.findElement(By.xpath("//tbody/tr[4]/td[3]/form[1]/button[1]"));
    }

    private WebElement getRemoveFifthCandidateButton() {
        return driver.findElement(By.xpath("//tbody/tr[5]/td[3]/form[1]/button[1]"));
    }

    private WebElement getVotersTab() {
        return driver.findElement(By.xpath("//a[@id='voters-tab']"));
    }

    private WebElement getRemoveFirstVoterButton() {
        return driver.findElement(By.xpath("//tbody/tr[1]/td[2]/form[1]/button[1]"));
    }

    private WebElement getVoterToAddDropdown() {
        return driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/button[1]"));
    }

    private WebElement getAddVoterButton() {
        return driver.findElement(By.xpath("//button[contains(text(),'Add Voter')]"));
    }

    private WebElement getAdvanceToVoteButton() {
        return driver.findElement(By.xpath("//button[@id='confirmationButton']"));
    }

    private WebElement getAdvanceToClosedButton() {
        return driver.findElement(By.xpath("//button[@id='confirmationButton']"));
    }

    public void clickUserToAddDropdown() { getUserToAddDropdown().click(); }

    public void clickAddCandidateButton() { getAddCandidateButton().click(); }

    public void clickRemoveFirstCandidateButton() { getRemoveFirstCandidateButton().click(); }

    public void clickRemoveSecondCandidateButton() { getRemoveSecondCandidateButton().click(); }

    public void clickRemoveThirdCandidateButton() { getRemoveThirdCandidateButton().click(); }

    public void clickRemoveFourthCandidateButton() { getRemoveFourthCandidateButton().click(); }

    public void clickRemoveFifthCandidateButton() { getRemoveFifthCandidateButton().click(); }

    public void clickUserToAdd() { driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")).click(); }

    public void clickVotersTab() { getVotersTab().click(); }

    public void clickRemoveFirstVoterButton() { getRemoveFirstVoterButton().click(); }

    public void clickVoterToAdd() { driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[2]/a[1]")).click(); }

    public void clickVoterToAddDropdown() { getVoterToAddDropdown().click(); }

    public void clickAddVoterButton() { getAddVoterButton().click(); }

    public void clickAdvanceToVoteButton() { getAdvanceToVoteButton().click(); }

    public void clickAdvanceToClosedButton() { getAdvanceToClosedButton().click(); }
}
