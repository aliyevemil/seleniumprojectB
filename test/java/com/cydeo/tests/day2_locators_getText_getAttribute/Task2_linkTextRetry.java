package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task2_linkTextRetry {


    @Test
    public void linkText(){
        //1- Open a chrome browser
        //2- Go to: https://practice.cydeo.com
        Driver.getDriver().get("https://practice.cydeo.com ");
        WebElement abLink =Driver.getDriver().findElement(By.xpath("//a[.='A/B Testing']"));

        //3- Click to A/B Testing from top of the list.
        abLink.click();
        //4- Verify title is:
       String expectedTitle="No A/B Test";
       String actualTitle= Driver.getDriver().getTitle();
        //  Expected: No A/B Test
        Assert.assertEquals(actualTitle,expectedTitle);
        //5- Go back to home page by using the .back();
        BrowserUtils.sleep(2);
       Driver.getDriver().navigate().back();
        //6- Verify title equals:
        String verifyTitle = "Practice";
        String actualVerifyTitle=Driver.getDriver().getTitle();
        if (verifyTitle.equals(actualVerifyTitle)){
            System.out.println("The title is equal and verified");
        }else {
            System.out.println("The title is not equal and failed");
        }
        Driver.closeDriver();

    }
}
