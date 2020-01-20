package utils;

public class ExcelDataProvider {
	
	public static void main(String[] args) {
		
		String excelPath = "C:\\Users\\amnabil\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx"	;
		testData(excelPath, "Sheet1");
	}
	
	
	public static Object[][] testData(String excelPath, String sheetName) {
		ExcilUtils excel = new ExcilUtils(excelPath, sheetName );
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1; i<rowCount; i++) {
			for(int j=1; j<colCount; j++)
			{
				String cellData = excel.getcelldataString(i, j);
				System.out.println(cellData+ " | ");
				data[i-1][j] = cellData;
				
			}
			return data;
			
			
		}
		
		
		
		
	}

}
