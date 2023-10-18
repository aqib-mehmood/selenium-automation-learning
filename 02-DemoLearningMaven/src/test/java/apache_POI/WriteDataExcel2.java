package apache_POI;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataExcel2 {

	public static void main(String[] args) throws IOException {
		// In this we will see how to write the data into excel.

		// First of all, we need to create a workbook
		XSSFWorkbook workbook = new XSSFWorkbook();

		// Inside the workbook create a sheet
		XSSFSheet sheet = workbook.createSheet("Emp Info");

		// Now the data let say we have in an object in Array List
		ArrayList<Object[]> empdata = new ArrayList<Object[]>();

		empdata.add(new Object[] { "Empid", "Name", "Job" });
		empdata.add(new Object[] { 101, "Biqa", "Enginner" });
		empdata.add(new Object[] { 102, "Rellik", "Manager" });
		empdata.add(new Object[] { 103, "Heura", "Analyst" });
		

		/// using for...each loop

		int rownum = 0;

		for (Object[] emp : empdata) {
			XSSFRow row = sheet.createRow(rownum++);
			int cellnum = 0;

			for (Object value : emp) {
				XSSFCell cell = row.createCell(cellnum++);

				if (value instanceof String)
					cell.setCellValue((String) value);
				if (value instanceof Integer)
					cell.setCellValue((Integer) value);
				if (value instanceof Boolean)
					cell.setCellValue((Boolean) value);
			}
		}
		// end of for loop method

		// Setting up the file path where data will be save
		String filePath = ".\\src\\test\\resources\\employee.xlsx";
		FileOutputStream outstream = new FileOutputStream(filePath);
		workbook.write(outstream);
		// close the stream
		outstream.close();

		// Printing a success message
		System.out.println("Employee.xls File written successfully...");

	}

}
