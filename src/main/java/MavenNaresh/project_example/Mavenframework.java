package MavenNaresh.project_example;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Mavenframework {
	public static void main(String[] args) throws InterruptedException, IOException {
		File exc = new File("C:\\Users\\nares\\OneDrive\\Desktop\\Manual Testing\\Book1.xlsx");
		FileInputStream ip = new FileInputStream(exc);
		XSSFWorkbook workbok = new XSSFWorkbook(ip);
		XSSFSheet sheet = workbok.getSheetAt(2);
		XSSFRow row = sheet.getRow(4);
		XSSFCell cell = row.getCell(8);
		int numberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println(numberOfRows);
		int numberOfCells = row.getPhysicalNumberOfCells();
		System.out.println(numberOfCells);
		for (int i = 0; i < numberOfRows; i++) {
			XSSFRow rows = sheet.getRow(i);
			int cells = rows.getPhysicalNumberOfCells();
			System.out.println();
			for (int k = 0; k < cells; k++) {
				XSSFCell cell2 = rows.getCell(k);
				CellType type = cell2.getCellType();
				if (type.equals(type.STRING)) {
					String cvvalue = cell2.getStringCellValue();
					System.out.print(cvvalue);
					System.out.print(" ");
				}
				else if (type.equals(type.NUMERIC)) {
					double valuec = cell2.getNumericCellValue();
					int cvalu = (int) valuec;
					System.out.print(cvalu);
				} else {
					System.out.print(type.BLANK);
					System.out.print(" ");
				}
			}
			workbok.close();
			}}}
