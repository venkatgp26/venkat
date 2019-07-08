package com.example.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import com.example.entity.Employee;
import com.example.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@CrossOrigin
	@GetMapping("/getAll")
	public List<Employee> getAllEmployees() {
		System.out.println(employeeService.getEmployee());
		return employeeService.getEmployee();
	}

	@PostMapping(value = "/fileUpload")
	public void uploadingPost(@RequestParam("excel") MultipartFile file) throws IOException {

		XSSFWorkbook workbook = new XSSFWorkbook(file.getInputStream());
		XSSFSheet sheet = workbook.getSheetAt(0);
		// for(Row row : sheet ){
		// System.out.println(row.getCell(0));
		// System.out.println(row.getCell(1));
		// System.out.println(row.getCell(2));
		// System.out.println(row.getCell(3));
		// }
		DataFormatter dataFormatter = new DataFormatter();
		Iterator<Row> rows = sheet.rowIterator();

		while (rows.hasNext()) {
			Employee employee = new Employee();
			Row row = rows.next();
			// display row number in the console.
			System.out.println("Row No.: " + row.getRowNum());
			if (row.getRowNum() == 0) {
				continue; // just skip the rows if row number is 0 or 1
			}
			System.out.println(row.getCell(0));
			employee.setId(Long.valueOf(dataFormatter.formatCellValue(row.getCell(0))));
			System.out.println(row.getCell(1));
			employee.setEmpNo(dataFormatter.formatCellValue(row.getCell(1)));
			System.out.println(row.getCell(2));
			employee.setFullName(dataFormatter.formatCellValue(row.getCell(2)));
			System.out.println(row.getCell(3));
			employee.setHireDate(new Date(dataFormatter.formatCellValue(row.getCell(3))));
			long save = employeeService.save(employee);
			System.out.println(save);
		}
		System.out.println(sheet.getSheetName());

	}

}
