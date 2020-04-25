package com.techtorial.appium.ecommerce;

import com.techtorial.appium.utils.AndroidDriverUtil;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.net.MalformedURLException;
import java.time.Duration;
import java.util.Set;

public class EcommerceIntroClass {

    AndroidDriver <AndroidElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities= AndroidDriverUtil.setUDesiredCapabilities("ecommerceApp");
        driver=AndroidDriverUtil.getAndroidDriver(desiredCapabilities);
    }

    @Test
    public void test1(){
        //D:\java class videos\Appium\src\test\resources\ecommerceApp.apk
        LoginPage loginPage=new LoginPage(driver);
    loginPage.nameField.sendKeys("techtorial");
    driver.hideKeyboard();
    loginPage.countrySelection.click();

    loginPage.bolivia.click();
    loginPage.shopBtn.click();
    }

    @Test
    public void negativeTest(){
        //D:\java class videos\Appium\src\test\resources\ecommerceApp.apk
        LoginPage loginPage=new LoginPage(driver);
        loginPage.shopBtn.click();


        Assert.assertEquals("Please enter your name",loginPage.toastMessage.getAttribute("name"));
    }
    @Test
    public void testCart(){
        //D:\java class videos\Appium\src\test\resources\ecommerceApp.apk
        LoginPage loginPage=new LoginPage(driver);
        loginPage.nameField.sendKeys("techtorial");
        driver.hideKeyboard();
//        loginPage.countrySelection.click();
//        loginPage.bolivia.click();
        loginPage.shopBtn.click();
        loginPage.airJordanRetro.click();

        loginPage.addToCart.click();

        loginPage.cart.click();


        TouchAction touchAction=new TouchAction(driver);

//        touchAction.longPress(LongPressOptions.longPressOptions()
//                .withDuration(Duration.ofSeconds(2))
//                .withElement(ElementOption.element(loginPage.termsAndCondition))).perform();
//
//        Assert.assertTrue(loginPage.headerTermsOfCon.isDisplayed());
//        loginPage.closeButton.click();
        loginPage.completePurchase.click();

        Set<String> contextHandles=driver.getContextHandles();
        System.out.println(contextHandles);

//        for(String window:contextHandles){
//            if(window.startsWith("WEBVIEW")){
//                driver.context(window);
//            }
//        }
        driver.context("WEBVIEW_com.androidsample.generalstore");

        WebElement search = driver.findElement(By.xpath("//input[@name='q']"));
        search.sendKeys("hello"+ Keys.ENTER);

    }
}
