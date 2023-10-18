package apache_POI;

import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataExcel {

	public static void main(String[] args) throws IOException {
		// In this we will see how to write the data into excel.

		// First of all, we need to create a workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		// Inside the workbook create a sheet
		XSSFSheet sheet=workbook.createSheet("Emp Info");
		
		// Now the data let say we have in an object 
		Object empdata[][]= {	{"EmpID","Name","Job"},
								{101,"Ainaw","Enginner"},
								{102,"Biqa","Manager"},
								{103,"Rellik","Analyst"}
							};
		
		
		/*
		/////////////////////////////// Method 1
		// Using For Loop method
 		
		// getting the length of row and col
		int rows=empdata.length;
		int cols=empdata[0].length;
		
		System.out.println("Number of Rows: "+rows); //4
		System.out.println("Number of Cols: "+cols); //3
		
		for(int r=0; r<rows; r++)  //0
		{
			// Inside the sheet, creating a row
			XSSFRow row=sheet.createRow(r);
			
			for(int c=0;c<cols;c++)
			{
				// Inside a row, creating a cell
				XSSFCell cell=row.createCell(c); //0
				
				// getting the current value from data
				Object value=empdata[r][c];
				
				// checking the type of data to assign to each row with correct type of values
				if(value instanceof String)
					cell.setCellValue((String)value);
				
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		*/
		
		
		
		/////////////////////////////// Method 2
		/// using for...each loop
				int rowCount=0;
				
				for(Object emp[]:empdata)
				{
					XSSFRow row=sheet.createRow(rowCount++);
					int columnCount=0;		
						for(Object value:emp)
						{
							XSSFCell cell=row.createCell(columnCount++);
							
							if(value instanceof String)
									cell.setCellValue((String)value);
							if(value instanceof Integer)
									cell.setCellValue((Integer)value);
							if(value instanceof Boolean)
								cell.setCellValue((Boolean)value);	
						}
				}
		// end of for loop method
		
		
		
		
		
		// Setting up the file path where data will be save
		String filePath=".\\src\\test\\resources\\employee.xlsx";
		FileOutputStream outstream=new FileOutputStream(filePath);
		workbook.write(outstream);
		// close the stream
		outstream.close();
		
		// Printing a success message
		System.out.println("Employee.xls File written successfully...");

	}

}
