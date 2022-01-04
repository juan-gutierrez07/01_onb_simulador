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
                                                (int)row.getCell(2).getNumericCellValue(),row.getCell(3).getNumericCellValue());
                rows.add(nueva);
            }

        }catch (Exception e){
            e.printStackTrace();
        }

        return rows;

    }
    /*
    public List<String> urlCampaña(){
        List<String> urls = new ArrayList<String>();

        try {
            this.file = new FileInputStream(new File("InsumosTest.xlsx"));
            this.book = new XSSFWorkbook(file);
            this.hoja = book.getSheet("DatosTest");
            Row row;
            for(int i =1; i<=2;i++){
                row = hoja.getRow(i);
                urls.add(row.getCell(0).getStringCellValue());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return urls;
    }

    public List<Integer> cuotasSelect(){
        List<Integer> cuotas = new ArrayList<Integer>();
        try{
            this.file = new FileInputStream(new File("InsumosTest.xlsx"));
            this.book = new XSSFWorkbook(file);
            this.hoja = book.getSheet("DatosTest");
            Row row;
            for(int i =1; i<=2;i++){
                row = hoja.getRow(i);
                if(row.getCell(2) != null){
                    cuotas.add((int)row.getCell(2).getNumericCellValue());
                }else{
                    cuotas.add(0);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return cuotas;
    }
    public List<Double> montos(){
        List<Double> montos = new ArrayList<Double>();

        try {
            this.file = new FileInputStream(new File("InsumosTest.xlsx"));
            this.book = new XSSFWorkbook(file);
            this.hoja = book.getSheet("DatosTest");
            Row row;
            for(int i =1; i<=2;i++){
                row = hoja.getRow(i);
                montos.add(row.getCell(1).getNumericCellValue());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return montos;
    }

*/
}
