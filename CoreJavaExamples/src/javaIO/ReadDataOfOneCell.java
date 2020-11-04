package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataOfOneCell {

	public static void main(String[] args) throws IOException 
	{
		//File file = new File("C:\\Users\\Rashmi\\Desktop\\TestIoFolder\\ReadFromExcel.xlsx");
		FileInputStream fin  = new FileInputStream("C:\\Users\\Rashmi\\Desktop\\TestIoFolder\\ReadFromExcel.xlsx");
		
		@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fin);
		Sheet sheet = wb.getSheetAt(0);
		Row row = sheet.getRow(5);
		Cell cell = row.getCell(3);
		String strValue = cell.getStringCellValue();
		System.out.println("String value is : "+strValue);

		fin.close();
	}

}
