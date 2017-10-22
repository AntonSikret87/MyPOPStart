import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

/**
 * Created by AntonKa on 10/19/2017.
 */
public class TestClass extends WebDriwerTestBase {

    String expectedFirstUrl = "www.seleniumhq.org/";
        @Test
    public void testSearch(){
        GmailHomePage gmailHomePage= new GmailHomePage(driver);//PageFactory.initElements(driver, GmailHomePage.class);
        gmailHomePage.open("https://www.google.com");
        gmailHomePage.enterTextAndSearch("Selenium");
        ResultPage resultPage =new ResultPage(driver);
        String actualLink = resultPage.getLink();
        assertEquals(expectedFirstUrl, actualLink);
        }
}
