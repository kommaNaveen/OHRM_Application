package com.OHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class URL {


		public static void main(String[] args) throws InterruptedException   {
			 String orangeHrmUrlaAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
			 System.setProperty("webdriver.chrome.driver","C:/Users/navee/WorkSpace/chromedriver.exe");
			 ChromeDriver driver = new ChromeDriver();
			 driver.get(orangeHrmUrlaAddress);
			 String expected_OrangeHrmLoginPageTitle="OrangeHRM";
			 System.out.println("The expected Title of OrangeHrmLoginPage is :"+expected_OrangeHrmLoginPageTitle);
			 String actual_OrangeHrmLoginPageTitle=driver.getTitle();
			 System.out.println("The actual Title of OrangeHrmLoginPage is :"+actual_OrangeHrmLoginPageTitle);
			 if(actual_OrangeHrmLoginPageTitle.equals(expected_OrangeHrmLoginPageTitle))
			 {
				 System.out.println("Landed at OrangeHRM Application LogIn Page Successfull - PASS");
			 }
			 else
			 {
				 System.out.println("Failed at OrangeHRM Application LogIn Page - FAIL");
			 }
			 String Url="OrangeHRM";
			 String expected="OrangeHRM";
			 if(Url.equalsIgnoreCase(expected))
			 {
				 System.out.println("The title of OrangeHrm matched-PASS");
			 }
			 else
			 {
				 System.out.println("The title of OrangeHrm  not matched-FAIL");
			 }
			 //<div id="<div id="logInPanelHeading">LOGIN Panel</div>">
	         WebElement Login=driver.findElement(By.id("logInPanelHeading"));
	         
	         String LoginText=Login.getText();
	         System.out.println("The text of the log in pannel is :"+LoginText);
	         
	         driver.findElement(By.name("txtUsername")).sendKeys("Naveen");
	         //<input name="txtPassword" id="txtPassword" autocomplete="off" type="password">
	         driver.findElement(By.id("txtPassword")).sendKeys("Naveen123@");
	         WebElement loginButton=driver.findElement(By.className("button"));
	         loginButton.click();
	        String actual_titleofOranganeHrmHomePage=driver.getTitle();
	        System.out.println("The actual title of orangeHrm HomePage is:"+actual_titleofOranganeHrmHomePage);
	        String expected_titleofOrangeHrmHomePage="orangeHRM";
	        		System.out.println("The expected title of orangeHrm HomePage is:"+expected_titleofOrangeHrmHomePage);
	        		if(actual_titleofOranganeHrmHomePage.equals(expected_titleofOrangeHrmHomePage))
	        		{
	        			 System.out.println("Landed at OrangeHRM Application Home Page Successfull - PASS");
	        			 
	        		}
	        		else
	        		{
	        			System.out.println("Failed at OrangeHRM Application Home Page - FAIL");	
	        		}
	        		//String OrangeHrmHomeUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	        		driver.get("http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboar");
	        		//String actual_OrangeHrmHomeUrlAddress=driver.get(OrangeHrmHomeUrlAddress);
	        		String actual_OrangeHrmHomeUrlAddress=driver.getCurrentUrl();
	        		System.out.println("the actual_OrangeHrmHomeUrlAddress is:"+actual_OrangeHrmHomeUrlAddress);
	        		String expected_OrangeHrmHomeUrlAddress="orangehrm";
	        		System.out.println("the expected_OrangeHrmHomeUrlAddress is:"+expected_OrangeHrmHomeUrlAddress);
	        		if(actual_OrangeHrmHomeUrlAddress.contains(expected_OrangeHrmHomeUrlAddress))
	        		{
	        			System.out.println("The Url Address Contains orangehrm-PASS");
	        		}
	        		else
	        		{
	        			System.out.println("The Url Address does not Contains orangehrm-FAIL");
	        		
	        		}
	        		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPimModule" id="menu_pim_viewPimModule" class="firstLevelMenu"><b>PIM</b></a>
	        		 WebElement pimElement=driver.findElement(By.id("menu_pim_viewPimModule"));
	        		  Actions act = new Actions (driver);
	        		  act.moveToElement(pimElement).build().perform();
	        				 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee" id="menu_pim_addEmployee">Add Employee</a>
	        				 WebElement addEmployeeElement=driver.findElement(By.id("menu_pim_addEmployee"));
	        		 addEmployeeElement.click();
	        		 Thread.sleep(2000);
	        		 //<div class="fieldDescription"><em>*</em> First Name</div>
	        		 //<input class="formInputText" maxlength="30" type="text" name="firstName" id="firstName">
	        		 WebElement fristName=driver.findElement(By.id("firstName"));
	        		 fristName.sendKeys("Naveen");
	        		 String expectedFirstName="Naveen";
	        		 String actualFirstName=fristName.getAttribute("value");
	        		 if(actualFirstName.contains(expectedFirstName))
	        		 {
	        		 System.out.println("The First Name is matched: PASS");
	        		 }
	        		 else
	        		 {
	        		 System.out.println("The First Name is missmatched : FAIL");
	        		 }

	        		 //<input class="formInputText" maxlength="30" type="text" name="middleName" id="middleName">
	        		 WebElement middleName= driver.findElement(By.id("middleName"));
	        		 middleName.sendKeys("sai");
	        		 String expectedmiddleName="sai";
	        		 String actualmiddleName=middleName.getAttribute("value");
	        		 if(actualmiddleName.contains(expectedmiddleName))
	        		 {
	        		 System.out.println("The middle Name is matched: PASS");
	        		 }
	        		 else
	        		 {
	        		 System.out.println("The middle Name is missmatched : FAIL");
	        		 }
	        		 //<input class="formInputText" maxlength="30" type="text" name="lastName" id="lastName">
	        		 WebElement lastName=driver.findElement(By.id("lastName"));
	        		 lastName.sendKeys("Komma");
	        		 String expectedLastName="Komma";
	        		 String actualLastName=lastName.getAttribute("value");
	        		 if(actualLastName.contains(expectedLastName))
	        		 {
	        		 System.out.println("The Last Name is matched: PASS");
	        		 }
	        		 else
	        		 {
	        		 System.out.println("The Last Name is missmatched : FAIL");
	        		 }
	        		//String employeeId=driver.findElementByName("employeeId").getAttribute("value");
	        		 String employeeId=driver.findElement(By.id("employeeId")).getAttribute("value");
	        		 System.out.println("the employee id is :"+employeeId);

	        		 //<input type="button" class="" id="btnSave" value="Save">
	        		 WebElement saveElement=driver.findElement(By.id("btnSave"));
	        		 saveElement.click();
	        		 //<input class="formInputText valid" maxlength="10" type="text" name="employeeId" value="0016" id="employeeId">
	        		 //<h1>Naveen sai Komma</h1>
	        		 String employeeFullName=driver.findElementByTagName("h1").getText();
	        		 System.out.println("the employee name is :"+employeeFullName);

	        		 //<a href="#" id="welcome" class="panelTrigger">Welcome Admin</a>
	        		 WebElement welcomeElement=driver.findElementByPartialLinkText("Welcome Admin");
	        		 welcomeElement.click();
	        		 Thread.sleep(10000);
	        		 //<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
	        		WebElement logOutElement=driver.findElementByPartialLinkText("Logout");
	        		 logOutElement.click();
	        		
	        		
	      driver.close();
				 
			 
			 
		
		
		}
		}
			
			//System.setProperty("webdriver.chrome.driver","C:/Users/navee/WorkSpace/chromedriver.exe");

					
