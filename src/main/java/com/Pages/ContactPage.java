package com.Pages;

import com.Base;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class ContactPage extends Base {

        @FindBy(id = "com.jayway.contacts:id/main_search")
        AndroidElement search ;


        public ContactPage(WebDriver driver) {
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        }


        public void loginTest() {

            search.click();

            search.sendKeys("nadia");

        }



    }

