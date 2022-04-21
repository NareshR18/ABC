package MavenNaresh.project_example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FOStream {

	public static void main(String[] args) throws IOException {

		File f = new File("C:\\Users\\nares\\OneDrive\\Desktop\\Course\\Manual Testing\\Book1.xlsx");
		FileInputStream exc = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(exc);
		XSSFSheet sheet = wb.createSheet("Datas");
		XSSFRow row = sheet.createRow(0);
		XSSFCell cell = row.createCell(0);
		wb.getSheet("Datas").getRow(0).getCell(0).setCellValue("Name");
		wb.getSheet("Datas").getRow(0).createCell(1).setCellValue("Login ID");
		wb.getSheet("Datas").createRow(1).createCell(0).setCellValue("Naresh");
		wb.getSheet("Datas").getRow(1).createCell(1).setCellValue("921315");
		wb.getSheet("Datas").createRow(2).createCell(0).setCellValue("Ram");
		wb.getSheet("Datas").getRow(2).createCell(1).setCellValue("921316");
		wb.getSheet("Datas").createRow(3).createCell(0).setCellValue("Nirmal");
		wb.getSheet("Datas").getRow(3).createCell(1).setCellValue("922215");
		wb.getSheet("Datas").createRow(4).createCell(0).setCellValue("Pavin");
		wb.getSheet("Datas").getRow(4).createCell(1).setCellValue("933331");
		wb.getSheet("Datas").getRow(0).createCell(2).setCellValue("Dept.");
		wb.getSheet("Datas").getRow(1).createCell(2).setCellValue("Mechanical");
		wb.getSheet("Datas").getRow(2).createCell(2).setCellValue("ECE");
		wb.getSheet("Datas").getRow(3).createCell(2).setCellValue("EEE");
		wb.getSheet("Datas").getRow(4).createCell(2).setCellValue("Geo-Informatics");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		wb.close();

	}

}
