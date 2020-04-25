package com.techtorial.appium.intro;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class SwipeAction {
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
    public void swipe(){
        //views -> Date widgets -> inline
        TouchAction touchAction=new TouchAction(driver);
        AndroidElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(view))).perform();
        AndroidElement dateWidgets = driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(dateWidgets))).perform();
        AndroidElement inline = driver.findElementByAndroidUIAutomator("text(\"2. Inline\")");
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(inline))).perform();

        //find element doesnot take special characters
        //it will fail if in path it will contain any special characters
        //to ak eit pass replace them with .
        AndroidElement num5=driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='5']"));
        touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(num5))).perform();
       //num5.click();
        AndroidElement num15=driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='15']"));
        AndroidElement num40=driver.findElement(By.xpath("//android.widget.RadialTimePickerView.RadialPickerTouchHelper[@content-desc='40']"));
        touchAction.longPress(ElementOption.element(num15)).moveTo(ElementOption.element(num40)).release().perform();

//        touchAction.press(ElementOption.element(num15))
//                .moveTo(ElementOption.element(num40)).perform();
        List<AndroidElement> time = driver.findElementsById("//android.widget.TextView");

        AndroidElement hours = driver.findElementById("android:id/hours");
        AndroidElement minutes = driver.findElementById("android:id/minutes");
        AndroidElement column = driver.findElementById("android:id/separator");

        Assert.assertEquals("5:40",hours.getText()+column.getText()+minutes.getText());

        String finalTime="";
        for(AndroidElement element : time){
            finalTime+=element.getText();
        }

        System.out.println("final time : "+finalTime);

        Assert.assertTrue(finalTime.contains("5:40"));



    }





}
