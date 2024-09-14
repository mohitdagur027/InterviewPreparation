package BasicPrograms;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

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
    }
}
