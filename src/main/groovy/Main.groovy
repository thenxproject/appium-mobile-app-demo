import io.appium.java_client.android.AndroidDriver
import io.appium.java_client.remote.MobileCapabilityType
import org.openqa.selenium.Platform
import org.openqa.selenium.WebDriver
import org.openqa.selenium.remote.DesiredCapabilities

static void main(String[] args) {
	DesiredCapabilities caps = new DesiredCapabilities()
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, Platform.ANDROID)
	caps.setCapability(MobileCapabilityType.DEVICE_NAME,"")
	caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "")
	caps.setCapability(MobileCapabilityType.APP, "")

/*
	caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS")
	caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest")
	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 7")*/
	WebDriver driver = new AndroidDriver(new URL(""), caps)
}