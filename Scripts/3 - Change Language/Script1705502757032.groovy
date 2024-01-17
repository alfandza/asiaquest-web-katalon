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

def getURL = ""

CustomKeywords.'asiaquest.basicKeyword.openBrowser'()

WebUI.comment('Change to Japanese')

WebUI.click(findTestObject('Object Repository/AsiaQuest Main Page/ChangeLanguageButton'))

WebUI.verifyElementPresent(findTestObject('AsiaQuest Main Page/Japanese'), 0)

WebUI.verifyElementPresent(findTestObject('AsiaQuest Main Page/English'), 0)

WebUI.click(findTestObject('AsiaQuest Main Page/Japanese'))

WebUI.delay(5)

getURL = WebUI.getUrl()

WebUI.verifyMatch(getURL, "https://www.asia-quest.jp/", false)

WebUI.comment('Change to English')

WebUI.click(findTestObject('Object Repository/AsiaQuest Main Page/ChangeLanguageButton'))

WebUI.verifyElementPresent(findTestObject('AsiaQuest Main Page/Japanese'), 0)

WebUI.verifyElementPresent(findTestObject('AsiaQuest Main Page/English'), 0)

WebUI.click(findTestObject('AsiaQuest Main Page/English'))

WebUI.delay(5)

getURL = WebUI.getUrl()

WebUI.verifyMatch(getURL, "https://www.asia-quest.jp/en/", false)

WebUI.closeBrowser()