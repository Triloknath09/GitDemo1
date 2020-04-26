package Fileutils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

public class Exceldata3 {
	public XSSFSheet ExcelWSheet;
	public XSSFWorkbook ExcelWBook;
	public XSSFCell Cell;
	public XSSFRow Row;
	
	public void setExcelFile(String Path, String SheetName) throws Exception {
		try {
			// Open the Excel file
			// FileInputStream ExcelFile = new FileInputStream(Path);
			FileInputStream ExcelFile = new FileInputStream(new File(Path));
			// Access the required test data sheet
			ExcelWBook = new XSSFWorkbook(ExcelFile);
			ExcelWSheet = ExcelWBook.getSheet(SheetName);
		} catch (Exception e) {
			System.out.println("Exception" + e);
			throw (e);
		}
	}

	// This method is to read the test data from the Excel cell, in this we are
	// passing parameters as Row num and Col num
	public String getCellData(int RowNum, int ColNum) throws Exception {
		try {
			Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			// String CellData = Cell.getStringCellValue();
			String CellData = Cell.toString();
			return CellData;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception occurred" + e);
			return "";
		}
	}

	// This method is to write in the Excel cell, Row num and Col num are the
	// parameters
	public void setCellData(String Path1, String Result, int RowNum, int ColNum) throws Exception {
		try {
			//Row = ExcelWSheet.getRow(RowNum);
			ExcelWSheet.getRow(RowNum).createCell(ColNum).setCellValue(Result);		
		/*//Cell = Row.getCell(ColNum, org.apache.poi.ss.usermodel.Row.RETURN_BLANK_AS_NULL);
		
			if (Cell == null) {
				Cell = Row.createCell(ColNum);
				Cell.setCellValue(Result);
			} else {
				Cell.setCellValue(Result);
			}*/
			FileOutputStream fileOut = new FileOutputStream(new File(Path1));
			ExcelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			throw (e);
		}
	}		
}