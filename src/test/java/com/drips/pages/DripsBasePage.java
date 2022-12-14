package com.drips.pages;

import com.drips.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DripsBasePage {
    public DripsBasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='action skip contentarea']/..//a[contains(.,'Sign In')]")
    public WebElement SignInLink;


}
