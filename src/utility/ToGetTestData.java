package utility;

import java.io.IOException;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.io.EncryptedDocumentException;

 public class ToGetTestData
  {
   public static String getTestData(String sheetName, int row, int cell) throws IOException, EncryptedDocumentException
    {
     FileInputStream file = new FileInputStream("path.xlsx");
     String data = WorkBookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
     return data;
    }
  }