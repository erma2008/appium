package com.techtorial.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class APIDemosViews_ControlsPage {
    public APIDemosViews_ControlsPage(AndroidDriver driver){
        PageFactory.initElements(driver,this);
    }


    @AndroidFindBy(uiAutomator = "text(\"1. Light Theme\")")
    AndroidElement lightTheme;
    @AndroidFindBy(uiAutomator = "text(\"2. Dark Theme\")")
    AndroidElement darkTheme;
    @AndroidFindBy(uiAutomator = "text(\"3. Holo Light Theme\")")
    AndroidElement holoLightTheme;
    @AndroidFindBy(uiAutomator = "text(\"4. Holo Dark Theme\")")
    AndroidElement holoDarkTheme;
    @AndroidFindBy(uiAutomator = "text(\"5. Custom Theme\")")
    AndroidElement customTheme;
    @AndroidFindBy(uiAutomator = "text(\"6. Holo or Old Theme\")")
    AndroidElement holoOrOldTheme;


}
