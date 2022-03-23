import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParclePointStore {

	
		// TODO Auto-generated method stub
		public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException
		{
			// TODO Auto-generated method stub
				//File appDir = new File ("src");
				//File app = new File(appDir,"Stores for Parcelpoint_1.0.0_apkcombo.com.apk" );
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.DEVICE_NAME,"saroj");
		//cap.setCapability(MobileCapabilityType.APP,app.getAbsolutePath() );
		cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2" );
		cap.setCapability("appPackage", "com.parcelpoint.dev.parcelpoint_store_app");
		cap.setCapability("appActivity", "com.parcelpoint.dev.parcelpoint_store_app.MainActivity");
		
		//cap.setCapability("appActivity", "io.appium.android.apis.ApiDemos");

		AndroidDriver <AndroidElement> driver  = new AndroidDriver<>(new URL ("http://127.0.0.1:4723/wd/hub"), cap);
		return driver;
	}

}
