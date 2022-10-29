package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Homework_Task1 {

    @Test
    public void test1(){
        // TC #1: Etsy Title Verification
        //1. Open Chrome browser
        //2. Go to https://www.etsy.com
        Driver.getDriver().get("https://www.etsy.com");
        //3. Search for “wooden spoon”
        WebElement searchBox =Driver.getDriver().findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon"+ Keys.ENTER);
        //4. Verify title:
        String expectedTitle ="Wooden spoon - Etsy";
        String actualTitle =Driver.getDriver().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        //Expected: “Wooden spoon | Etsy”
    }
}
