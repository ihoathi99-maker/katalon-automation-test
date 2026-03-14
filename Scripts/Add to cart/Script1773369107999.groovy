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

WebUI.openBrowser('https://maxe.chanh.in')

'Trang sản phẩm được mở lên'
WebUI.click(findTestObject('Add product to cart/Go to Product/Click product'))

'Thêm sản phẩm vào giỏ hàng ở trang tổng sản phẩm'
WebUI.click(findTestObject('Add product to cart/Page_Sn phm/Add product to cart 1'))

'Đóng giỏ hàng nhanh'
WebUI.click(findTestObject('Add product to cart/Page_Sn phm/close shopping cart'))

'Thêm sản phẩm thứ 2 vào giỏ hàng'
WebUI.click(findTestObject('Add product to cart/Page_Sn phm/Add product to cart 2'))

'Đóng giỏ hàng nhanh'
WebUI.click(findTestObject('Add product to cart/Page_Sn phm/close shopping cart'))

'Thêm sản phẩm thứ 3 vào giỏ hàng'
WebUI.click(findTestObject('Add product to cart/Page_Sn phm/Add product to cart 3'))

'Đóng giỏ hàng nhanh'
WebUI.click(findTestObject('Add product to cart/Page_Sn phm/close shopping cart'))

'Thêm cùng 1 sản phẩm nhiều lần'
WebUI.click(findTestObject('Add product to cart/Page_Sn phm/Add product to cart 3'))

'Đóng giỏ hàng nhanh'
WebUI.click(findTestObject('Add product to cart/Page_Sn phm/close shopping cart'))

'Thêm cùng 1 sản phẩm nhiều lần'
WebUI.click(findTestObject('Add product to cart/Page_Sn phm/Add product to cart 3'))

'Đóng giỏ hàng nhanh'
WebUI.click(findTestObject('Add product to cart/Page_Sn phm/close shopping cart'))

'Đi đến trang chi tiết sản phẩm'
WebUI.click(findTestObject('Add product to cart/Page_Sn phm/go to detail product'))

'Thêm sản phẩm vào giỏ hàng ở trang chi tiết sản phẩm'
WebUI.click(findTestObject('Add product to cart/Go to detail product/Add product to cart_detail'))

