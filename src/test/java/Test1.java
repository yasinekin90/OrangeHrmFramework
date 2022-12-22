import org.testng.annotations.Test;
import static actions.InputAction.*;
import static actions.ButtonAction.*;
import static actions.PropertyAction.*;
import static utils.Driver.*;
import static actions.SelectAction.*;
public class Test1 {
    @Test
    public void test1(){

        getDriver().get(getProperty("url"));
        sendKeys("Username",getProperty("username"));
        sendKeys("Password",getProperty("password"));
       click("Login");
       click("Admin");
       clickSelect("User Role");
       click("Job");



    }
}
