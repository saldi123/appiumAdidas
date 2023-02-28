import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.*;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.server.SupportsUiautomator2ServerLaunchTimeoutOption;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.AppiumBy.ByAndroidUIAutomator;
import io.appium.java_client.android.options.server.SupportsUiautomator2ServerInstallTimeoutOption;

public class runAdidasRun {
	
	
public static void main(String[] args) throws MalformedURLException, InterruptedException {

		
	

while(true) {
       
		try {
			
	      // driver.findElement(By.ByXPath.xpath(string))
	        		
			/*
			 * WebElement searchProd =
			 * driver.findElement(By.id("asia.acommerce.adidasid:id/action_search_product"))
			 * ; searchProd.click(); Thread.sleep(500);
			 */
			AppiumDriver driver;
			//Set the Desired Capabilities
			DesiredCapabilities caps = new DesiredCapabilities();
			//caps.setCapability("deviceName", "SaldiS22");
			caps.setCapability("udid", "RRCT200QBBN"); //Give Device ID of your mobile phone
			caps.setCapability("platformName", "Android");
			//caps.setCapability("platformVersion", "13.0");
			caps.setCapability("automationName", "Appium");
			//caps.setCapability("unicodeKeyboard", "true");
			caps.setCapability("resetKeyboard", "true");
			caps.setCapability("appPackage", "asia.acommerce.adidasid");
			caps.setCapability("appActivity", "asia.shopstack.adidasid.intro.IntroActivity");
			caps.setCapability("noReset", "true");
			caps.setCapability("fullReset", "false");
			
	
			driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			
	         Thread.sleep(5000);
			 WebElement clickShoe =  driver.findElement(By.id("asia.acommerce.adidasid:id/action_search_product"));
			 clickShoe.click();
			 System.out.println("shoe");
			 System.out.println("bagged");
			 Thread.sleep(5000);
			 WebElement clickShoesText =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView"));
			 clickShoesText.click();
			 System.out.println("shoe");
			 Thread.sleep(5000);
			 WebElement clickOriginals =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[2]/android.widget.TextView"));
			 clickOriginals.click();
			 System.out.println("shoe");
			 Thread.sleep(5000);
			 WebElement clickOnItem =  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]"));
			 clickOnItem.click();
			 System.out.println("clicked on item");
			 Thread.sleep(5000);
			 WebElement clickOnBuy=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.widget.RelativeLayout[2]/android.widget.FrameLayout[2]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[4]/android.widget.TextView[3]"));
			 clickOnBuy.click();
			 System.out.println("clicked on buy");
			 Thread.sleep(5000);
			 WebElement clickOnSize=  driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.TextView[4]"));
			 clickOnSize.click();
			 System.out.println("clicked on size");
			 Thread.sleep(5000);
			 WebElement addToBag=  driver.findElement(By.id("asia.acommerce.adidasid:id/buy_button"));
			 addToBag.click();
			 System.out.println("clicked on add to bag");
			 Thread.sleep(5000);
			 WebElement getStarted =  driver.findElement(By.id("asia.acommerce.adidasid:id/action_cart"));
			 getStarted.click();
			 System.out.println("bagged");
		     Thread.sleep(5000);
			 WebElement startInputEmail =  driver.findElement(By.id("asia.acommerce.adidasid:id/image_selector_arrow"));
			 startInputEmail.click();	
			 System.out.println("arrowClicked");
		     Thread.sleep(5000);
			 WebElement inputEmail = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView"));
			 inputEmail.click();
			 System.out.println("zero");
		     Thread.sleep(5000);
		     driver.quit();
		     

		    
//		     
//		     
		     
		     //<span>asia.acommerce.adidasid:id/navigation_bar_item_icon_view</span>
		     
		     
		     
				/*
				 * //driver.findElement(By.ByXPath.xpath(
				 * "asia.acommerce.adidasid:id/email_input")); //inputEmail.click();
				 * System.out.println("inputemailclicked"); Thread.sleep(5000);
				 * System.out.println("enteringemail");
				 * inputEmail.sendKeys("muhammads1994@gmail.com");
				 */
			 
		
			 
			 
			 // asia.acommerce.adidasid:id/action_profile  	
			// asia.acommerce.adidasid:id/join_button

			 
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
		}
		
		System.out.println("yay done");
        //Thread.sleep(400);
        
      //  WebElement  password= driver.findElement(By.id("txt_password"));
       // password.sendKeys("Pass@123");

}

	
//		//Instantiate Appium Driver
//		try {
//			
//		} catch (MalformedURLException e) {
//			System.out.println(e.getMessage());
//		}

		}
	}



