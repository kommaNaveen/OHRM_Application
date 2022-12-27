package com.Radio;


	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Buttons {

	WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";
	Alert alt;
	


	public void applicationLaunch()
	{

	System.setProperty("webdriver.chrome.driver", "C:/Users/navee/WorkSpace/chromedriver.exe");

	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void applicationClose()
	{
	driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {

	Buttons obj = new Buttons();
	obj.applicationLaunch();

	obj.radioButtonsBlock1();

	obj.applicationClose();
	
	}
		public void radioButtonsBlock1() throws InterruptedException
		{
		// xpath is a locator of WebDriver
		// xpath Expression - selector
		// /html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td

		WebElement radioButtonsBlockl=driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));

		// identifying the Radion Buttons Properties
		// <input type="radio" name="group1" value="Milk">
		// <input type="radio" name="group1" value="Butter" checked="">
		// <input type="radio" name="group1" value="Cheese">

		// <input type="radio" name="group2" value="Water">
		//List<WebElement>group1RadioButtons=radioButtonsBlockl.findElements((SearchContext ) By.tagName(tagName="radio"));
		List<WebElement>group1RadioButtons=radioButtonsBlockl.findElements(By.tagName("radio"));
		//List<WebElement>group1RadioButtons=radioButtonsBlockl.findElements(By.tagName(tagName="radio"));
		//WebElement group1RadioButtons=Buttons.findElements(By.tagName(tagName="radio"));

	//int group1RadioButtons_Size=group1RadioButtons.getSize();
		//int group1RadioButtons_Size=group1RadioButtons.Size();
		//int group1RadioButtons_Size=group1RadioButtons.
		int group1RadioButtons_Size=group1RadioButtons.size();
		System.out.println(" The number of Radion buttons in Group1 are : "+group1RadioButtons_Size);

		for(int i=0;i<group1RadioButtons_Size;i++) // to check all the Radio Buttons
		{

		group1RadioButtons.get(i).click(); // Clicking on a Radion Button

		Thread.sleep(5000);

		for(int j=0;j<group1RadioButtons_Size;j++) // to get the status of the radio Buttons
		{
		System.out.println(group1RadioButtons.get(j).getAttribute("value")+" "+group1RadioButtons.get(j).getAttribute("checked"));
		}


		}

		}

		//private static WebElement findElements(By tagName) {
			// TODO Auto-generated method stub
			//return null;
		}

	
			
		




	


	