package com.techtorial.appium.intro;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class AndroidKeyEventsIntro {
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
    public void keys(){

        TouchAction touchAction=new TouchAction(driver);
        AndroidElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(view))).perform();
        AndroidElement dateWidgets = driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(dateWidgets))).perform();
        AndroidElement inline = driver.findElementByAndroidUIAutomator("text(\"2. Inline\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(inline))).perform();

        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.BACK));
        driver.pressKey(new KeyEvent(AndroidKey.HOME));

    }


}
