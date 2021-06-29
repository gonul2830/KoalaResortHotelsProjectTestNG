package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    static private WebDriver driver;

    public static WebDriver getDriver(){


        if(driver==null) {
            switch (ConfigReader.getProperty("browser")){
                case "chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "opera" :
                    WebDriverManager.operadriver().setup();
                    driver= new OperaDriver();
                    break;
                case "safari" :
                    WebDriverManager.getInstance(SafariDriver.class);
                    driver = new SafariDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;



            }


        }



        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30 , TimeUnit.SECONDS);

        return driver;
    }
    public static void closeDriver(){
        if(driver != null) {
            driver.close();
            driver=null;
        }
    }
}
