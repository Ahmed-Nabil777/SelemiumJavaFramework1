package utils;

public class ExcelUtilsNew {

	public static void main(String[] args) {
		
		
		ExcilUtils excel = new ExcilUtils("C:\\Users\\amnabil\\eclipse-workspace\\SeleniumJavaFramework\\excel\\data.xlsx", "Sheet1");
		
		
		ExcilUtils.getcelldataNumric(1, 1);
		ExcilUtils.getcelldataString(0, 0);
		ExcilUtils.getrowcount();
	}

}
