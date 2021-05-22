package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLoginTitleVerification {
    public static void main(String[] args) {
        //open  Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to facebook
        driver.get("https://facebook.com");

        //Locating the web element using id locator and storing it in WebElement type.
        WebElement inputUsername = driver.findElement(By.id("email"));

        //3. Enter incorrect username
        inputUsername.sendKeys("something1213@gmail.com");

        //Locate the web element using
        WebElement inputPassword = driver.findElement(By.id("pass"));

        //4. Enter incorrect password
        inputPassword.sendKeys("some wrong password" + Keys.ENTER);

        //5. Verify title change to:
        //Expected: "Log into Facebook"
        String expectedTitle = "Log into Facebook";
        String actualTitle = driver.getTitle();



        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED!");
        }

    }
}


