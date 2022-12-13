package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Test2 {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Dev\\Drivers\\chromedriver.exe");
        WebDriver driver_chrome = new ChromeDriver();
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
