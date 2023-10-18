package apache_POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteFormulaCell {

	public static void main(String[] args) throws IOException {
		// In this we will see how to write a formula cell
		// First of all, we need to create a workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Inside the workbook create a sheet
		XSSFSheet sheet = workbook.createSheet("Emp Info");

		// Now the data let say we have in an object
		XSSFRow row=sheet.createRow(0);
		
		// creating cells and setting cell values
		row.createCell(0).setCellValue(10);
		row.createCell(1).setCellValue(20);
		row.createCell(2).setCellValue(30);
		
		// creating a formula - you can change the formula
		row.createCell(3).setCellFormula("A1+B1+C1");
		
		
		
		
		// Setting up the file path where data will be save
		String filePath = ".\\src\\test\\resources\\formulaCell.xlsx";
		FileOutputStream outstream = new FileOutputStream(filePath);
		workbook.write(outstream);
		// close the stream
		outstream.close();

		// Printing a success message
		System.out.println("Employee.xls File written successfully...");
	}

}
