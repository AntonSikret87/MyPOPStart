import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by AntonKa on 10/22/2017.
 */
public class ResultPage extends BasePage {

    By linkLocator = By.xpath("//cite[@class='_Rm' and text() ='www.seleniumhq.org/']");
    private WebElement link;

    public ResultPage(WebDriver driver) {
        super(driver);
    }


    public String getLink() {
        link = driver.findElement(linkLocator);
        return link.getText();

    }
}
