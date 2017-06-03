/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapintegration;

/**
 *
 * @author Respus
 */
public class Mobilelf implements Mobil {
    
    public void tampilmobilelf() {
        System.out.println("Kelas Mobil Elf implements Mobil");
    }
        @Override
        public void Bahanbakar() {
        System.out.println("Mobil ini menggunakan bahan bakar : solar ");
    }
      @Override
        public void Suara() {
        System.out.println("Mobil ini bersuara : bremm...dor....");  
        }
     @Override
        public void Tahun() {
        System.out.println("Mobil di Produksi Tahun : 2000");  
        }
}
