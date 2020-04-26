package AIMobile;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.lang3.time.StopWatch;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import Fileutils.Exceldata3;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.AutomationName;

public class  Mobile2Test  extends login
{	
@Test
public void Book2() throws Exception,MalformedURLException,InterruptedException   
	{	  
  	System.out.println("pmc1");  	
AndroidDriver<AndroidElement>driver=capabilities();	
WebDriverWait wait = new WebDriverWait(driver,50);
WebDriverWait wait1 = new WebDriverWait(driver,150);
File appDir = new File("src");
File app = new File(appDir, "Al details4.xlsx");
String Path= app.getAbsolutePath();
//String Path="D:\\D drive\\Al details4.xlsx";
String SheetName="CAM";
Exceldata3 ref2 = new Exceldata3();
ref2.setExcelFile(Path, SheetName);
float f = Float.parseFloat(ref2.getCellData(6,1));
int n = Math.round(f);
//int n =Integer.parseInt(ref2.getCellData(6,1));
for(int i=0;i<=n;i++) 
{
String meetingname=ref2.getCellData(11+i,1);	
WebElement element11=wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Image[contains(@text,'arrow down')]")));
Thread.sleep(1000);
WebElement element14=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[contains(@text,'indegene iAddL')]")));
element14.click();
//driver.findElementByXPath("//android.widget.Button[contains(@text,'indegene iAddL')]").click();
WebElement element5 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text,'Confirm')]")));
element5.click();	
StopWatch pageLoad = new StopWatch();
pageLoad.start();
//Thread.sleep(1000);
WebElement element91 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text,'MEETING DETAILS')]")));
pageLoad.stop();
ref2.setCellData(Path,Long.toString(pageLoad.getTime()),11+i,2);
System.out.println("Total Page Load Time: " + pageLoad.getTime() + "milliseconds");
Thread.sleep(2000);
WebElement element98 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text,'Select customers')]")));
driver.findElementByXPath("//android.view.View[contains(@text,'Select customers')]").click();
WebElement element96 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text,'ALL CUST')]")));
driver.findElementsByClassName("android.widget.Image").get(0).click();
driver.findElementByXPath("//android.widget.Button[contains(@text,'Done')]").click();
WebElement element93 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text,'MEETING DETAILS')]")));
driver.findElementByXPath("//android.widget.Button[contains(@text,'Add')]").click();
WebElement element23 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text,'ALL PRESE')]")));
//driver.findElementsByClassName("android.widget.Image").get(3).click();
driver.findElementByXPath("//android.widget.Image[contains(@text,'add')][1]").click();	
driver.findElementByXPath("//android.widget.Button[contains(@text,'Done')]").click();	
//WebElement element25 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[contains(@text,'arrow back')]")));
WebElement element27 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[contains(@text,'Preview')]")));
element27.click();
WebElement element28 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Image[contains(@text,'play-presentation')]")));
//WebElement element30 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[contains(@text,'Play')]")));
element28.click();
for(int l=0;l<=1;l++) 
{
	driver.findElementByXPath("//android.widget.Image[contains(@text,'arrow-right')]").click();	
	Thread.sleep(2000);
	driver.findElementByXPath("//android.widget.Image[contains(@text,'sentiment-up')]").click();
	
}
WebElement element34 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[contains(@text,'Pause')]")));
System.out.println("pause");
element34.click();
Thread.sleep(2000);
WebElement element35 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[contains(@text,'Homepage')]")));
element35.click();
WebElement element92 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Image[contains(@text,'arrow back')]")));
element92.click();
//driver.findElementByXPath("//android.widget.Image[contains(@text,'arrow back')]").click();
Thread.sleep(2000);
WebElement element94 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[contains(@text,'Done')]")));
WebElement element99 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.EditText[contains(@text,'New Meeting')]")));
element99.sendKeys(meetingname);
driver.findElementByXPath("//android.widget.Button[contains(@text,'Done')]").click();
System.out.println("wait"+i);
WebElement element97 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.view.View[contains(@text,'Today')]")));
Thread.sleep(2000);

WebElement element36 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[contains(@text,'Mark Complete')]")));
element36.click();
WebElement element37 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//android.widget.Button[contains(@text,'arrow back')]")));
element37.click();
}
}
}
 