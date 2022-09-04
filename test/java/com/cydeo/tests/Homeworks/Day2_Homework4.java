package com.cydeo.tests.Homeworks;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day2_Homework4 {
    public static void main(String[] args) {

        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs ");
        //3- Click to “Home” link
        WebElement homeLink= driver.findElement(By.className("nav-link"));
        homeLink.click();
        //4- Verify title is as expected:
        //Expected: Practice
        String expectedHomeLink="Practice";
        String actualHomeLink= driver.getTitle();

        if (actualHomeLink.equals(expectedHomeLink)){
            System.out.println("verification PASSED!");
        }else {
            System.out.println("verification FAILED!!!");
        }




    }
}
