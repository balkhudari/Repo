package com.Pages;

import com.Base;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


    public class ContactPage extends Base {

        @FindBy(id = "com.jayway.contacts:id/main_search")
        AndroidElement search ;


        @FindBy(xpath = "hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[1]")
       AndroidElement contactName;


        @FindBy(id= "com.jayway.contacts:id/phonenumber")
       private AndroidElement contactNum;

        @FindBy(id= "com.jayway.contacts:id/email")
        private AndroidElement email;

        @FindBy(id="com.jayway.contacts:id/street1")
        private AndroidElement streetAdress;

       // @FindBy(xpath= "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.LinearLayout/android.widget.ListView/android.widget.RelativeLayout[5]/android.widget.TextView")
    //  private AndroidElement name;

        public AndroidElement getEmail() {
            return email;
        }

        public AndroidElement getContactNum() {
            return contactNum;
        }

        public AndroidElement getStreetAdress() {
            return streetAdress;
        }

        public ContactPage(WebDriver driver) {
            PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        }

        public AndroidElement getContactName() {
            return contactName;
        }

        public void loginTest() {

            search.click();

            search.sendKeys("nadia");
             contactName.click();
        }



    }

