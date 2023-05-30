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

WebUI.callTestCase(findTestCase('Login/TC1_ValidCredential'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/link Allocated Kuota'))

WebUI.verifyElementPresent(findTestObject('Allocated Kuota Page/p Allocated Kuota'), 30)

WebUI.click(findTestObject('Allocated Kuota Page/btn Add'))

WebUI.verifyElementPresent(findTestObject('Detail Allocated Kuota Page/p Detail Allocated Kuota'), 30)

WebUI.click(findTestObject('Detail Allocated Kuota Page/dropdown-menu Warehouse'))

WebUI.verifyElementPresent(findTestObject('Detail Allocated Kuota Page/unordered list Warehouse'), 30)

WebUI.click(findTestObject('Detail Allocated Kuota Page/li SDA-AL'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Detail Allocated Kuota Page/unordered list Warehouse'), 30)

WebUI.verifyElementPresent(findTestObject('Detail Allocated Kuota Page/Choosen Warehouse', [(expectedResult) : expectedResult]), 
    30)

WebUI.verifyElementClickable(findTestObject('Detail Allocated Kuota Page/btn Add Item Source'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementNotPresent(findTestObject('Detail Allocated Kuota Page/btn Add Item Allocated'), 30)

