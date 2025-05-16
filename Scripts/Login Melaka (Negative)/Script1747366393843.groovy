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

WebUI.openBrowser('https://dashboard.melaka.app/login')

WebUI.setText(findTestObject('Login Melaka Object/Form Input Email'),emailLogin )

WebUI.click(findTestObject('Object Repository/Login Melaka Object/Form Input Password Email'))

WebUI.setText(findTestObject('Login Melaka Object/Form Input Password Email'),passwordLogin)

WebUI.click(findTestObject('Login Melaka Object/Tombol Konfirmasi Login'))

WebUI.waitForAlert(3)

if (WebUI.verifyTextPresent("Email atau kata sandi tidak valid.", false, FailureHandling.OPTIONAL)) {
	println("Feedback dalam kolom email dan password ketika data inputan belum sesuai format, sudah sesuai")
} 
else if (WebUI.verifyTextPresent("Harap isi dengan format yang benar.", false, FailureHandling.OPTIONAL)) {
	println("Feedback dalam kolom email ketika data inputan belum sesuai format, sudah sesuai")
} 
else if (WebUI.verifyTextPresent("Wajib diisi.", false, FailureHandling.OPTIONAL)) {
	println("Feedback dalam kolom ketika data inputan kosong, sudah sesuai")
   
} 
else {
	println("Feedback pada halaman login belum sesuai")
}
