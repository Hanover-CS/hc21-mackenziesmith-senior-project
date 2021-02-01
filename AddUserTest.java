package tests;

import functions.CommonFunctions;
import functions.PageAdminHome;
import functions.PageAdminProfiles;
import functions.PageLogin;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static sun.misc.Version.println;

public class AddUserTest {

    private static String usernameAdmin = "admin";
    private static String passwordAdmin = "adminpass";

    @Test
    public void adminAddUser() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Create login page object and login
        PageLogin objLogin = new PageLogin(driver);
        CommonFunctions.login(driver, usernameAdmin, passwordAdmin);

        // Create homepage object
        PageAdminHome objAdminHome = new PageAdminHome(driver);

        // Navigate to profiles tab
        objAdminHome.clickProfilesTab();

        // Create profiles page object
        PageAdminProfiles objAddUser = new PageAdminProfiles(driver);

        // Add new user
        objAddUser.clickAddUserButton();
        objAddUser.enterUsername("testUser4");
        objAddUser.enterFirstName("Test");
        objAddUser.enterLastName("User");
        objAddUser.clickDivisionDropdown();
        objAddUser.clickArtsDivision();
        objAddUser.clickContractDropdown();
        objAddUser.clickAdminContract();
        objAddUser.clickSubmitUserButton();

        //Assert User was added by checking table
        Assert.assertTrue(driver.findElement(By.xpath("//div[@id='flash']")).getText().contains("profile for testUser4 created."));

        driver.quit();
    }
}
