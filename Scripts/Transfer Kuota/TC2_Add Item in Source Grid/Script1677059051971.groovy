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

System.setProperty('webdriver.firefox.bin', 'D:/Programs/Mozilla Firefox/firefox.exe')

WebUI.callTestCase(findTestCase('Transfer Kuota/TC1_Source Warehouse'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('Detail Transfer Kuota Page/button_Add Item'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Detail Transfer Kuota Page/button_Add Item'))

WebUI.verifyElementPresent(findTestObject('Detail Transfer Kuota Page/Pop Up Add Item Source/h2_Add Item'), 0)

WebUI.click(findTestObject('Detail Transfer Kuota Page/Pop Up Add Item Source/checkbox 3'))

WebUI.click(findTestObject('Detail Transfer Kuota Page/Pop Up Add Item Source/button_Add  Close'))

WebUI.verifyElementClickable(findTestObject('Detail Transfer Kuota Page/button_Add Item Transfer Source'), FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Detail Transfer Kuota Page/Pop Up Add Item Source/Tranfer Qty Source'))

WebUI.setText(findTestObject('Detail Transfer Kuota Page/Pop Up Add Item Source/Input Transfer QTY'), '5')

WebUI.click(findTestObject('Detail Transfer Kuota Page/Pop Up Add Item Source/button_Save Pop Up Update Data Item'))

