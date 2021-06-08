import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demo.nopcommerce.com/')

WebUI.click(findTestObject('Page_nopCommerce demo store/span_Wishlist'))

WebUI.verifyElementPresent(findTestObject('Page_nopCommerce demo store. Wishlist/h1_Wishlist'), 5)

WebUI.sendKeys(findTestObject('Page_nopCommerce demo store. Wishlist/input_Search'), 'apple')

WebUI.click(findTestObject('Page_nopCommerce demo store. Wishlist/button_Search'))

WebUI.verifyElementPresent(findTestObject('Page_nopCommerce demo store. Search/img_produk'), 0)

WebUI.click(findTestObject('Page_nopCommerce demo store. Search/img_produk'))

WebUI.click(findTestObject('Page_nopCommerce demo store. Apple MacBook Pro 13-inch/button_Add to wishlist'))

WebUI.click(findTestObject('Page_nopCommerce demo store. Apple MacBook Pro 13-inch/span_wishlist_close'))

WebUI.click(findTestObject('Page_nopCommerce demo store. Apple MacBook Pro 13-inch/span_Wishlist'))

WebUI.click(findTestObject('Page_nopCommerce demo store. Wishlist/remove-from-cart'))

WebUI.verifyElementNotPresent(findTestObject('Page_nopCommerce demo store. Wishlist/a_Apple MacBook Pro 13-inch'), 5)

WebUI.closeBrowser()

