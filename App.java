package com.assignmentnaga.my_assignmentnaga;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
        System.out.println( "Hello World!" );
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nagar\\Desktop\\Eclipse\\Work\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");        
//Web driver from pom file
        
        // WebDriverManager.chromedriver().setup();
        
        ChromeOptions chromeoptions = new ChromeOptions();
        chromeoptions.addArguments("--headless");
        WebDriver driver = new ChromeDriver(chromeoptions);
        
        System.out.println("Executing script");
        //1. Open Browser
        driver.get("https://www.facebook.com/login/");
        
        //enable wait for 3 seconds
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        
        //Give user name
        driver.findElement(By.id("email")).sendKeys("naga@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.id("pass")).sendKeys("*****");
        Thread.sleep(1000);
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(1000);
        driver.quit();
        System.out.println("Script execution complete");           

}
}
