package com.Utils;

import com.Base;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import static java.time.Duration.*;

public  class TestUtils extends Base {

    public  void scrollIntoView(String Text) {
        driver.findElementByAndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().text(\"" + Text + "\").instance(0))").click();
    }

    public static void scrollDown(){
        Dimension size = driver.manage().window().getSize();
        int scrollStart = (int) (size.getHeight() * 0.80);
        int scrollEnd = (int) (size.getHeight() * 0.20);

        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(ofSeconds(3)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();

    }


    public static void scrollNClick(By listItems, String Text){
        boolean flag = false;

        while(true){
            for(WebElement el: driver.findElements(listItems)){
                if(el.getAttribute("text").equals(Text)){
                    el.click();
                    flag=true;
                    break;
                }
            }
            if(flag)
                break;
            else
                scrollDown();
        }
    }
}
