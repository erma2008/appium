package com.techtorial.appium.intro;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumIntro {
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
    public void firstCall() throws MalformedURLException {





        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        AndroidElement preference = driver.findElementByAccessibilityId("Preference");
        preference.click();
        AndroidElement defaultPreference=driver.findElementByAccessibilityId("4. Default values");
        defaultPreference.click();
        AndroidElement checkBox = driver.findElementById("android:id/checkbox");
        checkBox.click();


    }


    @Test
    public void secondCall() {

        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT,300);

        driver.findElement(By.xpath("//android.widget.TextView[@text='Media']"));

    }


}
