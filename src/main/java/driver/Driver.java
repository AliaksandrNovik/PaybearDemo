package driver;

import com.codeborne.selenide.Configuration;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.BeforeSuite;

/**
 * Created by aliaksandr on 2/25/18.
 */
public class Driver {

    @BeforeSuite(alwaysRun = true)
    public void setUpDriver() {
        ChromeDriverManager.getInstance().setup();
        Configuration.browser = "chrome";
    }
}
