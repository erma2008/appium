package com.techtorial.appium.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.PageFactory;

public class APIDemosViewsPage {

    public APIDemosViewsPage(AndroidDriver driver){
        PageFactory.initElements(driver,this);
    }


    @AndroidFindBy(uiAutomator = "text(\"Animation\")")
    AndroidElement animation;
    @AndroidFindBy(uiAutomator = "text(\"Auto Complete\n\")")
    AndroidElement autoComplete;
    @AndroidFindBy(uiAutomator = "text(\"Buttons\")")
    AndroidElement buttons;
    @AndroidFindBy(uiAutomator = "text(\"Chronometer\")")
    AndroidElement chronometer;
    @AndroidFindBy(uiAutomator = "text(\"Controls\")")
    AndroidElement controls;
    @AndroidFindBy(uiAutomator = "text(\"Custom\")")
    AndroidElement custom;
    @AndroidFindBy(uiAutomator = "text(\"Date Widgets\n\")")
    AndroidElement dateWidgets;
    @AndroidFindBy(uiAutomator = "text(\"Drag and Drop\n\")")
    AndroidElement dragAndDrop;
    @AndroidFindBy(uiAutomator = "text(\"Expandable Lists\n\")")
    AndroidElement expandableList;
    @AndroidFindBy(uiAutomator = "text(\"Focus\")")
    AndroidElement focus;
    @AndroidFindBy(uiAutomator = "text(\"Gallery\")")
    AndroidElement gallery;
    @AndroidFindBy(uiAutomator = "text(\"Game Controller Input\n\")")
    AndroidElement gameControllerInput;
    @AndroidFindBy(uiAutomator = "text(\"Grid\")")
    AndroidElement grid;
    @AndroidFindBy(uiAutomator = "text(\"Hover Events\n\")")
    AndroidElement hoverEvents;
    @AndroidFindBy(uiAutomator = "text(\"ImageButton\")")
    AndroidElement imageButton;
    @AndroidFindBy(uiAutomator = "text(\"ImageSwitcher\")")
    AndroidElement imageSwitcher;
    @AndroidFindBy(uiAutomator = "text(\"ImageView\")")
    AndroidElement imageView;
    @AndroidFindBy(uiAutomator = "text(\"Layout Animation\n\")")
    AndroidElement layoutAnimation;
    @AndroidFindBy(uiAutomator = "text(\"Layouts\")")
    AndroidElement layouts;
    @AndroidFindBy(uiAutomator = "text(\"Lists\")")
    AndroidElement lists;
    @AndroidFindBy(uiAutomator = "text(\"Popup Menu\")")
    AndroidElement popUpMenu;
    @AndroidFindBy(uiAutomator = "text(\"Progress Bar\")")
    AndroidElement progressBar;
    @AndroidFindBy(uiAutomator = "text(\"Radio Group\")")
    AndroidElement radioGroup;
    @AndroidFindBy(uiAutomator = "text(\"Rating Bar\")")
    AndroidElement ratingBar;
    @AndroidFindBy(uiAutomator = "text(\"Rotating Button\")")
    AndroidElement rotatingButton;
    @AndroidFindBy(uiAutomator = "text(\"ScrollBars\")")
    AndroidElement scrollBars;
    @AndroidFindBy(uiAutomator = "text(\"Search View\")")
    AndroidElement SearchView;
    @AndroidFindBy(uiAutomator = "text(\"Secure View\")")
    AndroidElement secureView;
    @AndroidFindBy(uiAutomator = "text(\"Seek Bar\")")
    AndroidElement seekBar;
    @AndroidFindBy(uiAutomator = "text(\"Spinner\")")
    AndroidElement spinner;
    @AndroidFindBy(uiAutomator = "text(\"Splitting Touches across Views\n\")")
    AndroidElement splittinTouchesAcrossViews;
    @AndroidFindBy(uiAutomator = "text(\"Switches\")")
    AndroidElement switches;
    @AndroidFindBy(uiAutomator = "text(\"System UI Visibility\n\")")
    AndroidElement systemUIVisibility;
    @AndroidFindBy(uiAutomator = "text(\"Tabs\")")
    AndroidElement tabs;
    @AndroidFindBy(uiAutomator = "text(\"TextClock\")")
    AndroidElement textClock;
    @AndroidFindBy(uiAutomator = "text(\"TextSwitcher\")")
    AndroidElement textSwitcher;
    @AndroidFindBy(uiAutomator = "text(\"Visibility\")")
    AndroidElement visibility;
    @AndroidFindBy(uiAutomator = "text(\"WebView\n\")")
    AndroidElement webView;


}
