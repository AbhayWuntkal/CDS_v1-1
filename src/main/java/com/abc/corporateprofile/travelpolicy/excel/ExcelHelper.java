package com.abc.corporateprofile.travelpolicy.excel;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;

import com.abc.corporateprofile.travelpolicy.dto.Departments;

public class ExcelHelper {

	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	public static boolean isExcelFormat(MultipartFile file) {
		if (!TYPE.equals(file.getContentType())) {
			return false;
		}
		return true;
	}

	public static List<Departments> excelToDepartments(InputStream is) {
		try {
			Workbook workbook = new XSSFWorkbook(is);
			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rows = sheet.iterator();
			List<Departments> departments = new ArrayList<Departments>();
			int rowNumber = 0;
			while (rows.hasNext()) {
				Row currentRow = rows.next();
				// skip header
				if (rowNumber == 0) {
					rowNumber++;
					continue;
				}
				Iterator<Cell> cellsInRow = currentRow.iterator();
				Departments Departments = new Departments();
				int cellIdx = 0;
				System.out.println("Inserting contents of excel file into database");
				while (cellsInRow.hasNext()) {
					Cell currentCell = cellsInRow.next();
					switch (cellIdx) {
					case 0:
						System.out.println("Department Name: " + currentCell.getStringCellValue());
						Departments.setDepartment_name(currentCell.getStringCellValue());
						break;
					case 1:
						System.out.println("Department Code: " + currentCell.getStringCellValue());
						Departments.setDepartment_code(currentCell.getStringCellValue());
						break;
					default:
						break;
					}
					cellIdx++;
				}
				departments.add(Departments);
			}
			workbook.close();
			return departments;
		} catch (IOException e) {
			throw new RuntimeException("Failed to parse Excel file: " + e.getMessage());
		}
	}
}
