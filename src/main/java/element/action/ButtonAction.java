package element.action;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Driver;

import java.text.MessageFormat;
import static utils.Driver.*;

public class ButtonAction {

    String button = "//button[contains(.,\"{0}\")]";

    public void clickButton(String locator) {

        By xpath = By.xpath(MessageFormat.format(button, locator));
        waitDriver(5).until(ExpectedConditions.elementToBeClickable(xpath)).click();

    }


    //li//a[contains(.,"PIM")]
}
