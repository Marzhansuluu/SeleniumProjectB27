package com.cydeo.tests.day12_actions_jsexecuter_practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop{
    @Test
    public void drag_drop_test(){
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //Locate "Accept Cookies" button and click
        WebElement acceptCookie = Driver.getDriver().findElement(By.id("onetrust-accept-btn-handler"));
        acceptCookie.click();

        BrowserUtils.sleep(2);
   //Locate small and big circles to be able to drag them around
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));


        //2. Drag and drop the small circle to bigger circle.
        Actions action = new Actions(Driver.getDriver());
        action.dragAndDrop(smallCircle,bigCircle).perform();
        action.clickAndHold(smallCircle).pause(2000).moveToElement(bigCircle).release().perform();

        //3. Assert:
        //-Text in big circle changed to: “You did great!”
        String actualBigCircleText = bigCircle.getText();
        String expectedBigCircleText = "You did great!";

        Assert.assertEquals(actualBigCircleText, expectedBigCircleText);
    }
}
