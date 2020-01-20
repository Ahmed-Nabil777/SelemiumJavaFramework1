package utils;



import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcilUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet   sheet ;
	
	
	public ExcilUtils(String excelPath, String sheetName){
		try {
		workbook=new XSSFWorkbook(excelPath);
	    sheet = workbook.getSheet(sheetName);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static int getRowCount()
	{
		int rowCount=0;
		
		try {
			
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("number of sheet rows is: " + rowCount);
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return rowCount;
		
	}
	public static String getcelldataString(int row, int col)
	{
		String cellData = null;
		try {
			
			String celldata = sheet.getRow(row).getCell(col).getStringCellValue();
			System.out.println("the cell data is: " + celldata);
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
		return cellData;
		
	}
	public static void getcelldataNumric(int row, int col)
	{
		
		try {
			
			double celldata = sheet.getRow(row).getCell(col).getNumericCellValue();
			System.out.println("the cell data is: " + celldata);
		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();
		}
	}
		public static int  getColCount()
		{
			
			int colCount =0;
			
			try {
				
			    colCount = sheet.getRow(0).getPhysicalNumberOfCells();
				System.out.println("number of sheet col is: " + colCount);
			} catch (Exception exp) {
				// TODO Auto-generated catch block
				System.out.println(exp.getMessage());
				System.out.println(exp.getCause());
				exp.printStackTrace();
			}
		return colCount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getRowCount();
		getcelldataString(0,0);
		getcelldataNumric(1,1);

	}

}
