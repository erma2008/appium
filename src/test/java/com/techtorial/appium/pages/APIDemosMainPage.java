package com.techtorial.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class APIDemosMainPage {

    public APIDemosMainPage(AndroidDriver driver){
        PageFactory.initElements(driver,this);

    }



    @AndroidFindBy(id = "Accessibility")
    AndroidElement accessibility;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Animation']")
    AndroidElement animation;
    @AndroidFindBy(accessibility = "App")
    AndroidElement app;

    @AndroidFindBy(uiAutomator = "text(\"Content\")")
    AndroidElement content;
    @AndroidFindBy(uiAutomator = "text(\"Graphics\")")
    AndroidElement graphics;
    @AndroidFindBy(uiAutomator = "text(\"Media\")")
    AndroidElement media;
    @AndroidFindBy(uiAutomator = "text(\"NFC\")")
    AndroidElement nfc;
    @AndroidFindBy(uiAutomator = "text(\"OS\")")
    AndroidElement os;
    @AndroidFindBy(uiAutomator = "text(\"Preference\")")
    AndroidElement preference;
    @AndroidFindBy(uiAutomator = "text(\"Text\")")
    AndroidElement text;
    @AndroidFindBy(xpath ="//android.widget.TextView[@text='Views']")
    AndroidElement views;


}
