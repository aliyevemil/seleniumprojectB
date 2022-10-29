package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task5_getAttribute {


    @Test
    public void task5_test() {


        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com/registration_form
        Driver.getDriver().get("https://practice.cydeo.com/registration_form");

        //3- Verify header text is as expected:

        //  Expected: Registration form
        WebElement header = Driver.getDriver().findElement(By.className("page-header"));
        String expectedHeader = "Registration form";
        String actualHeader = header.getText();
        Assert.assertEquals(actualHeader,expectedHeader);
        //4- Locate “First name” input box
        WebElement firstname = Driver.getDriver().findElement(By.name("firstname"));


        //5- Verify placeholder attribute’s value is as expected:
        //  Expected: first name
        String actualFirstname="first name";
        String expectedFirstname=firstname.getAttribute("placeholder");

        Assert.assertEquals(actualFirstname,expectedFirstname);

    }
}
