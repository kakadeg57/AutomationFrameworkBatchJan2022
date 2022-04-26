package sdet.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class ReadData {
	
	public static String[][] getData() throws IOException {
		FileInputStream file = new FileInputStream("G:\\speedway\\book1.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet  sheet = workbook.getSheet("Sheet1");
		
		int rowCount = sheet.getLastRowNum();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		String data[][]=new String[rowCount][colCount];
		
		//System.out.println(rowCount + "  "+colCount);
		
		
		for (int i=0; i<rowCount;i++) {
			for (int j=0; j<colCount;j++) {
				data[i][j] = sheet.getRow(i+1).getCell(j).toString();
				//System.out.print(data+" ");
			}
			System.out.println();
			
		}
		return data;
		
	}

}
