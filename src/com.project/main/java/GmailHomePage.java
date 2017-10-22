import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by AntonKa on 10/22/2017.
 */
public class GmailHomePage extends BasePage{

   private By searchFiledLocator = By.name("q");
    //@FindBy(name = "q")
    private WebElement searchFiled;

    public GmailHomePage(WebDriver driver) {
       super(driver);
    }

    public void enterTextAndSearch(String enteredText){
        searchFiled = driver.findElement(searchFiledLocator);
        searchFiled.sendKeys(enteredText);
        searchFiled.submit();

    }
}
