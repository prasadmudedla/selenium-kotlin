package page

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory

class BasePage(private val driver: WebDriver) {

    init {
        PageFactory.initElements(driver, this)
    }

    @FindBy(css = "#link-to-login")
    private val loginButton: WebElement? = null

    fun clickLoginButton() {
        loginButton?.click()
    }



}
