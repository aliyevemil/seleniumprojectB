package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework_Task3 {

    @Test
    public void test1(){
        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        //2- Go to: https://google.com
        Driver.getDriver().get("https://google.com");

        //3- Click to Gmail from top right.
        WebElement gmailButton = Driver.getDriver().findElement(By.className("gb_d"));
        gmailButton.click();

        //4- Verify title contains:
        //  Expected: Gmail
        //5- Go back to Google by using the .back();
        //6- Verify title equals:
        //  Expected: Google
    }
}
