package AIMobile;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class mitel1 
{
		
public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "D:\\D drive\\eclipse o\\Mobile Testing2\\chromedriver.exe");
WebDriver driver=new ChromeDriver(); 
//driver.get("https://www.youtube.com/");
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
driver.findElement(By.id("search-all")).sendKeys(Keys.ENTER);
WebElement loginbtn4 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='flex-btn incall-keypad-btn tappable']")));
loginbtn4.click();
Thread.sleep(2000);
WebElement loginbtn5 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[text()='+']")));
List<WebElement> elements = driver.findElements(By.xpath("//div"));
driver.findElement(By.xpath("//div[text()='+']")).click();
driver.findElement(By.xpath("//div[text()='5']")).click();
driver.findElement(By.xpath("//div[text()='1']")).click();
driver.findElement(By.xpath("//div[text()='2']")).click();
driver.findElement(By.xpath("//div[text()='5']")).click();
driver.findElement(By.xpath("//div[text()='2']")).click();
driver.findElement(By.xpath("//div[text()='6']")).click();
driver.manage().window().maximize();
} 
}
 	