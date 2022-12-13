package Test_Hiritage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class test05 extends Parent{

    @Test
    public void test(){

        driver_chrome.manage().window().maximize();
        WebElement croix = driver_chrome.findElement(By.className("paoc-close-popup"));
        croix.click();
        WebDriverWait w = new WebDriverWait(driver_chrome, 5);


        try {
            // identify element
            w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()=\"Trouvez votre prochaine formation\"]")));
            System.out.println("titre de la page d'acceuil est visible");
        }
        catch(NoSuchElementException n) {
            System.out.println("titre is invisible");
        }

        WebElement menu_formaation = driver_chrome.findElement(By.xpath("//a[text()=\"Nos formations\"]"));
        menu_formaation.click();



         WebElement titre_formation =  driver_chrome.findElement(By.xpath("//div[text()=\"Nos formations\"]"));
         System.out.println(titre_formation.getText());
        try {
            // identify element
            w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()=\"Nos formations\"]")));
            System.out.println("titre de la page formation est visible");
        }
        catch(NoSuchElementException n) {
            System.out.println("titre is invisible");
        }

        WebElement menu_formaation_developement = driver_chrome.findElement(By.xpath("//*[@id=\"mega-menu-item-124351\"]/a"));
        String developement = menu_formaation_developement.getText();
        if(developement.equals("Développement et développement Web") ){
            System.out.println("le titre est bon ");
        }else{
            System.out.println("le titre n'est pas bon ");
        }
    }
}
