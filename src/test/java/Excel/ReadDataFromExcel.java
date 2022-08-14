package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws Exception {
	    //create file instance 
		File file=new File("F:\\ExcelFile\\Test2.xlsx");
		//read the data from file by using fileinput stream
		FileInputStream fis = new FileInputStream(file);
		//convert the raw data into excel sheet usable 
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet =workbook.getSheetAt(0);
		String cellvalue=sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println(cellvalue);
		
		//get the defined rows
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		
		
		
	
		
		workbook.close();
		fis.close();
		
		
    
	}

}
