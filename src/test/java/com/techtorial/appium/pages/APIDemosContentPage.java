package com.techtorial.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class APIDemosContentPage {

    public APIDemosContentPage(AndroidDriver driver){
        PageFactory.initElements(driver,this);
    }


    @AndroidFindBy(uiAutomator = "text(\"Assets\")")
    AndroidElement assets;

    @AndroidFindBy(uiAutomator = "text(\"Clipboard\")")
    AndroidElement clipboard;
    @AndroidFindBy(uiAutomator = "text(\"Packages\")")
    AndroidElement packages;
    @AndroidFindBy(uiAutomator = "text(\"Provider\")")
    AndroidElement provider;
    @AndroidFindBy(uiAutomator = "text(\"Resources\")")
    AndroidElement resources;
    @AndroidFindBy(uiAutomator = "text(\"Storage\")")
    AndroidElement storage;
}
