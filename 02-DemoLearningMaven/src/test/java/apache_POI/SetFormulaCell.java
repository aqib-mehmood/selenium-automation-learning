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

public class SetFormulaCell {

	public static void main(String[] args) throws IOException {
		// In this we will see how to read the data from excel.

		// First of all, we need path to excel file

		String excelFilePath = "D:\\XORD\\Eclipse\\02-DemoLearningMaven\\src\\test\\resources\\sample.xlsx";

		// Now we need to read the file using FileInputStream
		FileInputStream fis = new FileInputStream(excelFilePath);

		// Now we will get the workbook in the excel file
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		// Now get the sheet in workbook
		// XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		// 
		sheet.getRow(4).getCell(1).setCellFormula("SUM(B2:B4)");

		fis.close();

		FileOutputStream fos = new FileOutputStream(excelFilePath);
		workbook.write(fos);

		workbook.close();
		fos.close();

		System.out.println("Done!!!");

	}

}
