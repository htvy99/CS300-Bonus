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

WebUI.setText(findTestObject('Page_Mattermost/input_All team communication in one place s_703ef5'), 'ntttruc@apcs.vn')

WebUI.setEncryptedText(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), '64O22nEDKRkueMYucGcRBg==')

WebUI.sendKeys(findTestObject('Page_Mattermost/input_All team communication in one place s_2f2733'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_(1) Tokyo Square - 300 Bonus Mattermost/span_'))

WebUI.click(findTestObject('Object Repository/Page_(1) Tokyo Square - 300 Bonus Mattermost/div_truc01633gmailcom_more-modal__actions--round'))

WebUI.click(findTestObject('Object Repository/Page_(1) Tokyo Square - 300 Bonus Mattermost/div_truc01633gmailcom_more-modal__actions--round'))

WebUI.click(findTestObject('Object Repository/Page_(1) Tokyo Square - 300 Bonus Mattermost/button_Go'))

WebUI.setText(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/textarea_Write to kaka nlptrinh_post_textbox'), 
    'h')

WebUI.setText(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/textarea_h'), 'he')

WebUI.setText(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/textarea_he'), 'hel')

WebUI.setText(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/textarea_hel'), 'hell')

WebUI.setText(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/textarea_hell'), 'hello')

WebUI.setText(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/textarea_hello'), 'hello ')

WebUI.setText(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/textarea_hello_1'), 'hello g')

WebUI.setText(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/textarea_hello g'), 'hello gi')

WebUI.setText(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/textarea_hello gi'), 'hello gir')

WebUI.setText(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/textarea_hello gir'), 'hello girl')

WebUI.click(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/button_hello girl_style--none emoji-picker__22a073'))

WebUI.click(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/img_People_emoji-1f618'))

WebUI.click(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/a_hello girl kissing_heart_send-button theme'))

WebUI.click(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/button_trucnguyen1199_style--none sidebar-h_a7011d'))

WebUI.click(findTestObject('Object Repository/Page_(1) kaka nlptrinh - 300 Bonus Mattermost/button_Logout'))

