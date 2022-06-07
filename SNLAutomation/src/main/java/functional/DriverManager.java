package functional;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager {
    private static DriverManager manager;
    private WebDriver driver;

    private int timeoutSeconds;

    private DriverManager(){
        timeoutSeconds =10;

        System.setProperty("webdriver.chrome.driver", "D:\\workspace\\Chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeoutSeconds));
    }
    public WebDriver getDriver(){
        return driver;
    }
    public static DriverManager getInstance(){
        if(manager == null){
            manager = new DriverManager();
        }
        return manager;
    }

    public void tearDown() {
        driver.quit();
    }
}
