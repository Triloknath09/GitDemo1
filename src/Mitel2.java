import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Mitel2 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\D drive\\eclipse o\\Mobile Testing2\\chromedriver.exe");

		// Add options to Google Chrome. The window-size is important for responsive sites
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("headless");
		//options.addArguments("window-size=1200x600");
		//WebDriver driver=new ChromeDriver(options);
		WebDriver driver=new ChromeDriver();
		driver.get("https://bgl01mas.mitel.com/ucs/micollab/");
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement loginbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Accept')]")));
		loginbtn.click();
		WebElement loginbtn2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Login')]")));
		driver.findElement(By.xpath("//input[@class='mtl-text-input login-input login-name']")).sendKeys("venkata");
		driver.findElement(By.xpath("//input[@class='mtl-text-input login-input login-password']")).sendKeys("cd5f4857");
		loginbtn2.click();
		
		WebElement loginbtn3 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(text(),'Skip')]")));
		loginbtn3.click();
		driver.findElement(By.id("search-all")).sendKeys("55000");
		//driver.findElement(By.id("search-all")).sendKeys("08067590120");
		driver.findElement(By.id("search-all")).sendKeys(Keys.ENTER);
		
		WebElement loginbtn4 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='flex-btn incall-keypad-btn tappable']")));
		loginbtn4.click();
		Thread.sleep(2000);		
		WebElement loginbtn5 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='+']")));
		String accessCode = "011127788";
		int accessCodeLen = accessCode.length();
		List<WebElement> dialNumbers = new ArrayList<WebElement>();
		dialNumbers.add(driver.findElement(By.xpath("//div[text()='+']")));	
		String digitSeq = "0123456789";
		int digitSeqLen = digitSeq.length();		
		for(int i = 1; i < digitSeqLen; i++)
		{ 
			//dialNumbers.add(driver.findElement(By.xpath("//div[text()=" + digitSeq.charAt(i) +"]")));	
			dialNumbers.add(driver.findElement(By.xpath("//div[text()=" + digitSeq.charAt(i) + "]")));
		}
		System.out.println(dialNumbers);
		for(int i =0; i < accessCodeLen; i++)
		{
			//System.out.println(dialNumbers);
			char digitToClick = accessCode.charAt(i);
			WebElement element = dialNumbers.get(Character.getNumericValue(digitToClick));
			element.click();
			//Thread.sleep(1000);
		}
System.out.println("success");
		
		driver.findElement(By.xpath("//div[text()='#']")).click();
		driver.manage().window().maximize();
	} 
}


