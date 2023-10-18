package apache_POI;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataExcel {

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
		XSSFSheet sheet = workbook.getSheetAt(0);

		// There are two method to read data, the one is using the for loop and the
		// other is using the Iterator method.

		/////////////////////////////////////////////////////////
		// Using For Loop

		// get number of rows
		int rows = sheet.getLastRowNum();

		// get number of cols
		int cols = sheet.getRow(1).getLastCellNum();

		// use two for loop to get the row and col values

		for (int r = 0; r <= rows; r++) {

			// We will get the current row
			XSSFRow row = sheet.getRow(r); // initially = 0

			for (int c = 0; c < cols; c++) {
				XSSFCell cell = row.getCell(c); // initially = 0

				// In excel we will have different data types, so we have to specify the type
				// using switch case
				switch (cell.getCellType()) {
				case NUMERIC:
					System.out.print(cell.getNumericCellValue());
					break;

				case STRING:
					System.out.print(cell.getStringCellValue());
					break;

				case BOOLEAN:
					System.out.print(cell.getBooleanCellValue());
					break;

				case FORMULA:
					System.out.print(cell.getNumericCellValue());
					break;

				default:
					break;
				}

				System.out.print(" | ");

			}
			System.out.println("\n");
		}

		/*
		 * 
		 * ///////////////////////////////////////////////////////// // Using Iterator -
		 * two while loop // All the step will remain same till getting sheet Iterator
		 * iterator = sheet.iterator();
		 * 
		 * while(iterator.hasNext()) { XSSFRow row = (XSSFRow) iterator.next();
		 * 
		 * Iterator cellIterator = row.cellIterator();
		 * 
		 * while(cellIterator.hasNext()) { XSSFCell cell = (XSSFCell)
		 * cellIterator.next();
		 * 
		 * switch (cell.getCellType()) { case NUMERIC:
		 * System.out.print(cell.getNumericCellValue()); break;
		 * 
		 * case STRING: System.out.print(cell.getStringCellValue()); break;
		 * 
		 * case BOOLEAN: System.out.print(cell.getBooleanCellValue()); break;
		 * 
		 * default: break; }
		 * 
		 * System.out.print(" | "); } System.out.println("\n"); }
		 */
	}

}
