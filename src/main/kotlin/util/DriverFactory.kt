package util

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import java.util.concurrent.TimeUnit

object DriverFactory {

    val browser: WebDriver
        get() {

            var _driver: WebDriver
            val ChromeDriverPath = System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver"
            System.setProperty("webdriver.chrome.driver", ChromeDriverPath)

            /*
            Todo
            Read the driver name from the config and intialize the driver accordingly
            */

            // Initialize chrome driver
            _driver = ChromeDriver()
            _driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS)
            _driver.manage().window().maximize()
            return _driver

        }



}