package javaIO;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReadWriteOp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) 
	{
		FileInputStream fin = null;
		
		try
		{
			File file = new File("C:\\Users\\Rashmi\\Desktop\\TestIoFolder\\ReadFromExcel.xlsx");
			fin = new FileInputStream(file);
			
			@SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(fin);
			XSSFSheet sheet1 = workbook.getSheetAt(0);
			
			Iterator<Row> rows = sheet1.iterator();
			
			while(rows.hasNext())
			{
				Row row = rows.next();
				Iterator<Cell> cells = row.iterator();
				
				while(cells.hasNext())
				{
					Cell cell = cells.next();
					
					switch(cell.getCellType())
					{
						case Cell.CELL_TYPE_NUMERIC :
										System.out.print(cell.getNumericCellValue()+"\t");
										break;
						
						case Cell.CELL_TYPE_STRING :
										System.out.print(cell.getStringCellValue()+"\t");
										break;
										
						default: System.out.println("Cells not avaialble....");
					}
				}
				System.out.println("");
			}
		}
		catch(Exception e)
		{
			System.out.println("Exception occured..");
		}
		finally
		{
			try
			{
				fin.close();
			}
			 catch(Exception e)
			{
				 System.out.println("Exception in finally block...");
			}
		}
	}

}
