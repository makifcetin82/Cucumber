package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Sheet.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_ApachePOIGetAllData {
    public static void main(String[] args) throws IOException {


        String path = "src/test/java/ApachePOI/RESOURCE/aPACHEExcel2.xlsx";
        FileInputStream dosyaOkumaBaglantisi = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(dosyaOkumaBaglantisi);
        Sheet sheet = workbook.getSheet("Sheet1");
// calisma sayfasındaki toplam satır sayısını veriyor.
        int rowCount = sheet.getPhysicalNumberOfRows();//satır sayısı=rowcount


        for (int i = 0; i < rowCount; i++) {// rowları dolasıyor dısta ki for döngüsü

            Row row = sheet.getRow(i);
            int cellCount = row.getPhysicalNumberOfCells();

            for (int j = 0; j < cellCount; j++) {// cellcount=hücresayısı da denebilir i satırdaki hücre sayısı kadar dönecek
                Cell hucre = row.getCell(j);//bu satırdaki sıradaki hücreyi aldım
                System.out.print(hucre + " ");
            }

            System.out.println();

        }


    }


}
