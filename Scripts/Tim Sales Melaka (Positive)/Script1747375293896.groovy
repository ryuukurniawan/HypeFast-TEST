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


String nameSales = "Name Test Sales 1"

String noPhone = "081381255117"

String emailSales = "ryuuryuu048@gmail.com"

WebUI.openBrowser('https://dashboard.melaka.app/login')

WebUI.setText(findTestObject('Login Melaka Object/Form Input Email'), 'ryuuryuu048@gmail.com')

WebUI.setText(findTestObject('Login Melaka Object/Form Input Password Email'), 'Test1234')

WebUI.click(findTestObject('Login Melaka Object/Tombol Konfirmasi Login'))

WebUI.click(findTestObject('Dashboard Object/Modul Toko Saya/Fitur Tim Sales/Tombol Tim Sales'))

WebUI.click(findTestObject('Dashboard Object/Modul Toko Saya/Fitur Tim Sales/Tombol Tambah Sales'))

WebUI.setText(findTestObject('Dashboard Object/Modul Toko Saya/Fitur Tim Sales/Form Input Name'), '')

WebUI.setText(findTestObject('Dashboard Object/Modul Toko Saya/Fitur Tim Sales/Form Input phone'), '')

WebUI.setText(findTestObject('Dashboard Object/Modul Toko Saya/Fitur Tim Sales/Form Input Email'), '')

WebUI.click(findTestObject('Dashboard Object/Modul Toko Saya/Fitur Tim Sales/Tombol Konfirmasi Simpan'))

WebUI.waitForAlert(3)

if (WebUI.verifyTextPresent(nameSales, false)) {
	println("Data tim sales berhasil di tambahkan")
} else {
	println("Data tim sales gagal ditambahkan")
}
