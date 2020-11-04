package com.selBasics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class GmailTest
{
	WebDriver driver = null;
	
	//Launch browser
	public void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\Rashmi Study material 2020\\chromedriver.exe");
			driver = new ChromeDriver();
			
			//Get url
			driver.get("https://gmail.com");
			
			//Maximize window
			driver.manage().window().maximize();
			
			//Set the wait
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println("Exception in launchBrowser");
		}
	}
		//Login to gmail
		public void loginGmail()
		{
			try 
			{
				//Get user Id and password from excel file
				
				List<String> list = readFromExcel();
				
				//Get userid element
				driver.findElement(By.id("identifierId")).sendKeys(list.get(0));
				
				//Click on next button
				driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
				
				//Enter password
				driver.findElement(By.name("password")).sendKeys(list.get(1));
				
				//Click on next button
				//driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).sendKeys(Keys.ENTER);;
				//driver.findElement(By.xpath("//span[text()='Next']/following-sibling::div")).click();
				
				Thread.sleep(3000);
				driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
			
				System.out.println("Succesfully logged in..");
			} 
			catch (Exception e) 
			{
				System.out.println("Exception in loginGmail");
			}
		}
		
		//Read username and password from excel file
		private List<String> readFromExcel() 
		{
			List<String> list = new ArrayList<String>();
			FileInputStream fin = null;
			try
			{	
				File file = new File("C:\\Users\\Rashmi\\Desktop\\TestIoFolder\\UserDetails.xlsx");
				fin = new FileInputStream(file);
					
				XSSFWorkbook wb = new XSSFWorkbook(fin);
				Sheet sheet = wb.getSheetAt(0);
				Row row = sheet.getRow(1);
				Cell userIDCell = row.getCell(0);
				Cell PassCell = row.getCell(1);
				
				String userID = userIDCell.getStringCellValue();
				String Password = PassCell.getStringCellValue();
				
				list.add(userID);
				list.add(Password);
				
				System.out.println(list);
			}
			catch(Exception e)
			{
				System.out.println("Exception in readFromExcel()");
			}
			finally 
			{
				try
				{
					fin.close();
				} catch (IOException e)
				{
					e.printStackTrace();
				}
			}
			return list;
		}
		
		//Compose mail
		public void composeMail()
		{
			int c;
			FileInputStream fin = null;
			
			try 
			{
				Thread.sleep(3000);
				//Click on Compose mail
				driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
				
				Thread.sleep(5000);
				
				//Add file content in email body
				WebElement mailBody = driver.findElement(By.xpath("//div[contains(@class,'Am Al')]"));
				mailBody.click();
				
				File file = new File("C:\\Users\\Rashmi\\Desktop\\TestIoFolder\\MailContent.txt");
				
				fin = new FileInputStream(file);

				while((c=fin.read())!=-1)
				{
					System.out.print((char)c);
					mailBody.sendKeys(String.valueOf((char)c));
				}
			
				System.out.println("Written mail body succesfully");
			}
			catch (Exception e)
			{
				System.out.println("Exception in composeMail()");
			}
			finally
			{
				try {
					fin.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		//Send mail
		public void sendMail() throws InterruptedException
		{
			
//			Actions action = new Actions(driver);
//			
//			//Add recipient
			WebElement reciepient = driver.findElement(By.xpath("//div[contains(text(),'Recipients')]"));
			
			reciepient.click();
			
			WebElement tofield  =driver.findElement(By.xpath("//textarea[@name='to']"));
			System.out.println("To button found");

			
			tofield.sendKeys("rashmidesai883@gmail.com");
			
			//click on send button
			driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
			
			Thread.sleep(3000);
		}
	
		//Open the same mail
		public void openMail()
		{
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//table[@id=':2d']//tbody//tr[1]")).click();
			//driver.findElement(By.xpath("//span[@name='me']")).click();
		}
		
		//Delete emails
		public void deleteEmail()
		{
			//Get the number of rows
			List<WebElement> rows =	driver.findElements(By.xpath("//table[@id=':2d']/tbody/tr"));
			int rowSize = rows.size();
			System.out.println("Number of rows :"+rowSize);
			
			List<WebElement> colList = driver.findElements(By.xpath("//table[@id=':2d']/tbody/tr[1]/td"));
			int colSize = colList.size();
			System.out.println("Number of columns :"+colSize);
			
			for(int i=1;i<=rowSize;i++)
			{
				String text = driver.findElement(By.xpath("//table[@id=':2d']/tbody/tr["+i+"]/td[4]")).getText();
				if(text.equalsIgnoreCase("me"))
				{
					driver.findElement(By.xpath("//table[@id=':2d']/tbody/tr["+i+"]/td[2]")).click();
				}
			}
			
			//click on delete
			driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji nX T-I-ax7 T-I-Js-Gs mA']")).click();
			
			System.out.println("All the text with name deleted succesfully..");
		}
		
}
