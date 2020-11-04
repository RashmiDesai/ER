package javaIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcel {

	public static void main(String[] args) throws IOException
	{
		//Create Sheet
		XSSFWorkbook wb = new XSSFWorkbook();
		
		Sheet sheet = wb.createSheet("SheetDemo");

		Map<String,Object[]> data = new TreeMap<String,Object[]>();
		data.put("1", new Object[]{"ID","FIRST NAME","LAST NAME"});
		data.put("2", new Object[]{"10","Amar","Desai"});
		data.put("3", new Object[]{"20","Rashmi","Patil"});
		data.put("3", new Object[]{"30","Adhira","Desai"});
		data.put("4", new Object[]{"50","Anuja","Chavan"});
				
		Set<String> keys =	data.keySet();
		
		for(String key :keys)
		{
			int rowNum = 0;
			Row row = sheet.createRow(rowNum++);
			
			Object[] objArr = data.get(key);
			
			int cellNum = 0;
			for(Object obj :objArr)
			{
				Cell cell = row.createCell(cellNum++);
				if(obj instanceof String)
					cell.setCellValue((String)obj);
				else if(obj instanceof Integer)
					cell.setCellValue((Integer)obj);
			}
			
		}
		
		FileOutputStream fout = new FileOutputStream("C:\\Users\\Rashmi\\Desktop\\TestIoFolder\\writeTiFile.xlsx");
		wb.write(fout);
		
		}
	}


