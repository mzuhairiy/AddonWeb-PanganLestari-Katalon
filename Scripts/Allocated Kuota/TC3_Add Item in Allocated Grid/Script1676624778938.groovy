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

WebUI.callTestCase(findTestCase('Allocated Kuota/TC2_Add Item in Source Grid'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Detail Allocated Kuota Page/btn Add Item Allocated'))

//WebUI.verifyElementPresent(findTestObject('Detail Allocated Kuota Page/pop-up Add Item Source'), 30)
WebUI.click(findTestObject('Detail Allocated Kuota Page/Pop Up Allocated/btn Dropdown Warehouse Pop Up Add Item'))

WebUI.click(findTestObject('Detail Allocated Kuota Page/li JKT-TM'))

WebUI.click(findTestObject('Detail Allocated Kuota Page/checkbox 1'), FailureHandling.STOP_ON_FAILURE)

WebUI.doubleClick(findTestObject('Detail Allocated Kuota Page/Pop Up Allocated/Input_Qty Selected Allocated'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Detail Allocated Kuota Page/Pop Up Allocated/Input_Qty Selected Allocated'), '10')

WebUI.click(findTestObject('Detail Allocated Kuota Page/Pop Up Allocated/btn AddClose'))

WebUI.verifyElementPresent(findTestObject('Detail Allocated Kuota Page/Pop Up Allocated/Input_Qty Selected Allocated', [
            (10) : 10]), 30)

WebUI.click(findTestObject('Detail Allocated Kuota Page/btn Save'))

WebUI.click(findTestObject('Detail Allocated Kuota Page/button_OK Alert'))

WebUI.closeBrowser()

