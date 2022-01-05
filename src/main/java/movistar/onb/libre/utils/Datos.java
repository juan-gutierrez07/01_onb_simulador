package movistar.onb.libre.utils;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

public class Datos {

    private FileInputStream file ;
    private XSSFWorkbook book;
    private XSSFSheet hoja;

    public List<Solicitud> solicitudesCampañas(){
        List<Solicitud> rows = new ArrayList<Solicitud>();
        try {
            this.file = new FileInputStream(new File("InsumosTest.xlsx"));
            this.book = new XSSFWorkbook(file);
            this.hoja = book.getSheet("DatosTest");
            Row row;

            int cant_sols = (int)(hoja.getRow(1).getCell(6).getNumericCellValue());
            for(int i =1; i <cant_sols; i++){
                row = hoja.getRow(i);
                Solicitud nueva = new Solicitud(row.getCell(0).getStringCellValue(),row.getCell(1).getNumericCellValue(),
                                                (int)row.getCell(2).getNumericCellValue(),row.getCell(3).getNumericCellValue(),
                                                row.getCell(4).getNumericCellValue());
                rows.add(nueva);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return rows;

    }

}
