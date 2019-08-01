package com.cybertek.day2;

import org.openqa.selenium.WebDriver;

public class TestingBrowserFactory {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");
        Thread.sleep(5000);

        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";

        if(actualTitle.equals(expectedTitle))
            System.out.println("passed");
        else
            System.out.println("failed");
            System.out.println("Expected Tite "+expectedTitle);
            System.out.println("Actual Title "+actualTitle);


        driver.close();
    }
}
