package com.cybertek.day2;

import org.openqa.selenium.WebDriver;

import java.util.Arrays;
import java.util.List;

public class TitleVerification {
    public static void main(String[] args) {
        List<String>urls =
                Arrays.asList("http://practice.cybertekschool.com/",
                        "http://practice.cybertekschool.com/dropdown",
                        "http://practice.cybertekschool.com/login");
        WebDriver driver = BrowserFactory.getDriver("chrome");

        for (String eachUrl:urls) {

            driver.get(eachUrl);
            String expectedTitle = "Practice";

            if(driver.getTitle().equals(expectedTitle))
                System.out.println("passed");
            else
                System.out.println("failed");
                System.out.println("Expected Tite "+expectedTitle);
                System.out.println("Actual tite "+driver.getTitle());

        }

        driver.close();


    }
}
