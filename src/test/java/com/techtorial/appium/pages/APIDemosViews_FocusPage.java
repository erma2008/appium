package com.techtorial.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class APIDemosViews_FocusPage {

    public APIDemosViews_FocusPage(AndroidDriver driver){
        PageFactory.initElements(driver,this);
    }


    @AndroidFindBy(uiAutomator = "text(\"1. Vertical\n\")")
    AndroidElement vertical;
    @AndroidFindBy(uiAutomator = "text(\"2. Horizontal\n\")")
    AndroidElement horizontal;
    @AndroidFindBy(uiAutomator = "text(\"3. Circular\n\")")
    AndroidElement circular;
    @AndroidFindBy(uiAutomator = "text(\"4. Internal Selection\n\")")
    AndroidElement internalSelection;
    @AndroidFindBy(uiAutomator = "text(\"5. Sequential (Tab Order)\n\")")
    AndroidElement sequential;
}
