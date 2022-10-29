package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {

     @Test
    public void test_4_5(){
         // Open a chrome browser
         //        //2- Go to: https://practice.cydeo.com/
         Driver.getDriver().get("https://practice.cydeo.com/");
         Actions actions=new Actions(Driver.getDriver());
         //        //3- Scroll down to “Powered by CYDEO”
         WebElement cydeoLinkButton=Driver.getDriver().findElement(By.linkText("CYDEO"));
        actions.moveToElement(cydeoLinkButton).perform();
         //        //4- Scroll using Actions class “moveTo(element)” method
        actions.sendKeys(Keys.PAGE_UP,Keys.PAGE_UP).perform();
        Driver.closeDriver();
     }
     @Test
    public void test2(){
         Driver.getDriver().get("https://practice.cydeo.com/");
         Driver.closeDriver();
     }
    @Test
    public void test3(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }
    @Test
    public void test4(){
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

}
