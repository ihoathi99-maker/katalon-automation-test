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

'Đi đến trang giỏ hàng'
WebUI.click(findTestObject('Add product to cart/Page_Sn phm/Xem gio hang'))

'Bỏ chọn tất cả'
WebUI.click(findTestObject('Cart/Page_Gi hng/checkout-all'))

'Chọn 1 sản phẩm'
WebUI.click(findTestObject('Cart/Page_Gi hng/checkbox_cart-item 2'))

'Chọn 2 sản phẩm'
WebUI.click(findTestObject('Cart/Page_Gi hng/checkbox_cart-item 1'))

WebUI.click(findTestObject('Cart/Page_Gi hng/input_quantity_ giohang'))

WebUI.setText(findTestObject('Cart/Page_Gi hng/input_quantity_ giohang'), '0')

