package com.techtorial.appium.intro;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class LocatorTypes {
    DesiredCapabilities desiredCapabilities;
    File apkFile;
    URL appiumServerUrl;
    AndroidDriver<AndroidElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        apkFile = new File("src\\test\\resources\\ApiDemos-debug.apk");

        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "borsok");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID);
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator1");
        desiredCapabilities.setCapability(MobileCapabilityType.APP, apkFile.getAbsolutePath());
        appiumServerUrl = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<AndroidElement>(appiumServerUrl,
                desiredCapabilities);

    }

    @Test
    public void locators(){
        // accessibility id
        AndroidElement accessibility = driver.findElementByAccessibilityId("Accessibility");
        accessibility.click();

        //className[@attribute='value']
        AndroidElement customView = driver.findElement(By.xpath("//android.widget.TextView[@text='Custom View']"));
        customView.click();
    }

    @Test
    public void locator2(){
        //resource-id == id in selenium
        AndroidElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
        view.click();


        //"attribute("value")
        AndroidElement chronometer = driver.findElementByAndroidUIAutomator("text(\"Chronometer\")");

    }




}
