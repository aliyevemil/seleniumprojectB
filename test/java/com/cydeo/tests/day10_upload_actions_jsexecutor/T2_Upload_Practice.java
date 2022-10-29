package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {

    @Test
    public void upload_test(){
        //1. Go to https://practice.cydeo.com/upload
        //2. Find some small file from your computer, and get the path of it.
        Driver.getDriver().get("https://practice.cydeo.com/upload");
        //3. Upload the file.
        String path="C:\\Users\\Emil\\Desktop\\HTML Class\\cybertruck.jpg";
        WebElement fileUpload=Driver.getDriver().findElement(By.id("file-upload"));
        BrowserUtils.sleep(2);
       fileUpload.sendKeys(path);

       WebElement uploadButton=Driver.getDriver().findElement(By.id("file-submit"));
       uploadButton.click();
       WebElement fileUploadedHeader = Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(fileUploadedHeader.isDisplayed());
        //4. Assert:
        //-File uploaded text is displayed on the page
        //
    }





}
