package Pack;

import java.io.IOException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
XSSFSheet sh;
	
	public Excel() throws IOException {
		FileInputStream f=new FileInputStream("E:\\chinju obsquara\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		sh=wb.getSheet("login");
	}

	public String readData(int i, int j) {
		Row r=sh.getRow(i);//0th row
		Cell c=r.getCell(j);
		int celltype=c.getCellType();//0 or 1
		switch (celltype) {
		case Cell.CELL_TYPE_NUMERIC:
		{
			double d=c.getNumericCellValue();
			return String.valueOf(d);
		}
		case 	Cell.CELL_TYPE_STRING:
		{
			return c.getStringCellValue();
		}
		
	}
		return null;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
