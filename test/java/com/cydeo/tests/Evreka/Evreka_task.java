package com.cydeo.tests.Evreka;

import com.cydeo.tests.utilities.BrowserUtils;
import com.cydeo.tests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Evreka_task {

    @Test
    public void evraka_test(){
        //1. Go to 'https://www.amazon.com.tr/'
        Driver.getDriver().get("https://www.amazon.com.tr/");
        //2. Search iPhone13 512
        WebElement searchBox=Driver.getDriver().findElement(By.id("twotabsearchtextbox"));
        searchBox.click();
        searchBox.sendKeys("iPhone13 512"+ Keys.ENTER);

        BrowserUtils.sleep(2);
        WebElement popup=Driver.getDriver().findElement(By.id("a-autoid-0"));
        popup.click();


        //3. Check that the results are listed
        //4. Click iPhone13 at the top of the list
        WebElement iphone =Driver.getDriver().findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[7]/div/div/div/div/div[2]/div[1]/h2/a/span"));
        iphone.click();

        //5. Log the following values for each size
        //.Size information .Price .Color .Stock status
        WebElement price =Driver.getDriver().findElement(By.xpath("//*[@id=\"corePrice_feature_div\"]/div"));
        WebElement size =Driver.getDriver().findElement(By.className("selection"));
        WebElement stock =Driver.getDriver().findElement(By.xpath("//span[@class='a-size-medium a-color-success']"));
        WebElement color =Driver.getDriver().findElement(By.xpath("//img[@alt='Yıldız Işığı']"));
        WebElement model= Driver.getDriver().findElement(By.xpath("//a[@title='iPhone 13']"));

        System.out.println( model.getAttribute("title")+"  Size:" + size.getText());
        System.out.println("Color:" + color.getAttribute("alt")+" Price:" +price.getText()+"\n");
        System.out.println("Stock:" + stock.getText());




    }
}
