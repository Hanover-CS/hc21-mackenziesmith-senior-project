package tests;

import functions.CommonFunctions;
import functions.PageLogin;
import functions.PageUserHome;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    private static String usernameAdmin = "admin";
    private static String passwordAdmin = "adminpass";
    private static String usernameUser = "test";
    private static String passwordUser = "testpass";

    @Test
    public void loginAsAdmin() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();
        PageLogin objLogin = new PageLogin(driver);
        Assert.assertEquals(objLogin.getPageHeader(), "Faculty elections");
        objLogin.enterUsername(usernameAdmin);
        objLogin.enterPassword(passwordAdmin);
        objLogin.clickLoginBtn();
        driver.quit();
    }

    @Test
    public static void loginAsStandardUser() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();
        PageLogin objLogin = new PageLogin(driver);
        objLogin.enterUsername(usernameUser);
        objLogin.enterPassword(passwordUser);
        objLogin.clickLoginBtn();
        PageUserHome objUserHome = new PageUserHome(driver);
        Assert.assertEquals(objUserHome.getPageHeader(), "Current Elections");
        driver.quit();
    }

}
