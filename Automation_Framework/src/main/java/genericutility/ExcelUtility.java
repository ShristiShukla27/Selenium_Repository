package genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * @author Shristi
 */
public class ExcelUtility {
	
	/**
	 * This method will read String data from Excel file and return value to the caller
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return String
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getStringFromExcelFile(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getStringCellValue();
	}
	/**
	 * This method will read Number data from Excel file and return value to the caller
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return double
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public double getNumberDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getNumericCellValue();
	}
	/**
	 * This method will read Boolean data from Excel file and return value to the caller
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return boolean
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public boolean getBooleanDataFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getBooleanCellValue();
	}
	/**
	 * This method will read Local Date and Time from Excel file and return value to the caller
	 * @param sheetName
	 * @param rowIndex
	 * @param colIndex
	 * @return LocalDateTime
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public LocalDateTime getDateAndTimeFromExcel(String sheetName, int rowIndex, int colIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/TestScriptData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet(sheetName).getRow(rowIndex).getCell(colIndex).getLocalDateTimeCellValue();
	}
}
