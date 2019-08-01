package com.cybertek.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SecondAutomationScript {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/ruslanbaltabayev/Documents/Selenium/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://amazon.com");
    }
}
