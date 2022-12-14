package com.drips.pages;

import com.drips.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loggedUsersPage {
    public loggedUsersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//div[@class='message global demo']")
    public WebElement DemoStatement;
}
