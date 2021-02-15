package tests;

import atu.testrecorder.ATUTestRecorder;
import functions.CommonFunctions;
import functions.PageAdminCommittees;
import functions.PageAdminElections;
import functions.PageAdminHome;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import static sun.plugin2.util.SystemUtil.debug;

public class AdminCommitteesTest {

    private static String usernameAdmin = "admin";
    private static String passwordAdmin = "adminpass";
    private ATUTestRecorder recorder;

    @BeforeMethod
    public synchronized void beforeMethod(Method method) throws MalformedURLException {
        debug("Starting Execution of test case: " + method.getName());
        DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
        Date date = new Date();
        try {
            recorder = new ATUTestRecorder(System.getProperty("user.dir") + "\\ScriptVideos\\", method.getName() + "-" + dateFormat.format(date), false);
        } catch (Exception e) {
            debug("Error in finding the location of the video.");
        }

        try {
            recorder.start();
        } catch (Exception e) {
            debug("Error in starting the video");
        }
    }

    @AfterMethod
    public void afterMethod(ITestResult result) {
        try {
            recorder.stop();
        } catch (Exception e) {
            debug("Unable to stop the screen recording.");
        }
    }

    @Test
    public void manageCommitteeElection() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Login
        CommonFunctions.login(driver, usernameAdmin, passwordAdmin);

        // Create homepage object
        PageAdminHome objAdmin = new PageAdminHome(driver);

        // Click committees tab
        objAdmin.clickCommitteeTab();

        // Create committees page object
        PageAdminCommittees objCommittee = new PageAdminCommittees(driver);

        // Click FEC committee tab
        objCommittee.clickFECCommitteeTab();

        // Click Seat FEC-Tenured-1 manage election button
        objCommittee.clickFECFirstManageElectionButton();

        // Assert navigated to election
        Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Election for FEC-Tenured-1')]")).getText().contentEquals("Election for FEC-Tenured-1"));

        driver.quit();
    }

    @Test
    public void startCommitteeElection() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Login
        CommonFunctions.login(driver, usernameAdmin, passwordAdmin);

        // Create homepage object
        PageAdminHome objAdmin = new PageAdminHome(driver);

        // Click committees tab
        objAdmin.clickCommitteeTab();

        // Create committees page object
        PageAdminCommittees objCommittee = new PageAdminCommittees(driver);

        // Click FEC committee tab
        objCommittee.clickFECCommitteeTab();

        // Click Seat FEC-Tunured-2 start election button
        objCommittee.clickFECFirstStartElectionButton();

        // Assert navigated to election
        Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Election for FEC-Tenured-2')]")).getText().contentEquals("Election for FEC-Tenured-2"));

        driver.quit();
    }
}
