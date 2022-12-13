package Test_Hiritage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class test04 extends Parent {

    @Test
    public void test(){

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
