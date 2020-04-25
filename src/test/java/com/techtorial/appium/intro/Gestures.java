package com.techtorial.appium.intro;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.TapOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.apache.tools.ant.taskdefs.Touch;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Gestures {
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
    public void tapGesture(){
    AndroidElement media = driver.findElementByAndroidUIAutomator("text(\"Media\")");
    TouchAction touchAction=new TouchAction(driver);

    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(media))).perform();


}

@Test
    public void test3(){
    TouchAction touchAction=new TouchAction(driver);

    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    AndroidElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
     touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(view))).perform();

    AndroidElement expList = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(expList))).perform();

    AndroidElement customAdapter = driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(customAdapter))).perform();

    AndroidElement dogNames = driver.findElementByAndroidUIAutomator("text(\"Dog Names\")");

    Assert.assertEquals("Text noT there","Dog Names",dogNames.getText());

}

@Test
    public void longPress(){
        TouchAction touchAction=new TouchAction(driver);

    AndroidElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(view))).perform();

    AndroidElement expList = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(expList))).perform();

    AndroidElement customAdapter = driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(customAdapter))).perform();

    AndroidElement dogNames = driver.findElementByAndroidUIAutomator("text(\"Dog Names\")");

    AndroidElement peopleNames = driver.findElementByAndroidUIAutomator("text(\"People Names\")");

    touchAction.longPress(LongPressOptions.longPressOptions().withDuration(Duration.ofSeconds(2))
    .withElement(ElementOption.element(peopleNames))).perform();

    AndroidElement sampleMenu = driver.findElementByAndroidUIAutomator("text(\"Sample menu\")");
    Assert.assertEquals("Failed to verify Sample Menu Text","Sample menu",sampleMenu.getText());
    Assert.assertTrue("Sample Menu Is not Displayed",sampleMenu.isDisplayed());

}

@Test
    public void longPress2(){
    TouchAction touchAction=new TouchAction(driver);


    AndroidElement view = driver.findElementByXPath("//android.widget.TextView[@text='Views']");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(view))).perform();

    AndroidElement expList = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(expList))).perform();

    AndroidElement customAdapter = driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");
    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(customAdapter))).perform();

    AndroidElement fishName = driver.findElementByAndroidUIAutomator("text(\"Fish Names\")");

    touchAction.tap(TapOptions.tapOptions().withElement(ElementOption.element(fishName))).perform();

    List<AndroidElement> elements=new ArrayList<>();
    AndroidElement goldy = driver.findElementByAndroidUIAutomator("text(\"Goldy\")");
    AndroidElement bubles = driver.findElementByAndroidUIAutomator("text(\"Bubbles\")");
    elements.add(goldy); elements.add(bubles);

    Assert.assertEquals(2,elements.size());

    for(AndroidElement element:elements){
        Assert.assertTrue(element.isDisplayed());
    }



}




}
