/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Picasso.utils;

/**
 *
 * @author DUCKY
 */

import java.io.*;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelManager {
    private static ExcelManager instance;
    private String loggedUsername;

    private Workbook workbook;
    private Sheet sheet;
    private String filePath = "data.xlsx";
    private String sheetName = "Sheet1";

    public ExcelManager(String filePath, String sheetName) {
        this.filePath = filePath;
        try {
            File file = new File(filePath);
            if (file.exists()) {
                FileInputStream fis = new FileInputStream(file);
                workbook = new XSSFWorkbook(fis);
                fis.close();
            } else {
                workbook = new XSSFWorkbook();
            }

            sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                sheet = workbook.createSheet(sheetName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ExcelManager getInstance() {
        if (instance == null) {
            instance = new ExcelManager("data.xlsx", "Sheet1");
        }
        return instance;
    }

    private String getCellValueAsString(Cell cell) {
        if (cell == null)
            return "";
        switch (cell.getCellType()) {
            case STRING:
                return cell.getStringCellValue();
            case NUMERIC:
                return String.valueOf((long) cell.getNumericCellValue());
            case BOOLEAN:
                return String.valueOf(cell.getBooleanCellValue());
            default:
                return cell.toString();
        }
    }

    public void setLoggedUsername(String username) {
        this.loggedUsername = username;
    }

    public String getLoggedUsername() {
        return loggedUsername;
    }

    public boolean checkPassword(String inputEmail, String inputPassword) {
        if (sheet == null) {
            System.err.println("ERROR: Sheet is not initialized. Cannot check password.");
            return false;
        }
        for (Row row : sheet) {
            Cell usernameCell = row.getCell(0);
            Cell emailCell = row.getCell(1);
            Cell passwordCell = row.getCell(2);

            if (emailCell != null && passwordCell != null) {
                String storedEmail = getCellValueAsString(emailCell);
                if (storedEmail.trim().equalsIgnoreCase(inputEmail)) {
                    String storedPassword = getCellValueAsString(passwordCell);
                    if (storedPassword.trim().equals(inputPassword)) {
                        if (usernameCell != null) {
                            loggedUsername = getCellValueAsString(usernameCell).trim();
                            setLoggedUsername(loggedUsername);
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public void addRow(Object[] data) {
        int lastRow = sheet.getLastRowNum();
        Row row = sheet.createRow(lastRow + 1);
        int colNum = 0;
        for (Object value : data) {
            Cell cell = row.createCell(colNum++);
            if (value instanceof String)
                cell.setCellValue((String) value);
            else if (value instanceof Integer)
                cell.setCellValue((Integer) value);
            else if (value instanceof Double)
                cell.setCellValue((Double) value);
        }
    }

    public void updateCell(int rowIndex, int colIndex, String newValue) {
        Row row = sheet.getRow(rowIndex);
        if (row == null)
            row = sheet.createRow(rowIndex);
        Cell cell = row.getCell(colIndex);
        if (cell == null)
            cell = row.createCell(colIndex);
        cell.setCellValue(newValue);
    }

    public int findRowByValue(int colIndex, String searchValue) {
        for (Row row : sheet) {
            Cell cell = row.getCell(colIndex);
            if (cell != null && cell.getCellType() == CellType.STRING) {
                if (cell.getStringCellValue().equalsIgnoreCase(searchValue)) {
                    return row.getRowNum();
                }
            }
        }
        return -1;
    }

    public boolean checkWordInColumn2(String inputWord) {
        if (sheet == null) {
            System.err.println("ERROR: Sheet is not initialized. Cannot check for duplication.");
            return false;
        }
        for (Row row : sheet) {
            Cell cell = row.getCell(1);
            if (cell != null) {
                String value = "";
                switch (cell.getCellType()) {
                    case STRING:
                        value = cell.getStringCellValue();
                        break;
                    case NUMERIC:
                        value = String.valueOf(cell.getNumericCellValue());
                        break;
                    default:
                        value = cell.toString();
                        break;
                }

                if (value.trim().equalsIgnoreCase(inputWord)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void saveFile() {
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            workbook.write(fos);
            fos.close();
            System.out.println("Save: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
