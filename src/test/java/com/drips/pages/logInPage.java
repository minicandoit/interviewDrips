package com.drips.pages;

import com.drips.utilities.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInPage {
    public logInPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "login[username]")
    public WebElement EmailTextbox;
    @FindBy(name = "login[password]")
    public WebElement PasswordTextbox;
    @FindBy(id = "send2")
    public WebElement SignInButton;


}
