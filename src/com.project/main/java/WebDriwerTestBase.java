import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

/**
 * Created by AntonKa on 10/22/2017.
 */
public class WebDriwerTestBase {
    protected WebDriver driver;

    //How to pass System variable to Selenium Framework
    //mvn -Dbrowser = FF clean test  - to run test on different browsers
   // private String browser =  System.getProperty("browser");
    //Loads settings from test.properties file
//    long implicitWait = Long.parseLong(PropertiesCache.getProperty("wait.implicit"));
//    long loadingPageTime = Long.parseLong(PropertiesCache.getProperty("wait.loadingPage"));
//    long scriptSetTime = Long.parseLong(PropertiesCache.getProperty("wait.scriptSetTime"));


    @BeforeClass
    public void setUp() throws Exception {
       // Manually
        String pathToFileWindows = "F:\\QATournament\\TestProject\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", pathToFileWindows);
        //lib bonigarcia
//        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();

      //  setBrowser();
        setWebDriverSettings();

    }

    private void setWebDriverSettings() {
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(5, TimeUnit.SECONDS);
    }

//    public void setBrowser(){
//        BrowserEnum runBrowser = browser == null ? BrowserEnum.CHROME : BrowserEnum.valueOf(browser);
//        switch (runBrowser){
//            case CHROME:
//                ChromeDriverManager.getInstance().version("2.28").setup();
//                webDriver = new ChromeDriver();
//                break;
//            case FF:
//                FirefoxDriverManager.getInstance().setup();
//                webDriver = new FirefoxDriver();
//                break;
//        }
//    }

    @AfterClass
    public void tearDown() throws Exception {

        //driver.close();

        driver.quit();

    }
}
