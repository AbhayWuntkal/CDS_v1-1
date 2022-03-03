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

import com.abc.corporateprofile.dto.User_Details;
import com.abc.corporateprofile.travelpolicy.dto.Departments;
import com.abc.corporateprofile.travelpolicy.dto.Designations;

public class ExcelHelper {

	// Determines the required type of file to be uploaded
	public static String TYPE = "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet";
	
	// Verifies if the uploaded type of file matches the required type 
	public static boolean isExcelFormat(MultipartFile file) {
		if (!TYPE.equals(file.getContentType())) {
			return false;
		}
		return true;
	}

	// Excel helper to add all Departments from an excel sheet into the database using Apache OPI
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
				User_Details user = new User_Details();
				int cellIdx = 0;
				System.out.println("Inserting contents of excel file into database");
				while (cellsInRow.hasNext()) {
					Cell currentCell = cellsInRow.next();
					switch (cellIdx) {
					//first column of the table is inserted into the below field
					case 0:
						System.out.println("Department Name: " + currentCell.getStringCellValue());
						Departments.setDepartment_name(currentCell.getStringCellValue());
						break;
					//second column of the table is inserted into the below field
					case 1:
						System.out.println("Department Code: " + currentCell.getStringCellValue());
						Departments.setDepartment_code(currentCell.getStringCellValue());
						break;
					//third column of the table is inserted into the below field	
					case 2:
						System.out.println("Created By: " + user.getUserid());
						Departments.setCreated_by(user.getUserid());
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
	
	// Excel helper to add all Designations from an excel sheet into the database using Apache OPI 
	public static List<Designations> excelToDesignations(InputStream is) {
		try {
			Workbook workbook = new XSSFWorkbook(is);
			Sheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rows = sheet.iterator();
			List<Designations> designations = new ArrayList<Designations>();
			int rowNumber = 0;
			while (rows.hasNext()) {
				Row currentRow = rows.next();
				// skip header
				if (rowNumber == 0) {
					rowNumber++;
					continue;
				}
				Iterator<Cell> cellsInRow = currentRow.iterator();
				Designations Designations = new Designations();
				User_Details user = new User_Details();
				int cellIdx = 0;
				System.out.println("Inserting contents of excel file into database");
				while (cellsInRow.hasNext()) {
					Cell currentCell = cellsInRow.next();
					switch (cellIdx) {
					//first column of the table is inserted into the below field
					case 0:
						System.out.println("Designation Name: " + currentCell.getStringCellValue());
						Designations.setDesignation_name(currentCell.getStringCellValue());
						break;
					//second column of the table is inserted into the below field
					case 1:
						System.out.println("Designation Code: " + currentCell.getStringCellValue());
						Designations.setDesignation_code(currentCell.getStringCellValue());
						break;
					//third column of the table is inserted into the below field
					case 2:
						System.out.println("Created By: " + user.getUserid());
						Designations.setCreated_by(user.getUserid());
						break;
					default:
						break;
					}
					cellIdx++;
				}
				designations.add(Designations);
			}
			workbook.close();
			return designations;
		} catch (IOException e) {
			throw new RuntimeException("Failed to parse Excel file: " + e.getMessage());
		}
	}
	
}