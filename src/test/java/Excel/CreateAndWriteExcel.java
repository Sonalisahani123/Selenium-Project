package Excel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateAndWriteExcel {

	public static void main(String[] args) throws IOException {
		//create complete excel
		 XSSFWorkbook  workbook=new XSSFWorkbook();
		 //Create sheet in excel
		 XSSFSheet sheet=workbook.createSheet();
		 //create row in sheet
		 sheet.createRow(0);
		 //create column and give colm value
		 sheet.getRow(0).createCell(0).setCellValue("Hello");
		 sheet.getRow(0).createCell(1).setCellValue("World");
		 
		 
		 sheet.createRow(1);
		 //create column and give colm value
		 sheet.getRow(1).createCell(0).setCellValue("HYR");
		 sheet.getRow(1).createCell(1).setCellValue("Tutorial");
		
		 
		 //create file store this file into a location
		 File file= new File("F:\\ExcelFile\\Test2.xlsx");
		 FileOutputStream fos=new FileOutputStream(file);
		 workbook.write(fos);
		 workbook.close();
		 

	}

}
