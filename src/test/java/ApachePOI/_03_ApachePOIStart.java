package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.openxmlformats.schemas.spreadsheetml.x2006.main.WorkbookDocument;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _03_ApachePOIStart {

    public static void main(String[] args) throws IOException {
//dosya yolu alındı
        String path="src/test/java/ApachePOI/RESOURCE/aPACHEExcel2.xlsx";
       // String path="src/test/java/ApachePOI/RESOURCE/aPACHEExcel2.xlsx";

    //JAVA dosya okuma işlemcisine dosyanın yolunu veriyoruz. böylece program ile dosya arası baglantı acıldı

        FileInputStream dosyaOkumaBaglantisi=new FileInputStream(path);


        //dosya okuma işlemcisi üzerinden çalışma kitabı alıyorum
        //hafızadaki workbook u alıp oluşturdu
        Workbook calismaKitabı= WorkbookFactory.create(dosyaOkumaBaglantisi);


        //istediğim çalışma sayfasını alıyorum
        Sheet calismaSayfasi=calismaKitabı.getSheet("Sheet1");
  //shet calismaSayfasi=calismaKitabi.getSheetAt(0);

        //istenen satırı alıyorum
        Row satir=calismaSayfasi.getRow(0);


        Cell hucre=satir.getCell(0);
        System.out.println("hucre="+hucre);
    }

}
