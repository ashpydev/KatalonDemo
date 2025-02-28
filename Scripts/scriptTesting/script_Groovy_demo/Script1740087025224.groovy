import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login")

WebUI.waitForPageLoad(10)

// println "Global Variable Value: " + GlobalVariable.username
// println "Global Variable Value: " + GlobalVariable.password

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_username'), "admin")

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Password_password'), "hUKwJTbofgPU9eVlw/CnDQ==")

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/button_Login'))

WebUI.closeBrowser()

