package Testng_Class;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Parent {
    WebDriver driver_chrome;

    @BeforeMethod
    public void Before(){
        //System.setProperty("webdriver.chrome.driver","C:\\Dev\\Drivers\\chromedriver.exe");
        WebDriverManager.edgedriver().setup();
        driver_chrome = new EdgeDriver();
        driver_chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @AfterMethod
    public void After(){

        driver_chrome.quit();
    }
}
