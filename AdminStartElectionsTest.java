package tests;

import functions.CommonFunctions;
import functions.PageAdminElections;
import functions.PageAdminHome;
import functions.PageAdminUpload;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminStartElectionsTest {

    private static String usernameAdmin = "admin";
    private static String passwordAdmin = "adminpass";

    @Test
    public void adminStartElections() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Login
        CommonFunctions.login(driver, usernameAdmin, passwordAdmin);

        // Create admin homepage object
        PageAdminHome objAdmin = new PageAdminHome(driver);

        // Click upload tab
        objAdmin.clickUploadTab();

        // Create upload page object
        PageAdminUpload objUpload = new PageAdminUpload(driver);

        // Click choose file button and select file manually

        // Upload file to start elections
        objUpload.clickUploadButton();

        // Assert upload successful
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flash']")).getText().contains("Data successfully uploaded"));

        // Click elections tab
        objAdmin.clickElectionTab();

        // Create elections page object
        PageAdminElections objElection = new PageAdminElections(driver);

        // Assert Elections created
        Assert.assertTrue(objElection.getFirstElectionEditButton().isDisplayed());
        Assert.assertTrue(objElection.getSecondElectionEditButton().isDisplayed());
        Assert.assertTrue(objElection.getThirdElectionEditButton().isDisplayed());
        Assert.assertTrue(objElection.getFourthElectionEditButton().isDisplayed());

        driver.quit();
    }
}
