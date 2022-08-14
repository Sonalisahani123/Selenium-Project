package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadEntireExcel {

	public static void main(String[] args) throws Exception {
		File  file= new File("F:\\ExcelFile\\DemoData.xlsx");
		FileInputStream fis=new FileInputStream(file);
			XSSFWorkbook  excel=new XSSFWorkbook(fis);
			XSSFSheet sheet=excel.getSheet("TestData");
			int row=sheet.getLastRowNum()-sheet.getFirstRowNum();
			System.out.println(row);
			for(int i=0;i<=row;i++)
			{
				int cell=sheet.getRow(i).getLastCellNum();
				System.out.println("row data:"+ i);
				
				 for(int j=0;j<cell;j++)
				 {
					String cellvalue= sheet.getRow(i).getCell(j).getStringCellValue();
					System.out.print(cellvalue + " ,");
				 }
				System.out.println();
				
			}
			
		

	}

}
