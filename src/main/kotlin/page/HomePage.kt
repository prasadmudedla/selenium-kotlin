package page

import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy
import org.openqa.selenium.support.PageFactory
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait


class HomePage (private val _driver: WebDriver) {

    init {
        PageFactory.initElements(_driver, this)
    }



    @FindBy(css = "#content > div.alert.alert-success")
    private val _successMessage: WebElement? = null

    @FindBy(id = "keywords")
    private val _searchBar: WebElement? = null

    @FindBy(css = "input[type='submit']")
    private val _submitButton: WebElement? = null

    fun getLoginMessage(): String {
        var ele = WebDriverWait(_driver, 10)
            .until { ExpectedConditions.visibilityOf(_successMessage) }
        return _successMessage!!.text
    }




}
