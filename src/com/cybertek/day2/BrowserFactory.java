package com.cybertek.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
    public static WebDriver getDriver(String browser){
        if(browser.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","/Users/ruslanbaltabayev/Documents/Selenium/drivers/chromedriver");
            return new ChromeDriver();
        }else if(browser.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","/Users/ruslanbaltabayev/Documents/Selenium/drivers/geckodriver");
            return new FirefoxDriver();
        }else
            return null;


    }
}
