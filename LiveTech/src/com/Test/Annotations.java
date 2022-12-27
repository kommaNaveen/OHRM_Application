package com.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Annotations {
	@BeforeTest
	public void applicationLaunch() throws IOException {

	WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	System.setProperty("webdriver.chrome.driver", "C:/Users/navee/WorkSpace/chromedriver.exe");
	driver = new ChromeDriver();
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	FileInputStream file = new FileInputStream("./src/com/Test/Book1.xlsx");
	   XSSFWorkbook workbook = new XSSFWorkbook(file);
	XSSFSheet sheet = workbook.getSheet("sheet1");


	Row row =sheet.getRow(1);
	Cell userName=row.getCell(0);
	Cell Password=row.getCell(1);

	String username=userName.getStringCellValue();
	System.out.println(username);

	String password=Password.getStringCellValue();
	System.out.println(password);


	String expected_LogInPage_logInPanelText="LOGIN Panel";
	System.out.println(" The expected LogIn Page Text is : "+expected_LogInPage_logInPanelText);

	WebElement actual_LogInPageElement=driver.findElement(By.id("logInPanelHeading"));
	String actual_LogInPageText=actual_LogInPageElement.getText();
	System.out.println(" The actual Text of the LogIn Page is :"+actual_LogInPageText);


	if(actual_LogInPageText.equals(expected_LogInPage_logInPanelText))
	{
	System.out.println(" Reached at the LogIn page : "+" PASS ");
	    Cell textTestResult=row.createCell(2);
	    textTestResult.setCellValue("Reached at the LogIn page : "+" PASS");


	}
	else
	{
	System.out.println(" Failed to Reach LogIn Page :"+ " FAIL ");
	Cell textTestResult=row.createCell(2);
	textTestResult.setCellValue(" Failed to Reach LogIn Page :"+ " FAIL");


	}

	String expected_OrangeHRMApplicationLogInPageTitle="OrangeHRM";
	System.out.println(" The expected Title of OrangeHRM Application LogIN Page is : "+expected_OrangeHRMApplicationLogInPageTitle);

	String actual_OrangeHRMApplicationLogInPageTitle=driver.getTitle();
	System.out.println(" The actual Title of OrangeHRM Application LogIn Page is : "+actual_OrangeHRMApplicationLogInPageTitle);

	if(actual_OrangeHRMApplicationLogInPageTitle.equals(expected_OrangeHRMApplicationLogInPageTitle))
	{
	System.out.println(" Landed at OrangeHRM Application LogIn Page Successfull - PASS");
	Cell testResultCell1=row.createCell(5);
	testResultCell1.setCellValue("Landed at OrangeHRM Application LogIn Page Successfull - PASS");
	}
	else
	{
	System.out.println(" Failed to land at OrangeHRM Application LogIn Page - FAIL");
	Cell testResultCell1=row.createCell(5);
	testResultCell1.setCellValue("Failed to land at OrangeHRM Application LogIn Page - FAIL");

	}


	FileInputStream file1 = new FileInputStream("./src/properties/update.properties");
	Properties pr=new Properties();
	pr.load(file1);
//<input name="txtUsername" id="txtUsername" type="text">
	WebElement userNameElement=driver.findElement(By.id(pr.getProperty("UserNameProperty")));
	userNameElement.sendKeys(username);

	WebElement passwordElement=driver.findElement(By.name(pr.getProperty("PasswordProperty")));
	passwordElement.sendKeys(password);

	//WebElement logInButtonElement=driver.findElement(By.ClassName(pr.getProperty("Loginbutton")));
	WebElement logInButton=driver.findElement(By.className(pr.getProperty("Loginbutton")));
	logInButton.click();
//<input type="submit" name="Submit" class="button" id="btnLogin" value="LOGIN">
	WebElement welComeAdminElement=driver.findElement(By.id(pr.getProperty("WelcomeAdminProperty")));
	String actual_welComeAdminElementText=welComeAdminElement.getText();


	String expected_HomePageText="Admin";

	if(actual_welComeAdminElementText.contains(expected_HomePageText))
	{
	System.out.println(" Landed at HomePage Successfully - PASS");
	Cell testResultCell=row.createCell(10);
	testResultCell.setCellValue("Landed at HomePage Successfully - PASS");


	}
	else
	{
	System.out.println(" Failed to land at the HomePage - FAIL");
	Cell testResultCell=row.createCell(10);
	testResultCell.setCellValue("Failed to land at the HomePage - FAIL");
	}

	welComeAdminElement.click();
	WebElement logOutElement=driver.findElement(By.linkText(pr.getProperty("LogOutProperty")));
	logOutElement.click();

	FileOutputStream file2 = new FileOutputStream("./src/com/Test/Book1.xlsx");
	workbook.write(file2);
	}



	}
