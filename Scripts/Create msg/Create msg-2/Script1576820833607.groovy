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

WebUI.setText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place s_703ef5'), 'ntttruc@apcs.vn')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place s_2f2733'), 
    '64O22nEDKRkueMYucGcRBg==')

WebUI.sendKeys(findTestObject('Object Repository/Page_Mattermost/input_All team communication in one place s_2f2733'), Keys.chord(
        Keys.ENTER))

WebUI.setText(findTestObject('Msg-2/textarea_hello'), 'hello ')

WebUI.setText(findTestObject('Msg-2/textarea_hello everyone_1'), 'hello everyone. ')

WebUI.setText(findTestObject('Msg-2/textarea_hello everyone M'), 'hello everyone. My')

WebUI.setText(findTestObject('Msg-2/textarea_hello everyone My nam'), 'hello everyone. My name')

WebUI.setText(findTestObject('Msg-2/textarea_hello everyone My name i'), 'hello everyone. My name is')

WebUI.setText(findTestObject('Msg-2/textarea_hello everyone My name is truc_1'), 'hello everyone. My name is truc. ')

WebUI.setText(findTestObject('Msg-2/textarea_hello everyone My name is truc Nice'), 'hello everyone. My name is truc. Nice ')

WebUI.setText(findTestObject('Msg-2/textarea_hello everyone My name is truc Nice t'), 'hello everyone. My name is truc. Nice to')

WebUI.setText(findTestObject('Msg-2/textarea_hello everyone My name is truc Nic_95c83f'), 'hello everyone. My name is truc. Nice to meet ')

WebUI.setText(findTestObject('Msg-2/textarea_hello everyone My name is truc Nic_7c9e78'), 'hello everyone. My name is truc. Nice to meet you!')

WebUI.click(findTestObject('Object Repository/Msg-2/a_hello everyone My name is truc Nice to me_ea4b50'))