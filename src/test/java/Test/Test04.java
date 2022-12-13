package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test04 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Dev\\Drivers\\chromedriver.exe");
        WebDriver driver_chrome = new ChromeDriver();
        driver_chrome.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver_chrome.get("https://www.softeaminstitute.fr/");
        driver_chrome.manage().window().maximize();
        WebElement croix = driver_chrome.findElement(By.className("paoc-close-popup"));
        croix.click();

        // affichage de nombre de formation
        WebElement li1 = driver_chrome.findElement(By.xpath("//ul[@class='cercles-wrapper']/li[1]/div[1]"));
        String NumberFormation = li1.getText();
        System.out.println("Nombre de formation proposer par softeam est : " + NumberFormation);

        // afficher de nombre de formation Atlas
        WebElement li2 = driver_chrome.findElement(By.xpath("//ul[@class='cercles-wrapper']/li[2]/div[1]"));
        String NumberAtlas = li2.getText();
        System.out.println("Nombre de formation Atlas proposer par softeam est : " + NumberAtlas);

        // afficher le nombre de formation CPF
        WebElement li3 = driver_chrome.findElement(By.xpath("//ul[@class='cercles-wrapper']/li[3]/div[1]"));
        String NumberCPF = li3.getText();
        System.out.println("Nombre de formation CPF proposer par softeam est : " +  NumberCPF);






    }
}
