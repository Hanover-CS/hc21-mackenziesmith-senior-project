package functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageAdminProfiles {

    WebDriver driver;

    public PageAdminProfiles(WebDriver driver) { this.driver = driver; }

    private WebElement getAddUserButton() {
        return driver.findElement(By.xpath("//a[contains(text(),'Add user')]"));
    }

    private WebElement getUsernameInput() {
        return driver.findElement(By.xpath("//input[@id='inputUsername']"));
    }

    private WebElement getFirstNameInput() {
        return driver.findElement(By.xpath("//input[@id='inputFirst']"));
    }

    private WebElement getLastNameInput() {
        return driver.findElement(By.xpath("//input[@id='inputLast']"));
    }

    private WebElement getDivisionDropdown() {
        return driver.findElement(By.xpath("//select[@id='selectDivision']"));
    }

    private WebElement getArtsDivision() {
        return driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/select[1]/option[1]"));
    }

    private WebElement getContractDropdown() {
        return driver.findElement(By.xpath("//select[@id='selectContract']"));
    }

    private WebElement getAdminContract() {
        return driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[4]/div[1]/select[1]/option[1]"));
    }

    private WebElement getSubmitUserButton() {
        return driver.findElement(By.xpath("//button[@id='addUserSubmit']"));
    }

    public void clickAddUserButton() {
        getAddUserButton().click();
    }

    public void enterUsername(String username) {
        getUsernameInput().sendKeys(username);
    }

    public void enterFirstName(String firstName) {
        getFirstNameInput().sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        getLastNameInput().sendKeys(lastName);
    }

    public void clickDivisionDropdown() {
        getDivisionDropdown().click();
    }

    public void clickArtsDivision() {
        getArtsDivision().click();
    }

    public void clickContractDropdown() {
        getContractDropdown().click();
    }

    public void clickAdminContract() {
        getAdminContract().click();
    }

    public void clickSubmitUserButton() {
        getSubmitUserButton().click();
    }
}
