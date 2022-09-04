package com.cydeo.tests.day6_alerts_iframes_windows;

import com.cydeo.tests.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropdownPractices {
    public WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        //TC #5: Selecting state from State dropdown and verifying result
        //1. Open Chrome browser
         driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //2. Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

    }

    @Test
    public void dropdown_task5() throws InterruptedException {


        Select stateDropdown =new Select(driver.findElement(By.xpath("//select[@id='state']")));

        //3. Select Illinois
        Thread.sleep(1000);
        stateDropdown.selectByVisibleText("Illinois");
        //4. Select Virginia
        Thread.sleep(1000);
        stateDropdown.selectByValue("VA");
        //5. Select California
       Thread.sleep(1000);
        stateDropdown.selectByIndex(5);
        //6. Verify final selected option is California.
        String expectedOptionText="California";
        String actualOptionText=stateDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(actualOptionText,expectedOptionText);
        //Use all Select options. (visible text, value, index)
    }

    @Test
    public void dropdown_task6(){

        // Select “December 1st, 1923” and verify it is selected.
        Select yearDropdown =new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown =new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown =new Select(driver.findElement(By.xpath("//select[@id='day']")));


        //Select year using  : visible text
        //Select month using   : value attribute
        //Select day using : index number
        //
    }
}