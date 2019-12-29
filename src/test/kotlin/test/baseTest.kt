package test

import org.openqa.selenium.WebDriver
import org.testng.Assert
import org.testng.annotations.AfterTest
import org.testng.annotations.BeforeTest
import org.testng.annotations.Test
import page.BasePage
import page.HomePage
import page.LoginPage
import util.DriverFactory
import util.UtilResources

class baseTest() {

    private var _driver: WebDriver? = null
    internal lateinit var basePage: BasePage
    internal lateinit var loginPage: LoginPage
    internal lateinit var homePage: HomePage

    @BeforeTest
    fun setUp() {
        _driver = DriverFactory.browser
        _driver!!.get(UtilResources.getProperties("baseURL"))
    }

    @AfterTest
    fun tearDown() {
        _driver?.quit()
    }

    @Test
    fun login() {
        basePage = BasePage(_driver!!)
        homePage = HomePage(_driver!!)
        loginPage = LoginPage(_driver!!)
        basePage.clickLoginButton()
        loginPage.login(UtilResources.getProperties("username"), UtilResources.getProperties("password"))
        Assert.assertEquals(homePage.getLoginMessage(), "Logged in successfully")
    }

    @Test
    fun searchProduct() {

    }


}