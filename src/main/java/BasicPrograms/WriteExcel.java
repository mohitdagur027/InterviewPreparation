package BasicPrograms;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) {
        XSSFWorkbook workbook=new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet();

        // Data for sheet
        String[][] data={
                {"First Name","Last Name", "Age"},
                {"Mohit","Dagur","24"},
                {"Aditya","Dagur","21"},
                {"Adarsh","Dagur","19"},
                {"Arun","Dagur","30"},
                {"Varun","Dagur","22"},
                {"Sonam","Chaudhary","27"},
                {"Pooja","Chaudhary","20"}
        };
        for(int i=0;i< data.length;i++){
            Row row= sheet.createRow(i);
            for(int j=0;j<data[i].length;j++){
                Cell cell= row.createCell(j);
                cell.setCellValue(data[i][j]);
            }
        }
        try {
            FileOutputStream writefile=new FileOutputStream("C:\\Users\\Mohit\\OneDrive\\Desktop\\New folder (2)\\Mohit.xlsx");
            try {
                workbook.write(writefile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
