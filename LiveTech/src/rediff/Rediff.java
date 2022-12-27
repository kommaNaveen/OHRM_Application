package rediff;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		//<input type="text" onblur="fieldTrack(this);" name="name5dbfe640" value="" style="width:185px;" maxlength="61" fdprocessedid="nkpvvr">
		String rediffUrlAddress="http://register.rediff.com/register/register.php?FormName=user_details";
		//System.setProperty("webdriver.chrome.driver\",\"C:/Users/navee/eclipse-workspace/chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver\", \"C:/Users/navee/WorkSpace/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:/Users/navee/WorkSpace/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(rediffUrlAddress);
		driver.manage().window().maximize();
		By NameElementl=By.xpath("//*[starts-with(@name,'name')]");
		 WebElement NameElement=driver.findElement(NameElementl);

		
		NameElement.sendKeys("Naveen Komma");
	}

}
