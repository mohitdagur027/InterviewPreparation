package BasicPrograms;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadExcelFile {
    public static void main(String[] args) throws IOException {
        FileInputStream readfile = new FileInputStream("abnd");
        XSSFWorkbook workbook = new XSSFWorkbook(readfile);
        int sheetcount = workbook.getNumberOfSheets();
        for (int i = 0; i < sheetcount; i++) {
            XSSFSheet sheet = workbook.getSheetAt(i);
            int firstRowNum = sheet.getFirstRowNum();
            int lastRowNum = sheet.getLastRowNum();
            for (int j = firstRowNum; j <= lastRowNum; j++) {
                Row row = sheet.getRow(j);
                if (row != null) {
                    int firstCellNum = row.getFirstCellNum();
                    int lastCellNum = row.getLastCellNum();
                    for (int k = firstCellNum; k <= lastCellNum; k++) {
                        Cell cell = row.getCell(k);
                        DataFormatter dataformatter = new DataFormatter();
                        String value = dataformatter.formatCellValue(cell);
                        System.out.print(value + " ");
                    }
                    System.out.println();
                }
            }


        }

    }
}
