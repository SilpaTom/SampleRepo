package excelread;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {

	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	
	// to get the string data
	public static String getStringData(int a,int b) throws IOException 
	{
		f=new FileInputStream("C:\\Users\\Silpa\\Desktop\\salary.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		return c.getStringCellValue();
	}
	
	// to get the integer data
	public static String getIntegerData(int a,int b) throws IOException 
	{
		f=new FileInputStream("C:\\Users\\Silpa\\Desktop\\salary.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		XSSFRow r=s.getRow(a);
		XSSFCell c=r.getCell(b);
		int y= (int) c.getNumericCellValue();//type casting- number to string conversion
		return String.valueOf(y);
	}
	
	
}
