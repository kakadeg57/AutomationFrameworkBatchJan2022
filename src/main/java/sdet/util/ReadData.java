package sdet.util;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static String[][] getData() throws IOException {

		FileInputStream file = new FileInputStream("E:\\Pratik\\Automation Teasting\\TestDataJanBatch.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);

		XSSFSheet sheet = workbook.getSheet("EMP_DATA");

		int rowCount = sheet.getLastRowNum(); // 0 Index
		int colCount = sheet.getRow(0).getLastCellNum(); // 1

		String data[][] = new String[rowCount][colCount];

		// System.out.println(rowCount);
		// System.out.println(colCount);

		for (int i = 0; i < rowCount; i++) {

			for (int j = 0; j < colCount; j++) {

				data[i][j] = sheet.getRow(i + 1).getCell(j).toString();
				// System.out.print(data + " ");

			}

			System.out.println();

		}

		return data;

	}

}
