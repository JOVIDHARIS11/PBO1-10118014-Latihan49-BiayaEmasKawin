/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo1.pkg10118014.latihan49.biayaemaskawin;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author 
 * NAMA  : Jovi D Haris
 * KELAS : IF 1
 * NIM   : 10118014
 * Deskripsi Program : Program ini untuk membuat perhitungan untuk mas kawin.
 */
public class PBO110118014Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        DecimalFormat mataUangIndonesia = (DecimalFormat) 
                      DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRP = new DecimalFormatSymbols();
        
        formatRP.setCurrencySymbol("Rp.");
        formatRP.setMonetaryDecimalSeparator(',');
        formatRP.setGroupingSeparator('.');
        
        mataUangIndonesia.setDecimalFormatSymbols(formatRP);
        
        
        Emas objEmas = new Emas();
        objEmas.setHargaGram(570000);
        objEmas.setBeratEmas(15.7);
        System.out.println("====Aplikasi Hitung Harga Emas====");
        System.out.printf("Total Bayar Emas : %s %n ", 
                           mataUangIndonesia.format(
                           objEmas.perhitungan(objEmas.getHargaGram(), 
                           objEmas.getBeratEmas())));

    }
    
}
