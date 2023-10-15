package utilities;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class TestBaseCross {
    protected WebDriver driver;

    @Parameters("browser") //parametre notasyonu xml in buraya browser göndermesine izin verir.
    @BeforeMethod
    public void setUp(@Optional String browser){ //optional notasyonu

        driver= DriverCross.getDriver(browser); //optionaldan aldıgı browserı Driver cross'a
                                                // yollayıp istenilen chrome driver olusturuyor ve bunu drver a yolluyor

    }

    @AfterMethod
    public void tearDown(){

        DriverCross.closeDriver();
    }
}