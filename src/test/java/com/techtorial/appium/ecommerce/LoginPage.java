package com.techtorial.appium.ecommerce;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.aspectj.lang.annotation.AdviceName;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private AndroidDriver<AndroidElement> driver;
    public LoginPage(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    @AndroidFindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    public AndroidElement countrySelection;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/nameField")
    public AndroidElement nameField;
    @AndroidFindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    public AndroidElement shopBtn;
    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Bolivia\"));")
    public AndroidElement bolivia;
    @AndroidFindBy(uiAutomator = "text(\"Please enter your name\")")
    public AndroidElement errorMessage;
    @AndroidFindBy(className = "android.widget.Toast")
    public AndroidElement toastMessage;

    @AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView(text(\"Air Jordan 9 Retro\"));")
    public AndroidElement airJordanRetro;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView[2]")
    public AndroidElement addToCart;

    @AndroidFindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    public AndroidElement cart;

    @AndroidFindBy(uiAutomator = "text(\"Please read our terms of conditions\")")
    public AndroidElement termsAndCondition;

    @AndroidFindBy(uiAutomator = "text(\"Terms Of Conditions\")")
    public AndroidElement headerTermsOfCon;

    @AndroidFindBy(uiAutomator = "text(\"CLOSE\")")
    public AndroidElement closeButton;

    @AndroidFindBy(uiAutomator = "text(\"Visit to the website to complete purchase\")")
    public AndroidElement completePurchase;


    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBarGoogle;

//    @AndroidFindBy(xpath = "//android.widget.Spinner[@content-desc='Search']")
//    public AndroidElement searchBar;


}
