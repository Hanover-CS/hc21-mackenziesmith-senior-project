package tests;

import functions.CommonFunctions;
import functions.PageUserElectionBallot;
import functions.PageUserHome;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserElectionsTest {

    private static String usernameUser = "test";
    private static String passwordUser = "testpass";

    @Test
    public void userDeclineToStand() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Login
        CommonFunctions.login(driver, usernameUser, passwordUser);

        // Create user homepage object
        PageUserHome objUser = new PageUserHome(driver);

        // Click decline to stand button
        objUser.clickDeclineToStandButton();

        // Assert user declined to stand
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flash']")).getText().contains("You declined to stand"));

        driver.quit();
    }

    @Test
    public void userWillingToStand() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Login
        CommonFunctions.login(driver, usernameUser, passwordUser);

        // Create user homepage object
        PageUserHome objUser = new PageUserHome(driver);

        // Click willing to stand button
        objUser.clickWillingToStandButton();

        // Assert user willing to stand
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flash']")).getText().contains("You elected to stand"));

        driver.quit();
    }

    @Test
    public void userVoteInElection() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Login
        CommonFunctions.login(driver, usernameUser, passwordUser);

        // Create user homepage object
        PageUserHome objUser = new PageUserHome(driver);

        // Click view ballot button
        objUser.clickViewBallotButton();

        // Create ballot object
        PageUserElectionBallot objVote = new PageUserElectionBallot(driver);

        // Select candidates and submit
        objVote.clickFirstCandidateButton();
        objVote.clickSecondCandidateButton();
        objVote.clickSubmitButton();
        // Click submit on alert manually

        // Assert ballot submitted
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flash']")).getText().contains("Your vote was recorded!"));

        driver.quit();
    }
}
