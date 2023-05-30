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

WebUI.callTestCase(findTestCase('Login/TC1_ValidCredential'), [('username') : 'donny', ('password') : 'Demo1234!', ('expectedElement') : 'DONNY KRISTIANTO'
        , ('url') : 'https://erp2.panganlestari.com/'], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Dashboard/link Allocated Kuota'))

WebUI.verifyElementPresent(findTestObject('Allocated Kuota Page/p Allocated Kuota'), 30)

//WebUI.click(findTestObject('Detail Allocated Kuota Page/btn Back'))
WebUI.verifyElementPresent(findTestObject('Allocated Kuota Page/div_On Hold'), 0)

WebUI.verifyElementPresent(findTestObject('Allocated Kuota Page/btn delete'), 0)

WebUI.click(findTestObject('Allocated Kuota Page/btn detail'))

WebUI.verifyElementPresent(findTestObject('Detail Allocated Kuota Page/p Detail Allocated Kuota'), 0)

WebUI.click(findTestObject('Detail Allocated Kuota Page/btn Three-dot'))

WebUI.click(findTestObject('Detail Allocated Kuota Page/li_Release'))

WebUI.mouseOver(findTestObject('Detail Allocated Kuota Page/pop up succes release'))

WebUI.verifyElementVisible(findTestObject('Detail Allocated Kuota Page/pop up succes release'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Detail Allocated Kuota Page/button_OK Release'))

WebUI.closeBrowser()

