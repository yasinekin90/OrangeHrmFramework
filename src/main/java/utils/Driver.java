package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Driver {

   private static WebDriver driver;


   public static WebDriver getDriver(){

        if(driver==null){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }
        return driver;
    }


    public static WebDriverWait waitDriver(){

        return waitDriver(5);
    }

    public static WebDriverWait waitDriver(int sec){

        return new WebDriverWait(driver, Duration.ofSeconds(sec));
    }


}
