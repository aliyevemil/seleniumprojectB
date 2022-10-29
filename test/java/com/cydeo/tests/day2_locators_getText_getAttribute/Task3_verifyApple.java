package com.cydeo.tests.day2_locators_getText_getAttribute;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task3_verifyApple {

    @Test
    public void appleTest(){

        //1- Open a chrome browser
        //2- Go to: https://google.com
        Driver.getDriver().get("https://google.com");
        //3- Write “apple” in search box
        WebElement searchBox =Driver.getDriver().findElement(By.name("q"));

        //4- Click google search button
        searchBox.sendKeys("apple"+ Keys.ENTER);
        //5- Verify title:
        String expectedTitle="apple - Google'da Ara";
        String actualTitle =Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);
        //Expected: Title should start with “apple” word
        if (actualTitle.startsWith("apple")){
            System.out.println("title is true");
        }else {
            System.out.println("the title is failed");
        }
    }
}
