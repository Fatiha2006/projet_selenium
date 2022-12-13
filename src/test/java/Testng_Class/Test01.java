
package Testng_Class;



import org.openqa.selenium.By;


import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class Test01 extends Parent{


    @Test
    public void essayeTest1() {


        driver_chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver_chrome.get("https://www.softeaminstitute.fr/");
        driver_chrome.manage().window().maximize();
        WebElement croix = driver_chrome.findElement(By.className("paoc-close-popup"));
        croix.click();
        WebElement search = driver_chrome.findElement(By.cssSelector("input[placeholder='Rechercher...']"));
        search.sendKeys("Selenium ");
        WebElement loup = driver_chrome.findElement(By.className("searchsubmit"));
        loup.click();

    }


}