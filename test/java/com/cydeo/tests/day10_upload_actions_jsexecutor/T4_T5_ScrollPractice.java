package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T4_T5_ScrollPractice {

    @Test
    public void scroll_test(){
        // Open a chrome browser
        //2- Go to: https://practice.cydeo.com/
        Driver.getDriver().get("https://practice.cydeo.com/");

        //3- Scroll down to “Powered by CYDEO”
        JavascriptExecutor scroll=(JavascriptExecutor) Driver.getDriver();
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(1);
            scroll.executeScript("window.scrollBy(0,750)");
        }

        //4- Scroll using Actions class “moveTo(element)” method
        //
        //
        //TC #5: Scroll practice 2
        //1- Continue from where the Task 4 is left in the same test.
        for (int i = 0; i < 3; i++) {
            BrowserUtils.sleep(1);
            scroll.executeScript("window.scrollBy(0,-750)");
        }
        //2- Scroll back up to “Home” link using PageUP button



    }
}
