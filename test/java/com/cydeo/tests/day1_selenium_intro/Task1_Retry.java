package com.cydeo.tests.day1_selenium_intro;

import com.cydeo.tests.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task1_Retry {


    @Test
    public void verifyYahoo(){
        //1. Open Chrome browser
        //2. Go to https://www.yahoo.com
        Driver.getDriver().get("https://www.yahoo.com ");
        // 3. Verify title:
        String expectedTitle="Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";
        String actualTitle = Driver.getDriver().getTitle();
        //Expected: Yahoo
        Assert.assertEquals(actualTitle,expectedTitle);

    }

}
