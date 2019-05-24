/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author Andres Felipe
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        //Codigo Selenium

        // Crear un driver objeto que controle Chroem
        System.setProperty("webdriver.chrome.driver", 
                "F:\\Automatizacion\\Selenium\\Driver\\Otra\\chromedriver.exe");
        
        WebDriver driver = new ChromeDriver();
        driver.get("https://aliados.dev.rappi.com/#/");
        
        System.out.println(driver.getTitle()); //Valida si el titulo de la pagina es correcto
        System.out.println(driver.getCurrentUrl()); //Valida si estamos url correcta
        //System.out.println(driver.getPageSource()); //Codigo fuente de la pagina en la consola
        driver.get("http://google.com");
        driver.navigate().back();//se devuelve
        Thread.sleep(5000); //Espera antes de un objeto
        driver.close();

    }

}
