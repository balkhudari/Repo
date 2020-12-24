import com.Base;
import com.Pages.ContactPage;
import com.Utils.TestUtils;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testlogin extends Base {

    @Test
    public void loginTest() {
      TestUtils utils= new TestUtils();
     ContactPage contactPage = new ContactPage(driver);
       // contactPage.loginTest();
        //  utils.scrollNClick(contactPage.name,"Irma Bolden");
        //  utils.scrollDown();

        utils.scrollIntoView("Irma Bolden");
        String expectedNum= "+1(232)-8335268";
        String expectedEmail= "irm@outlook.com";
         String expectedAdress= "307 Joyce Street";
         Assert.assertEquals(contactPage.getContactNum().getText(),expectedNum);
        Assert.assertEquals(contactPage.getEmail().getText(),expectedEmail);
        Assert.assertEquals(contactPage.getStreetAdress().getText(),expectedAdress);

    }

}



