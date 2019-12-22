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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://mattermost-group07.herokuapp.com/login')

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'nlptrinh@apcs.vn')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), '3LzKM1lvFqPgynlvLZrhIg==')

WebUI.sendKeys(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Page_ Town Square - 300 Bonus Mattermost/svg'))

WebUI.click(findTestObject('Object Repository/Page_Town Square - Bonus Test Mattermost/a_Create a New Team'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - Bonus Test Mattermost/input_Team Name_teamNameInput'), 
    '300 Bonus')

WebUI.sendKeys(findTestObject('Object Repository/Page_Town Square - Bonus Test Mattermost/input_Team Name_teamNameInput'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_Town Square - Bonus Test Mattermost/span_Finish'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Town Square - Bonus Test Mattermost/input_httpsmattermost-group07herokuappcom_t_f40a9b'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Town Square - Bonus Test Mattermost/input_httpsmattermost-group07herokuappcom_t_f40a9b'))

WebUI.setText(findTestObject('Object Repository/Page_Town Square - Bonus Test Mattermost/input_httpsmattermost-group07herokuappcom_t_f40a9b'), 
    'bonus-300')

WebUI.sendKeys(findTestObject('Object Repository/Page_Town Square - Bonus Test Mattermost/input_httpsmattermost-group07herokuappcom_t_f40a9b'), 
    Keys.chord(Keys.ENTER))

