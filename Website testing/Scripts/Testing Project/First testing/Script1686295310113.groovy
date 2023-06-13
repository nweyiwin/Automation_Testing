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

WebUI.navigateToUrl('https://visibleone.com/')

WebUI.click(findTestObject('Object Repository/Page_Leading Web Design  Website Developmen_0d524e/button_Learn More'))

WebUI.click(findTestObject('Object Repository/Page_Leading Web Design  Website Developmen_0d524e/button_Learn More'))

WebUI.click(findTestObject('Object Repository/Page_Leading Web Design  Website Developmen_0d524e/a_Learn More'))

WebUI.click(findTestObject('Object Repository/Page_About Visible One  Digital Marketing A_c3c32a/button_2'))

WebUI.click(findTestObject('Object Repository/Page_About Visible One  Digital Marketing A_c3c32a/a_Talk to Us'))

WebUI.click(findTestObject('Object Repository/Page_Contact Us for Web Design Services I W_a359c2/input_GET AN INSTANT REPLY_hs-button primary large'))

