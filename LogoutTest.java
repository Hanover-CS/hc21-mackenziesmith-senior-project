package tests;

import functions.CommonFunctions;
import functions.PageAdminHome;
import functions.PageLogin;
import functions.PageUserHome;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogoutTest {

    private static String usernameAdmin = "admin";
    private static String passwordAdmin = "adminpass";
    private static String usernameUser = "test";
    private static String passwordUser = "testpass";

    @Test
    public void logoutAsAdmin() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Create login page object
        PageLogin objLogin = new PageLogin(driver);

        CommonFunctions.login(driver, usernameAdmin, passwordAdmin);

        // Create admin homepage object
        PageAdminHome objLogout = new PageAdminHome(driver);

        objLogout.clickLogoutLink();

        // Assert logout successful
        Assert.assertEquals(objLogin.getPageHeader(), "Faculty elections");

        driver.quit();
    }

    @Test
    public void logoutAsUser() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Create login page object and navigate to page
        PageLogin objLogin = new PageLogin(driver);

        CommonFunctions.login(driver, usernameUser, passwordUser);

        // Create user homepage object
        PageUserHome objLogout = new PageUserHome(driver);

        objLogout.clickLogoutLink();

        // Assert logout successful
        Assert.assertEquals(objLogin.getPageHeader(), "Faculty elections");

        driver.quit();
    }
}
