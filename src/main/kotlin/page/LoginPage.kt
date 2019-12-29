package page

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory


class LoginPage (private val _driver: WebDriver) {

    init {
        PageFactory.initElements(_driver, this)
    }

    @FindBy(id = "spree_user_email")
    private val _usernameField: WebElement? = null

    @FindBy(id = "spree_user_password")
    private val _passwordField: WebElement? = null

    @FindBy(css = "#new_spree_user > p:nth-child(4) > input")
    private val _submitButton: WebElement? = null

    fun enterValue(_field: WebElement?, _value:String) {
        _field!!.click()
        _field!!.clear()
        _field!!.sendKeys(_value)
    }

    fun clickButton(_button: WebElement?) {
        _button!!.click()
    }

    fun login(_userName:String, _password:String) {
        enterValue(_usernameField, _userName)
        enterValue(_passwordField, _password)
        clickButton(_submitButton)
    }


}