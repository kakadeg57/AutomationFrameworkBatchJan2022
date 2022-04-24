package sdet.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {
	
	public static String[][] getdata() throws IOException {
		
           FileInputStream file = new FileInputStream("E:\\Sample\\TestData_01.xlsx");
		
		 XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		 XSSFSheet   sheet = workbook.getSheet("EmpData");
		
         int rowCount = sheet.getLastRowNum();  //0
         int colCount = sheet.getRow(0).getLastCellNum();//1
         
        // System.out.println(rowCount);
         //System.out.println(colCount);
         
         String  data[][]= new String[rowCount][colCount];
         
         
         for(int i=0;i<rowCount;i++) {
        	 
        	 for(int j=0;j<colCount;j++) {
        		 
        		       data[i][j] =sheet.getRow(i+1).getCell(j).toString();
        		     System.out.print(data+"   ");
        	 }
        	 
        	 System.out.println();
        	 
        	
        	 
         }
		return data;
		
         
         
	}

		
		
	}


