import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Test extends ParclePointStore{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		AndroidDriver <AndroidElement> driver = capabilities();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		List<AndroidElement> textElements = driver.findElementsByClassName("android.widget.EditText");
		//for(AndroidElement element : textElements) { //to print android elements under text elements	
		//System.out.println(element.getId());
		//}
		AndroidElement userName = textElements.get(0);
		//textElements.get(0).sendKeys("saroj");// ALTERNATIVE METHOD WITHOUT OPTIMIZATION 
		userName.sendKeys("Saroj");
		
		AndroidElement password = textElements.get(1);
		//textElements.get(1).sendKeys("Thapa@rose9"); // ALT MTHD
		password.sendKeys("Thapa@rose7");
		driver.hideKeyboard();
		driver.findElementByClassName("android.widget.Button").click();		
	 
		
		List <AndroidElement> imageViews = driver.findElementsByClassName("android.widget.ImageView");
		AndroidElement scanIcon =  imageViews.get(2);
		scanIcon.click();
		driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
				
		
		
	}

}
