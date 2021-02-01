package tests;

import functions.CommonFunctions;
import functions.PageLogin;
import functions.PageUserHome;
import org.openqa.selenium.By;
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

        // Create login page object and navigate to page
        PageLogin objLogin = new PageLogin(driver);
        Assert.assertEquals(objLogin.getPageHeader(), "Faculty elections");

        objLogin.enterUsername(usernameAdmin);
        objLogin.enterPassword(passwordAdmin);
        objLogin.clickLoginBtn();

        // Assert login successful
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isDisplayed());

        driver.quit();
    }

    @Test
    public static void loginAsStandardUser() throws InterruptedException {
        ChromeDriver driver = CommonFunctions.initDriver();

        // Create login page object and navigate to page
        PageLogin objLogin = new PageLogin(driver);
        Assert.assertEquals(objLogin.getPageHeader(), "Faculty elections");

        objLogin.enterUsername(usernameUser);
        objLogin.enterPassword(passwordUser);
        objLogin.clickLoginBtn();

        // Create user homepage object to get page header
        PageUserHome objUserHome = new PageUserHome(driver);

        // Assert login successful by getting page header
        Assert.assertEquals(objUserHome.getPageHeader(), "Current Elections");

        driver.quit();
    }

}
