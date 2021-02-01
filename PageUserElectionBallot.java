package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageUserElectionBallot {

    WebDriver driver;

    public PageUserElectionBallot(WebDriver driver){ this.driver = driver; }

    private WebElement getFirstCandidateButton() {
        return driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]"));
    }

    private WebElement getSecondCandidateButton() {
        return driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[4]/div[1]"));
    }

    private WebElement getThirdCandidateButton() {
        return driver.findElement(By.xpath("//body/div[1]/div[3]/div[1]/div[1]/div[1]/ul[1]/li[2]/div[1]"));
    }

    private WebElement getSubmitButton() {
        return driver.findElement(By.xpath("//button[@id='confirmationButton']"));
    }

    private WebElement getAlertSubmitButton() {
        return driver.findElement(By.xpath("//button[contains(text(),'Submit Vote')]"));
    }

    public void clickFirstCandidateButton(){ getFirstCandidateButton().click(); }

    public void clickSecondCandidateButton(){ getSecondCandidateButton().click(); }

    public void clickThirdCandidateButton(){ getThirdCandidateButton().click(); }

    public void clickSubmitButton(){ getSubmitButton().click(); }

    public void clickAlertSubmitButton(){ getAlertSubmitButton().click(); }
}
