package Test_Hiritage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Parent {
   public WebDriver driver_chrome;

    @BeforeMethod
    public void Before(){
        //System.setProperty("webdriver.chrome.driver","C:\\Dev\\Drivers\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver_chrome = new ChromeDriver();
        driver_chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver_chrome.get("https://www.softeaminstitute.fr/");
    }
    @AfterMethod
    public void After(){


    }
}
