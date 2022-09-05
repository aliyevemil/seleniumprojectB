package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_iframe_Practices {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        //1. Open browser
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //2. Go to website: https://practice.cydeo.com/iframe
        driver.get("https://practice.cydeo.com/iframe");


    }

    @Test
    public void iframe_test() {
        //We need to switch driver's focus to iframe
        //driver.switchTo().frame("mce_0_ifr");

        //option 2 - passing index number of iframe
        driver.switchTo().frame(0);

        // option 3 - locate as web element and pass in frame() method
       // driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']")));

        //Locate the p tag
        WebElement yourContentGoesHere= driver.findElement(By.xpath("//p"));

        Assert.assertTrue(yourContentGoesHere.isDisplayed());

        //Verify "An iFrame containing the TinyMCE WYSIWYG Editor"
        //To be able to verify the header, we must swiitch back to "main HTML"
        driver.switchTo().parentFrame();

        WebElement headerText = driver.findElement(By.xpath("//h3"));

        //assertion of header text is displayed or not
        Assert.assertTrue(headerText.isDisplayed());





        //4. Assert: “Your content goes here.” Text is displayed.


        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor”
    }
}
