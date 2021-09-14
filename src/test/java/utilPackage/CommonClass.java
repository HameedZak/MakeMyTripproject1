package utilPackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CommonClass {

	static public WebDriver driver;

	static public void inititalizebrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\New Driver\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

	}

	static public void closeBrowser() {
		driver.quit();

	}

	static public void switchTochild() {
		String p = driver.getWindowHandle();
		Set<String> sep = driver.getWindowHandles();
		Iterator<String> Iterator = sep.iterator();
		while (Iterator.hasNext()) {
			String child = Iterator.next();

			if (!p.equals(child)) {
				driver.switchTo().window(child);

				String s = driver.findElement(By.xpath("//div//p[@class=\"fareRow\"]//following-sibling::span"))
						.getText();
				System.out.println("Total Amount is:" + s);

//			try{
//			if(s.contains("₹ 1,34,209")) {
//					System.out.println("Total Amount for BLR to Mumbai:"  + s);
//			}else if(s.contains("₹ 1,86,717")) {
//				System.out.println("Total Amount BLR to Delhi :"  + s);
//			}
//				}catch (Exception e) {
//				// TODO: handle exception
//					System.out.println("Exception caught in price comparision : "+ e);
//				}				
//
//			}
	}

	}

}
}