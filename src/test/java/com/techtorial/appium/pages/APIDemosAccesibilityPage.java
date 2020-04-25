package com.techtorial.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class APIDemosAccesibilityPage {

    public APIDemosAccesibilityPage(AndroidDriver driver){
        PageFactory.initElements(driver,this);
    }


    @AndroidFindBy(id = "Accessibility Node Provider")
    AndroidElement accessNodeProvider;

    @AndroidFindBy(id = "Accessibility Node Querying")
    AndroidElement accessNodeQuerying;

    @AndroidFindBy(uiAutomator = "text(\"Accessibility Service\")")
    AndroidElement accesibilityService;

    @AndroidFindBy(uiAutomator = "text(\"Custom View\n\")")
    AndroidElement customView;


}
