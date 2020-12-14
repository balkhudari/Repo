package com;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;


public class Base {

    public static AndroidDriver<AndroidElement> driver;

    DesiredCapabilities capabilities1 = new DesiredCapabilities();

    @BeforeTest
    public void setupDriver() {
        capabilities1.setCapability("platformName", "Android");
        capabilities1.setCapability("appPackage", "com.jayway.contacts");
        capabilities1.setCapability("appActivity", "com.jayway.contacts.MainActivity");
        capabilities1.setCapability("deviceName", "DEF4C19418002178");
        capabilities1.setCapability("app", "C:\\Users\\balkhudari\\Downloads\\Contacts.apk");
        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities1);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
