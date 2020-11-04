package com.selBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;

public class FirstSelTC
{ 
	WebDriver driver = null;	

	
	public static void main(String[] args)
	{
		try
		{
			FirstSelTC ob = new FirstSelTC();
			
			//Launch browser
			ob.launchBrowser();
			
			//login to yahoo
			ob.login();
			
			//Compose mail
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
//	//Compose mail
//	public void composeMail()
//	{
//		try
//		{
//			driver.findElement(By.id("compose-button")).click();
//			
//			//Content area
//			WebElement contentArea =driver.findElement(By.id("rte"));
//			int ch =0;
//			File file = new File("C:\\Users\\Rashmi\\Desktop\\Interview\\contentTxtFile.txt");
//			
//			FileReader fileRead = new FileReader(file);
//			
//			while((ch=(fileRead.read())!=-1)
//			{
//				char content = null;
//				content = (char)ch;
//				contentArea.sendKeys(ch);
//			}
//			
//		
//			
//		}
//		catch(Exception e)
//		{
//			
//		}
//	}
	


	//To launch the chrome browser
	public void launchBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Rashmi Study material 2020\\chromedriver.exe");	
		driver = new ChromeDriver();
		
		//Open the yahoo website
		driver.get("https://login.yahoo.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	}
	
	//Login to yahoo
	public void login()
	{
		try
		{
			FirstSelTC obj = new FirstSelTC();
			List<String> list1 = obj.readFromFile();
			
			String userName = list1.get(0);
			String Password = list1.get(1);
			
			driver.findElement(By.id("login-username")).sendKeys(userName);
			
			driver.findElement(By.id("login-signin")).click();
			
			driver.findElement(By.id("password-container")).sendKeys(Password);
			 
			driver.findElement(By.id("login-signin")).click();
			
			Thread.sleep(3000);	
		}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
	
	
	//Read credentials from excel
	public List<String> readFromFile() throws IOException
	{
		List<String> list1 = new ArrayList<String>();
		FileInputStream fin = null;
		try
		{
			fin = new FileInputStream("C:\\Users\\Rashmi\\Desktop\\Interview\\TestData.xlsx");
			XSSFWorkbook wk = new XSSFWorkbook(fin);
			
			Sheet sheet = wk.getSheetAt(0);
			
			Row row =sheet.getRow(1);
			
			Cell cell1 = row.getCell(0);
			String userName = cell1.getStringCellValue();
			System.out.println(userName);
			
			Cell cell2 = row.getCell(1);
			String password = cell2.getStringCellValue();
			
			System.out.println(password);
			
			list1.add(userName);
			list1.add(password);		
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
		finally
		{
			fin.close();
		}
		
		return list1;
	}
	
	
	
	
	
	}
