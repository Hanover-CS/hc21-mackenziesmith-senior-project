package functions;

import org.openqa.selenium.chrome.ChromeDriver;

public class CommonFunctions {

    public static ChromeDriver initDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\macke\\AppData\\Roaming\\chromedriver_win32\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("localhost:8120");
        return driver;
    }
}
