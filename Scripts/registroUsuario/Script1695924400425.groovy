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

GlobalVariable.usuarioEmail = CustomKeywords.'newPackage.utils.numeroRandom'()

WebUI.click(findTestObject('Page_Your Store/i_US Dollar_fa fa-user'))

WebUI.click(findTestObject('Page_Your Store/a_Register'))

WebUI.setText(findTestObject('Page_Register Account/input_First Name_firstname'), firstName)

WebUI.setText(findTestObject('Page_Register Account/input_Last Name_lastname'), lastName)

WebUI.setText(findTestObject('Page_Register Account/input_E-Mail_email'), GlobalVariable.usuarioEmail)

WebUI.setText(findTestObject('Page_Register Account/input_Telephone_telephone'), phone)

WebUI.setText(findTestObject('Page_Register Account/input_Password_password'), password)

WebUI.setText(findTestObject('Page_Register Account/input_Password Confirm_confirm'), password)

WebUI.click(findTestObject('Page_Register Account/input_Privacy Policy_agree'))

WebUI.click(findTestObject('Page_Register Account/input_Privacy Policy_btn btn-primary'))

WebUI.verifyElementText(findTestObject('Page_Your Account Has Been Created/h1_Account'), 'Account')

WebUI.click(findTestObject('Page_Your Account Has Been Created/a_Continue'))

WebUI.verifyElementText(findTestObject('Page_My Account/h2_My Account'), 'My Account')

//def emailCalculado = CustomKeywords.'newPackage.utils.numeroRandom'(email)

