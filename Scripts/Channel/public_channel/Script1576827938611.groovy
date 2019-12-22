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

WebUI.navigateToUrl('https://mattermost-group07.herokuapp.com/bonus-300/channels')

WebUI.setText(findTestObject('Object Repository/create_channel/create_public_channel/Page_Mattermost/input_All team communication in one place s_703ef5'), 
    'nlptrinh@apcs.vn')

WebUI.setEncryptedText(findTestObject('Object Repository/create_channel/create_public_channel/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    '3LzKM1lvFqPgynlvLZrhIg==')

WebUI.click(findTestObject('Object Repository/create_channel/create_public_channel/Page_Mattermost/button_Sign in'))

WebUI.click(findTestObject('Object Repository/create_channel/create_public_channel/Page_(1)  Town Square - 300 Bonus Mattermost/span_'))

WebUI.setText(findTestObject('Object Repository/create_channel/create_public_channel/Page_(1)  Town Square - 300 Bonus Mattermost/input_Name_newChannelName'), 
    'public_bonus')

WebUI.setText(findTestObject('Object Repository/create_channel/create_public_channel/Page_(1)  Town Square - 300 Bonus Mattermost/textarea_(optional)_newChannelPurpose'), 
    'Bonus Assignment ')

WebUI.setText(findTestObject('Object Repository/create_channel/create_public_channel/Page_(1)  Town Square - 300 Bonus Mattermost/textarea_(optional)_newChannelHeader'), 
    'https://www.google.com.vn/')

WebUI.click(findTestObject('Object Repository/create_channel/create_public_channel/Page_(1)  Town Square - 300 Bonus Mattermost/span_Create New Channel'))
