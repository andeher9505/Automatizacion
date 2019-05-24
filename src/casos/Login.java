/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.awt.windows.ThemeReader;

/**
 *
 * @author Andres Felipe
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        System.setProperty("webdriver.chrome.driver", 
                "F:\\Automatizacion\\Selenium\\Driver\\Otra\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://aliados.dev.rappi.com/#/");
        driver.findElement(By.xpath
        ("(.//*[normalize-space(text()) and normalize-space(.)='Seleccione el Pais'])[1]/following::div[2]")).
                click();
        driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Ingresar'])[1]/following::span[1]")).
                click();
        driver.findElement(By.name("email")).sendKeys("pruebasherrera5@gmail.com");
        driver.findElement(By.name("password")).sendKeys("andres123");
        driver.findElement(By.xpath("//button/span")).click();
        Thread.sleep(6000);
        driver.close();
    }
    
}
