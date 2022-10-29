package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework_Task2 {

    @Test
    public void test1(){
        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html
        Driver.getDriver().get("http://zero.webappsecurity.com/login.html");

        //3. Verify header text
        WebElement header =Driver.getDriver().findElement(By.className("page-header"));

        String expectedHeader = "Log in to ZeroBank";
        String actualHeader = header.getText();

        if (expectedHeader.equals(actualHeader)){
            System.out.println("Test is Passed!");
        }else {
            System.out.println("Test is Failed");
        }
        //Expected: “Log in to ZeroBank”
    }
}
