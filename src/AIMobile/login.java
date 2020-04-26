package AIMobile;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import com.microsoft.appcenter.appium.Factory;

import Fileutils.Exceldata3;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.AutomationName;

public class login
{
public static  AndroidDriver<AndroidElement> capabilities() throws Exception	
{  
	String Username,Password,Env,ipurl;
	 File appDir = new File("src");
     File app = new File(appDir, "Al details4.xlsx");
     String Path= app.getAbsolutePath();
     String SheetName="CAM";	
	//String Path="D:\\D drive\\Al details4.xlsx";
     Exceldata3 ref2 = new Exceldata3();
	ref2.setExcelFile(Path, SheetName);
	Username=ref2.getCellData(2,1);
    Password=ref2.getCellData(3,1);
    String ip="192.0.13.1";  //ref2.getCellData(4,1); 
     String url="http://"+ip+":4723/wd/hub";
    Env=ref2.getCellData(5,1); 
    AndroidDriver<AndroidElement> driver;	
	  DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("automationName", "uiautomator2");
		capabilities.setCapability("appPackage", "com.omnipresence.io");
		capabilities.setCapability("appActivity", "com.omnipresence.io.MainActivity");
		capabilities.setCapability("deviceName", "Android");
		capabilities.setCapability("unicodeKeyboard", "true");                                     
		capabilities.setCapability("resetKeyboard", "true");
		capabilities.setCapability("autoGrantPermissions", true);
		//driver = new AndroidDriver<>(new URL("http://192.0.10.56:4723/wd/hub"), capabilities);
//driver = new AndroidDriver<>(new URL(url), capabilities);
driver = Factory.createAndroidDriver(new URL(url),capabilities);
WebDriverWait wait = new WebDriverWait(driver,50);
WebElement element8=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[contains(@text,'Login')]")));
	    driver.findElementsByClassName("android.widget.EditText").get(0).sendKeys(Username);//Username
	    Thread.sleep(1000);	 
		driver.findElementByXPath("//android.widget.Button[contains(@text,'Login')]").click();
	    WebElement element9=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text,'Enter')]")));	  
	    driver.findElement(By.xpath("//android.widget.EditText[@resource-id='i0118']")).sendKeys(Password);	
	    driver.findElementByXPath("//android.widget.Button[contains(@text,'Sign in')]").click();    
	    WebElement element3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[@text='Select an Instance']")));
	    driver.findElementByXPath("//android.view.View[contains(@text,'"+Env+"')]").click();
	    Thread.sleep(1000);
	    driver.findElementByXPath("//android.widget.Button[@text='Continue']").click();		
		return driver;	 			
}
}
