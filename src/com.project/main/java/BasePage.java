import org.openqa.selenium.WebDriver;

/**
 * Created by AntonKa on 10/20/2017.
 */
public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;


    }

    public void open(String url){
        driver.get(url);
    }


}


