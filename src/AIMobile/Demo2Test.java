package AIMobile;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import Fileutils.Exceldata3;
import static org.junit.Assert.assertEquals;

import java.io.File;

import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.Rule;


public class Demo2Test {
	 @Rule
	    public TestWatcher watcher = Factory.createWatcher();
	
   @Test
   public void Bookameeting() throws Exception {
	
	   	Mobile2Test ref3 = new Mobile2Test();
		ref3.Book2();
		System.out.println("exceuted");	

		System.out.println("addedafterclone");	

			}
   
   /*@Test
   public void Bookameeting1() throws Exception {
	   File appDir = new File("src");   
	   File app = new File(appDir, "Al details4.xlsx");
	   String Path= app.getAbsolutePath();
	   //String Path="D:\\D drive\\Al details4.xlsx";
	   String SheetName="CAM";
	   Exceldata3 ref2 = new Exceldata3();
	   ref2.setExcelFile(Path, SheetName);
	   ref2.getCellData(6, 1);
	   System.out.println( ref2.getCellData(6, 1));
	   
   }*/
}