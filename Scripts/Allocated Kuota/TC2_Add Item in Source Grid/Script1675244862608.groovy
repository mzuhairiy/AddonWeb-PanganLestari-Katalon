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

WebUI.callTestCase(findTestCase('Allocated Kuota/TC1_Source Warehouse'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Detail Allocated Kuota Page/btn Add Item Source'))

//WebUI.verifyElementPresent(findTestObject('Detail Allocated Kuota Page/pop-up Add Item Source'), 30)
WebUI.click(findTestObject('Detail Allocated Kuota Page/Pop Up Source/input 2'))

WebUI.click(findTestObject('Detail Allocated Kuota Page/Pop Up Source/btn AddClose Source'))

WebUI.verifyElementPresent(findTestObject('Detail Allocated Kuota Page/Description Filled'), 30)

WebUI.verifyElementPresent(findTestObject('Detail Allocated Kuota Page/btn Add Item Allocated'), 30)

WebUI.doubleClick(findTestObject('Detail Allocated Kuota Page/Pop Up Update Data Item/Allocated Kuota Field'))

WebUI.verifyElementPresent(findTestObject('Detail Allocated Kuota Page/Pop Up Update Data Item/h2_Update Data Item'), 0)

//cek object input allocated kuota update item di source
WebUI.setText(findTestObject('Detail Allocated Kuota Page/Pop Up Update Data Item/input Allocated Kuota'), '10')

WebUI.click(findTestObject('Detail Allocated Kuota Page/Pop Up Update Data Item/btn Save Pop Up Update Data Item'))

WebUI.verifyElementPresent(findTestObject('Detail Allocated Kuota Page/Pop Up Update Data Item/Value in Allocated Kuota Field'), 
    0)

