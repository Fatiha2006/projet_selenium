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

public class Test03 extends Parent {



        @Test
        public  void exo(){

            driver_chrome.get("https://www.softeaminstitute.fr/");
            driver_chrome.manage().window().maximize();
            WebElement croix = driver_chrome.findElement(By.className("paoc-close-popup"));
            croix.click();
            WebElement titre = driver_chrome.findElement(By.xpath("//h1[@class='title']"));
            String text = titre.getText();
            System.out.println(text);
            if(text.equals("Trouvez votre prochaine formation") ){
                System.out.println("le titre est bon ");
            }else{
                System.out.println("le titre n'est pas bon ");
            }

            if (titre.isDisplayed()){
                System.out.println("le titre est visible");
            }

            WebDriverWait w = new WebDriverWait(driver_chrome, 5);


            try {
                // identify element
                w.until(ExpectedConditions .visibilityOfElementLocated(By.xpath("//h1[@class='title']")));
                System.out.println("titre est visible");
            }
            catch(NoSuchElementException n) {
                System.out.println("titre is invisible");
            }

            try {

                w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='https://www.softeaminstitute.fr/nos-formations/']")));
                System.out.println("la rebrique Nos_formation est visible");
            }
            catch(NoSuchElementException n) {
                System.out.println("la rebrique est invisible");
            }


            try {

                w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Nos solutions\"]")));
                System.out.println("la Solution est visible");
            }
            catch(NoSuchElementException n) {
                System.out.println("la solution est invisible");
            }


            try {
                w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Nos approches\"]")));
                System.out.println("la rebrique approches est visible");
            }
            catch(NoSuchElementException n) {
                System.out.println("la rebrique approches est invisible");
            }


        }


    }


