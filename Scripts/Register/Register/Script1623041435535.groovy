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

WebUI.navigateToUrl('https://demo.nopcommerce.com/')

WebUI.click(findTestObject('Page_nopCommerce demo store/Register'))

WebUI.click(findTestObject('Page_nopCommerce demo store. Register/input_Gender_Male'))

WebUI.sendKeys(findTestObject('Page_nopCommerce demo store. Register/input_First name'), 'Renaldo')

WebUI.sendKeys(findTestObject('Page_nopCommerce demo store. Register/input_Last name'), 'Pontoh')

WebUI.selectOptionByValue(findTestObject('Page_nopCommerce demo store. Register/select_Day'), '17', true)

WebUI.selectOptionByValue(findTestObject('Page_nopCommerce demo store. Register/select_Month'), '10', true)

WebUI.selectOptionByValue(findTestObject('Page_nopCommerce demo store. Register/select_Year'), '1996', true)

WebUI.sendKeys(findTestObject('Page_nopCommerce demo store. Register/input_Email'), 'aldopontoh@test.com')

WebUI.sendKeys(findTestObject('Page_nopCommerce demo store. Register/input_Company name'), 'PT. Unknown')

WebUI.sendKeys(findTestObject('Page_nopCommerce demo store. Register/input_Password'), '123456')

WebUI.sendKeys(findTestObject('Page_nopCommerce demo store. Register/input_Confirm password'), '123456')

WebUI.click(findTestObject('Page_nopCommerce demo store. Register/button_Register'))

WebUI.verifyElementPresent(findTestObject('Page_nopCommerce demo store. Register/div_Your registration completed'), 5)

WebUI.click(findTestObject('Page_nopCommerce demo store. Register/ContinueButton'))

