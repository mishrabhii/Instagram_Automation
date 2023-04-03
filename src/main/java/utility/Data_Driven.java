package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_Driven {
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	int row_Number;

	public  Data_Driven(String string) throws IOException {
		File file = new File("/Users/atulnigam/Documents/AbhiEclipseWorkshop/InstagramFramework/Resource/Login_Data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		this.workbook = new XSSFWorkbook(fis);

	}

	public String getData(int sheetNo, int row, int column) {
		this.sheet = this.workbook.getSheetAt(sheetNo);
		Cell cell = this.sheet.getRow(row).getCell(column);
		String data = cell.getStringCellValue();
		return data;

	}
	public int getRowCount(int sheetIndex) {
		row_Number = this.workbook.getSheetAt(sheetIndex).getLastRowNum();
		++row_Number;
		return row_Number;
	}

}
