package tests;

import functions.CommonFunctions;
import functions.PageAdminEditElection;
import functions.PageAdminElections;
import functions.PageAdminHome;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminEditElectionsTest {

    private static String usernameAdmin = "admin";
    private static String passwordAdmin = "adminpass";

    @Test
    public void adminRemoveCandidate() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Login
        CommonFunctions.login(driver, usernameAdmin, passwordAdmin);

        // Create homepage object
        PageAdminHome objAdmin = new PageAdminHome(driver);

        // Click elections tab
        objAdmin.clickElectionTab();

        // Create elections page object
        PageAdminElections objElection = new PageAdminElections(driver);

        // Click edit election
        objElection.clickFirstElectionEditButton();

        // Create edit election page object
        PageAdminEditElection objEditElection = new PageAdminEditElection(driver);

        // Click remove first candidate
        objEditElection.clickRemoveFirstCandidateButton();

        // Assert candidate removed
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flash']")).isDisplayed());

        driver.quit();
    }

    @Test
    public void adminAddCandidate() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Login
        CommonFunctions.login(driver, usernameAdmin, passwordAdmin);

        // Create homepage object
        PageAdminHome objAdmin = new PageAdminHome(driver);

        // Click elections tab
        objAdmin.clickElectionTab();

        // Create elections page object
        PageAdminElections objElection = new PageAdminElections(driver);

        // Click edit election
        objElection.clickFirstElectionEditButton();

        // Create edit election page object
        PageAdminEditElection objEditElection = new PageAdminEditElection(driver);

        // Click user to add dropdown
        objEditElection.clickUserToAddDropdown();

        // Click first user
        objEditElection.clickUserToAdd();

        // Click add candidate button
        objEditElection.clickAddCandidateButton();

        // Assert user added to election
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flash']")).isDisplayed());

        driver.quit();
    }

    @Test
    public void adminRemoveVoter() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Login
        CommonFunctions.login(driver, usernameAdmin, passwordAdmin);

        // Create homepage object
        PageAdminHome objAdmin = new PageAdminHome(driver);

        // Click elections tab
        objAdmin.clickElectionTab();

        // Create elections page object
        PageAdminElections objElection = new PageAdminElections(driver);

        // Click edit election
        objElection.clickFirstElectionEditButton();

        // Create edit election page object
        PageAdminEditElection objEditElection = new PageAdminEditElection(driver);

        // Click voters tab
        objEditElection.clickVotersTab();

        // Click remove first voter button
        objEditElection.clickRemoveFirstVoterButton();

        // Assert voter removed from election
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flash']")).isDisplayed());

        driver.quit();
    }

    @Test
    public void adminAddVoter() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Login
        CommonFunctions.login(driver, usernameAdmin, passwordAdmin);

        // Create homepage object
        PageAdminHome objAdmin = new PageAdminHome(driver);

        // Click elections tab
        objAdmin.clickElectionTab();

        // Create elections page object
        PageAdminElections objElection = new PageAdminElections(driver);

        // Click edit election
        objElection.clickFirstElectionEditButton();

        // Create edit election page object
        PageAdminEditElection objEditElection = new PageAdminEditElection(driver);

        // Click voters tab
        objEditElection.clickVotersTab();

        // Click user to add dropdown
        objEditElection.clickVoterToAddDropdown();

        // Click voter to add
        objEditElection.clickVoterToAdd();

        // Click add voter button
        objEditElection.clickAddVoterButton();

        // Assert voter added to election
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flash']")).isDisplayed());

        driver.quit();
    }

    @Test
    public void adminAdvanceToVote() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Login
        CommonFunctions.login(driver, usernameAdmin, passwordAdmin);

        // Create homepage object
        PageAdminHome objAdmin = new PageAdminHome(driver);

        // Click elections tab
        objAdmin.clickElectionTab();

        // Create elections page object
        PageAdminElections objElection = new PageAdminElections(driver);

        // Click edit election
        objElection.clickFirstElectionEditButton();

        // Create edit election page object
        PageAdminEditElection objEditElection = new PageAdminEditElection(driver);

        // Click advance to vote button
        objEditElection.clickAdvanceToVoteButton();

        // Confirm advance to vote manually

        // Assert advanced to vote
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flash']")).getText().contains("State changed to: Vote"));

        driver.quit();
    }

    @Test
    public void adminAdvanceToClosed() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Login
        CommonFunctions.login(driver, usernameAdmin, passwordAdmin);

        // Create homepage object
        PageAdminHome objAdmin = new PageAdminHome(driver);

        // Click elections tab
        objAdmin.clickElectionTab();

        // Create elections page object
        PageAdminElections objElection = new PageAdminElections(driver);

        // Click edit election
        objElection.clickSecondElectionEditButton();

        // Create edit election page object
        PageAdminEditElection objEditElection = new PageAdminEditElection(driver);

        // Click advance to closed button
        objEditElection.clickAdvanceToClosedButton();

        // Confirm advance to closed manually

        // Assert advanced to closed
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flash']")).getText().contains("State changed to: Closed"));

        driver.quit();
    }
}
