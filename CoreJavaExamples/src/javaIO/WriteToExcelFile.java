package javaIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcelFile 
{
	public static void main(String[] args)
	{
		try
		{
			
			XSSFWorkbook wb = new XSSFWorkbook();
			Sheet sheet1 = wb.createSheet("FirstSheet");
			
			Map<String,String> map = new HashMap<String,String>();
			map.put("ID","Name");
			map.put("1","Rashmi");
			map.put("2","Adhira");
			map.put("3","Amar");
			map.put("4","Anuja");
			
			Set<String> kSet = map.keySet();
			
			int rowNum = 0;
			
			for(String key :kSet)
			{
				Row row = sheet1.createRow(rowNum++);
				
				String strValue = map.get(key);
				
				Cell cell0 = row.createCell(0);		
				
				cell0.setCellValue(strValue);
			}
			
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Rashmi\\Desktop\\TestIoFolder\\WriteToExcel.xlsx");
			try {
				wb.write(fout);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
