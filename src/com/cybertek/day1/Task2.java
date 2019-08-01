package com.cybertek.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Task2 {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver","/Users/ruslanbaltabayev/Documents/Selenium/drivers/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().fullscreen();
        driver.get("http://practice.cybertekschool.com");

    }
}
