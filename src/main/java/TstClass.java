import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by banfi on 25.03.15.
 */
public class TstClass {

    private WebDriver driver = new FirefoxDriver();

    public WebDriver getDriver() {
        return driver;
    }

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    public void getOnetAndDoNothing(){
        driver.get("http://onet.pl");
        System.out.print(driver.getTitle());

    }
    public String returnTitle(){
        String title = driver.getTitle();
        return title;
    }
    public void driverQuit(){
        driver.quit();
    }
}
