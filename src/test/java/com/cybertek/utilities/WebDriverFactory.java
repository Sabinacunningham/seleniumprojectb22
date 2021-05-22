package com.cybertek.utilities;

// TASK: NEW METHOD CREATION
// Method name: getDriver
// Static method
// Accept String argument: browserType
// - This argument will determine what type of browser is opened
// - If "Chrome" passed --> it will open chrome browser
// - If "firefox" passes --> it will open firefox browser
// RETURN TYPE: "WebDriver"

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public static WebDriver getDriver(String browserType) { //what happened when we made it static?
        //we don't need to create an object of the class to call the method;

        if (browserType.equals("chrome")) {
            WebDriverManager.chromedriver().setup();

            return new ChromeDriver();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();

            return new FirefoxDriver();

        } else {
            System.out.println("Given browser type does not exist. Driver = null");
            return null;

        }

    }
}



