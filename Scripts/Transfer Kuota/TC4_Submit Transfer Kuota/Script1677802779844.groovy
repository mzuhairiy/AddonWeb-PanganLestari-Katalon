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

WebUI.callTestCase(findTestCase('Transfer Kuota/TC3_Add Item in Transfer Grid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Detail Transfer Kuota Page/button_Add Item Transfer Source'))

WebUI.click(findTestObject('Detail Transfer Kuota Page/Pop Up Add Item Transfer/btn Branch'))

WebUI.click(findTestObject('Detail Transfer Kuota Page/Pop Up Add Item Transfer/li_SIDOARJO - PL SIDOARJO'))

WebUI.click(findTestObject('Detail Transfer Kuota Page/Pop Up Add Item Transfer/checkbox 1'))

WebUI.click(findTestObject('Detail Transfer Kuota Page/Pop Up Add Item Transfer/input To Warehouse'))

WebUI.click(findTestObject('Detail Transfer Kuota Page/Pop Up Add Item Transfer/SDA SM'))

WebUI.setText(findTestObject('Detail Transfer Kuota Page/Pop Up Add Item Transfer/input Qty Selected'), '5')

WebUI.click(findTestObject('Detail Transfer Kuota Page/Pop Up Add Item Transfer/button_Add Close Pop Up Transfer'))

