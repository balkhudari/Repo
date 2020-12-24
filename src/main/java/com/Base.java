package com;
import com.Utils.CapabsReader;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    public static AndroidDriver<AndroidElement> driver;

    DesiredCapabilities capabilities1 = new DesiredCapabilities();

    @BeforeTest
    public void setupDriver() throws IOException {

      CapabsReader cap =new CapabsReader();
        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap.getCapabilities());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
/* capabilities1.setCapability("platformName",readConfig("platformName"));
        capabilities1.setCapability("appPackage", readConfig("appPackage"));
        capabilities1.setCapability("appActivity",readConfig("appActivity"));
        capabilities1.setCapability("deviceName", readConfig("deviceName"));
        capabilities1.setCapability("app",readConfig("app") );

        try {
            driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities1);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }*/