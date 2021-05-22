package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        //set up browser driver
        WebDriverManager.chromedriver().setup();

        //create object of selenium web driver
        WebDriver driver = new ChromeDriver();

        //3 - get the page for Tesla.com
        driver.get("http://www.tesla.com");

        System.out.println("Current title = " + driver.getTitle());

        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //putting  3 seconds of wait/stops the code for 3 sec
        Thread.sleep(2000);

        driver.navigate().back();

        Thread.sleep(3000);

        driver.navigate().forward();

        Thread.sleep(3000);

        driver.navigate().refresh();

        driver.navigate().to("http://www.google.com");

        System.out.println("Current title = " + driver.getTitle());

        currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

        //this line will basically maximize the browser size
        driver.manage().window().maximize();


    }
}