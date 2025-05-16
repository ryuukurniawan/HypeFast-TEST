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

WebUI.openBrowser("https://dashboard.melaka.app/register")

WebUI.setText(findTestObject('Register Melaka Object/Form Input Nama'), nama)

WebUI.setText(findTestObject('Object Repository/Register Melaka Object/input_Nama_phone'), noTelepon)

WebUI.setText(findTestObject('Register Melaka Object/Form Input Nama Bisnis'), namaBisnis)

if (tipeBisnis == '1') {
    WebUI.click(findTestObject('Object Repository/Register Melaka Object/Tombol Tipe Bisnis Brand'))
} else if (tipeBisnis == '2') {
    WebUI.click(findTestObject('Object Repository/Register Melaka Object/Tombol Tipe Bisnis Distributor'))
} else if (tipeBisnis == '3') {
    WebUI.click(findTestObject('Object Repository/Register Melaka Object/Tombol Tipe Bisnis Penjual Online'))
} else if (tipeBisnis == '4') {
    WebUI.click(findTestObject('Object Repository/Register Melaka Object/Tombol Tipe Bisnis Toko Retail'))
}

WebUI.setText(findTestObject('Register Melaka Object/Form Input Email'), email)

WebUI.setText(findTestObject('Register Melaka Object/Form Input Kata Sandi Email'),passwordEmail )

WebUI.setText(findTestObject('Register Melaka Object/Form Input Konfirmasi Kata Sandi'), confirmPassword)

WebUI.click(findTestObject('Register Melaka Object/Form Konfirmasi Register'))

WebUI.click(findTestObject('Object Repository/Register Melaka Object/Tombol Register'), )


