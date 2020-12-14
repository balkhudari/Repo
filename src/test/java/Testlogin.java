import com.Base;
import com.Pages.ContactPage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class Testlogin extends Base {

    @Test
    public void loginTest() {

        ContactPage contactPage = new ContactPage(driver);
        contactPage.loginTest();





}
}



