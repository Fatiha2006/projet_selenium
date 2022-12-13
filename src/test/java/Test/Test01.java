package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import  org.openqa.selenium.chrome.ChromeDriver;
import  org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;


public class Test01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Dev\\Drivers\\chromedriver.exe");
        WebDriver driver_chrome = new ChromeDriver();
        driver_chrome.get("https://www.softeaminstitute.fr/");
        driver_chrome.manage().window().maximize();

        String titre = driver_chrome.getTitle();

        System.out.println("le titre est " + titre);
        driver_chrome.get("https://www.softeaminstitute.fr/nos-formations/");

        driver_chrome.navigate().back();

        driver_chrome.navigate().forward();
        driver_chrome.navigate().refresh();



    }



}
