import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.ios.IOSDriver
import io.appium.java_client.remote.AutomationName
import io.appium.java_client.remote.IOSMobileCapabilityType
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.By
import org.openqa.selenium.Platform
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.remote.DesiredCapabilities

static void main(String[] args) {
	File appPath = new File("${System.getProperty("user.home")}/Downloads")
	File appFile = new File(appPath, "app-debug.apk")
	DesiredCapabilities caps = new DesiredCapabilities()
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID)
	//caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 6 Pro API 33")
	caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2)
	caps.setCapability(MobileCapabilityType.APP, appFile.getAbsolutePath())


	WebDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps)

	true

	/* Assuming you have an element that has the ID of home that contains the text Home that is unique on the
	main screen of the app these lines would allow you to verify its visibility and text
	 */
	WebElement element = driver.findElement(
		/*
		Normally this by would just parameter passed in, but I'm breaking it down for documentation
		By is a selenium class that is used to help find elements. So on a web page if you have an element
		with the id of google-logo then can do By.id("google-logo") or By.cssSelector("#google-logo") or
		By.xpath("//*[@id='google-logo']") for mobile apps ID and xpath are better as iOS doesn't support
		css selector outside of the browser.
		 */
		By.id("home")
	)
	assert element.isDisplayed()
	assert element.getText() == "Home"

	// IOS Stuff
	/*File appPath = new File("${System.getProperty("user.home")}/Downloads")
	File appFile = new File(appPath, "UIKitCatalog.app")
	DesiredCapabilities cap = new DesiredCapabilities()
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 14 Pro")
	//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "PearsonDevice-HX4N95P64N-iPhone");
	cap.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.IOS.toString())
	cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.IOS_XCUI_TEST)
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "16.2");*/
	//cap.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true)

	/*cap.setCapability(MobileCapabilityType.UDID, "00008110-0009056022EA401E");
	//cap.setCapability(IOSMobileCapabilityType.XCODE_ORG_ID, "");
	cap.setCapability(IOSMobileCapabilityType.XCODE_SIGNING_ID, "iPhone Developer");
	cap.setCapability(IOSMobileCapabilityType.UPDATE_WDA_BUNDLEID, "ged-december");*/

	//cap.setCapability(IOSMobileCapabilityType.USE_PREBUILT_WDA, "true")
	//cap.setCapability(IOSMobileCapabilityType.WDA_STARTUP_RETRIES, "4")
	//cap.setCapability(IOSMobileCapabilityType.IOS_INSTALL_PAUSE, "2000")
	//cap.setCapability(IOSMobileCapabilityType.WDA_STARTUP_RETRY_INTERVAL, "20000")
	//cap.setCapability(IOSMobileCapabilityType.AUTO_ACCEPT_ALERTS, "true")
	/*cap.setCapability(IOSMobileCapabilityType.WDA_LAUNCH_TIMEOUT, "200000");
	cap.setCapability(MobileCapabilityType.APP, appFile.getAbsolutePath())


	IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap)*/

	true
}