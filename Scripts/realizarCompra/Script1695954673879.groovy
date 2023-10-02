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

WebUI.openBrowser(GlobalVariable.baseUrl)

WebUI.navigateToUrl('http://opencart.abstracta.us/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Your Store/i_US Dollar_fa fa-user'))

WebUI.click(findTestObject('Page_Your Store/a_Login'))

WebUI.setText(findTestObject('Page_Account Login/input_E-Mail Address_email'), GlobalVariable.usuarioEmail)

WebUI.setText(findTestObject('Page_Account Login/input_Password_password'), password)

WebUI.click(findTestObject('Page_Account Login/input_Forgotten Password_btn btn-primary'))

WebUI.verifyElementText(findTestObject('Page_My Account/h2_My Account'), textoCuenta)

WebUI.setText(findTestObject('Page_Your Store/input_Your Store_search'), textoBuscar)

WebUI.click(findTestObject('Page_My Account/button_Your Store_btn btn-default btn-lg'))

WebUI.click(findTestObject('Page_Search - samsung/a_Samsung SyncMaster 941BW'))

WebUI.verifyElementText(findTestObject('Page_Samsung SyncMaster 941BW/h1_Samsung SyncMaster 941BW'), textoVerificar)

WebUI.click(findTestObject('Page_Samsung SyncMaster 941BW/button_Add to Cart'))

WebUI.verifyElementText(findTestObject('Page_Samsung SyncMaster 941BW/button_1 item(s) - 200.00'), textoCarrito)

WebUI.click(findTestObject('Page_Samsung SyncMaster 941BW/button_1 item(s) - 200.00'))

WebUI.click(findTestObject('Page_Samsung SyncMaster 941BW/strong_Checkout'))

WebUI.verifyElementText(findTestObject('Page_Checkout/h1_Checkout'), textoCheckout)

WebUI.setText(findTestObject('Page_Checkout/input_First Name_firstname'), firstName)

WebUI.setText(findTestObject('Page_Checkout/input_Last Name_lastname'), lastName)

WebUI.setText(findTestObject('Page_Checkout/input_Address 1_address_1'), address)

WebUI.setText(findTestObject('Page_Checkout/input_City_city'), city)

WebUI.selectOptionByLabel(findTestObject('Page_Checkout/select_- Country'), country, false)

WebUI.selectOptionByLabel(findTestObject('Page_Checkout/select_- Region'), region, false)

WebUI.click(findTestObject('Page_Checkout/input_Region  State_button-payment-address'))

WebUI.click(findTestObject('Page_Checkout/input_Region  State_button-shipping-address'))

WebUI.click(findTestObject('Page_Checkout/input_Add Comments About Your Order_button-shipping-method'))

//WebUI.click(findTestObject('Page_Checkout/input_Cash On Delivery_payment_method'))
WebUI.click(findTestObject('Page_Checkout/input_Terms  Conditions_agree_payment'))

WebUI.click(findTestObject('Page_Checkout/input_Terms  Conditions_button-payment-method'))

WebUI.click(findTestObject('Page_Checkout/input_Please transfer the total amount to the following bank account_button-confirmPAYMENT'))

WebUI.verifyElementText(findTestObject('Page_Your order has been placed/h1_Your order has been placed'), textoOrden)

WebUI.click(findTestObject('Page_Your order has been placed/a_Continue'))

WebUI.verifyElementText(findTestObject('Page_Your Store/a_Your Store'), textoTienda)

