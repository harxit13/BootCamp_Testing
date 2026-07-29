package Utility;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
    XSSFWorkbook wb;

    public ExcelDataProvider() {
    	
        File src = new File("./TestData/Test.xlsx"); // Make sure this matches your exact file name
        try {
            FileInputStream fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
        } catch (Exception e) {
            System.out.println("Unable to read Excel File: " + e.getMessage());
        }
    }

    public String getStringData(String sheetName, int row, int column) {
    	DataFormatter formatter = new DataFormatter();
        
        // This safely converts numeric and formatted cells directly into a String
        
        return formatter.formatCellValue(wb.getSheet(sheetName).getRow(row).getCell(column));
    }

    // Last row index on the sheet (0-based). If row 0 is your header and
    // data runs from row 1 to this number, this tells you how many data
    // rows exist so you can loop over them.
    public int getRowCount(String sheetName) {
        return wb.getSheet(sheetName).getLastRowNum();
    }
}