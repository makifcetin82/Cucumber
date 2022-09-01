package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _08_WriteInTheExcel {

    public static void main(String[] args) throws IOException {

        //var olan bir excel yazma işlemi

        String path="src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream inputStream=new FileInputStream(path);

        Workbook workbook= WorkbookFactory.create(inputStream);
        Sheet sheet=workbook.getSheet("Sheet1");

     //hafıza oluşturma
         Row yeniSatir=sheet.createRow(0);//satır oluşturuldu
         Cell yeniHucre=yeniSatir.createCell(0);//yeni satırda ilk hücre oluşturuldu
          yeniHucre.setCellValue("Merhaba Dünya");//bilgi yazıldı


        for( int i=1;i<10; i++){

            yeniSatir.createCell(i).setCellValue(i);
        }
        //sır kaydetme geldi bütün bilgiler hafızada buraya kadar hersey workbook da

        inputStream.close();//okuma modu kapatıldı cünkü yazma modunda acılması gerekiyor

        FileOutputStream outputStream=new FileOutputStream(path);
        workbook.write(outputStream);
        workbook.close();//hafıza boşaltıldı
        outputStream.close();
        System.out.println("işlem tamamlandı");

    }




}
