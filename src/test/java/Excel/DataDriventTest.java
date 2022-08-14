package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriventTest {

	

	public static void main(String[] args) throws IOException {
		
		/*as XSSFWorkbook() accept file input stream object as argument so need to create the FIS object by giving the excel file 
		 located path*/
		//get the excel sheet stored path
		FileInputStream fis=new FileInputStream("F://ExcelFile//DemoData.xlsx");
		//get the complete excel
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		//get the sheet
		int sheets=workbook.getNumberOfSheets();
		for(int i=0;i<sheets;i++)
		{
			if(workbook.getSheetName(i).equalsIgnoreCase("TestData"))
			{
				XSSFSheet sheet=workbook.getSheetAt(i);
				
				//get the row and iterate to the specific row
				Iterator<Row> rows=sheet.iterator();
				Row firstrow=rows.next();
				
				Iterator<Cell>ce=firstrow.cellIterator();
				int k=0;
				int column = 0;
						
				while(ce.hasNext())
				{
					Cell value=ce.next();
					if(value.getStringCellValue().equalsIgnoreCase("Data2"))
					column=k;
				}
				k++;
				System.out.println(column);
			}
		
				
				
			}
		
		}
		
	
		
		
		
		
	}


