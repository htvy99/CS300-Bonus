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

WebUI.click(findTestObject('Page_Town Square - 300 Bonus Mattermost/button_trucnguyen1199_style--none sidebar-h_a7011d'))

WebUI.click(findTestObject('Page_Town Square - 300 Bonus Mattermost/button_Account Settings'))

WebUI.click(findTestObject('Page_Town Square - 300 Bonus Mattermost/button_Display'))

WebUI.click(findTestObject('Page_Town Square - 300 Bonus Mattermost/div_ThemeEditOpen to manage your theme'))

WebUI.click(findTestObject('Page_Town Square - 300 Bonus Mattermost/img_Organization_img-responsive'))

WebUI.click(findTestObject('Page_Town Square - 300 Bonus Mattermost/button_Save'))

WebUI.click(findTestObject('Page_Town Square - 300 Bonus Mattermost/div_ThemeEditOpen to manage your theme'))

WebUI.click(findTestObject('Page_Town Square - 300 Bonus Mattermost/img_Mattermost Dark_img-responsive'))

WebUI.click(findTestObject('Page_Town Square - 300 Bonus Mattermost/button_Save'))

WebUI.click(findTestObject('Page_Town Square - 300 Bonus Mattermost/button_Close'))

WebUI.click(findTestObject('Page_Town Square - 300 Bonus Mattermost/button_trucnguyen1199_style--none sidebar-h_a7011d'))

WebUI.click(findTestObject('Page_Town Square - 300 Bonus Mattermost/button_Logout'))

