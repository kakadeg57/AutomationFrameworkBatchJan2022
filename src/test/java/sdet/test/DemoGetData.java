package sdet.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoGetData {

	public static void main(String[] args) throws IOException {
		
FileInputStream file = new FileInputStream("E:\\Sample\\TestData_01.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		 XSSFSheet   sheet = workbook.getSheet("EmpData");
		
         int rowCount = sheet.getLastRowNum();  //0
         int colCount = sheet.getRow(0).getLastCellNum();//1
         
        // System.out.println(rowCount);
         //System.out.println(colCount);
         
         
         for(int i=0;i<=rowCount;i++) {
        	 
        	 for(int j=0;j<colCount;j++) {
        		 
        		     String  data =sheet.getRow(i).getCell(j).toString();
        		     System.out.print(data+"   ");
        	 }
        	 
        	 System.out.println();
        	 
        	 
        	 
         }
         
         
	}


	}


