package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.text.MessageFormat;

import static utils.Driver.waitDriver;

public class SelectAction {


    static final String button="//label[contains(.,\"{0}\")]/ancestor::div[2]//div[contains(@class,\"active\")]";
    public static void clickSelect(String locator) {

        By xpath = By.xpath(MessageFormat.format(button, locator));
        waitDriver(5).until(ExpectedConditions.elementToBeClickable(xpath)).click();
    }



}
