package com.cts.excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {		
		// 0,0
		FileInputStream file = new FileInputStream("resources/MagentoData.xlsx");

		XSSFWorkbook book = new XSSFWorkbook(file);

		XSSFSheet sheet = book.getSheet("testMethod");

		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println(cellCount);
		
		String[][] main=new String[rowCount-1][cellCount]; //
	
		
		
		
		DataFormatter format = new DataFormatter();
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<cellCount;j++)
			{
				XSSFCell cell= sheet.getRow(i).getCell(j);
				String cellValue = format.formatCellValue(cell);
				System.out.println(cellValue);
				main[i-1][j]=cellValue;
			}
		}
		
		System.out.println(main);
		//System.out.println(main);
		
		/*
		 * XSSFRow row = sheet.getRow(0);
		 * 
		 * int cellCount = row.getPhysicalNumberOfCells();
		 * System.out.println(cellCount);
		 * 
		 * XSSFCell cell = row.getCell(0);
		 * 
		 * DataFormatter format = new DataFormatter();
		 * 
		 * String cellValue = format.formatCellValue(cell);
		 * 
		 * System.out.println(cellValue);
		 * 
		 */	
		
		book.close();
		file.close();

	}
}
