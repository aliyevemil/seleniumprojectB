package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.tests.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1_cydeoRetry {

    @Test
    public void cydeo(){

        //1. Open Chrome browser
        //2. Go to https://practice.cydeo.com
        Driver.getDriver().get("https://practice.cydeo.com");

        //3. Verify URL contains
         String expectedURL="cydeo";
         String actualURL=Driver.getDriver().getCurrentUrl();
        //Expected: cydeo
         if (actualURL.contains(expectedURL)){
             System.out.println("Currently URL contains cydeo");
         }else {
             System.out.println("URL failed and currrently URL not contains cydeo");
         }

        //4. Verify title:
        //  Expected: Practice

        String expectedTitle="Practice";
         String actualTitle =Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}
