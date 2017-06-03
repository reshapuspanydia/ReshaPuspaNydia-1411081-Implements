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
public class Mobilbalap implements Mobil {
     public void tampilmobilbalap() {
        System.out.println("Kelas Mobil Balap implements Mobil");
    }
        @Override
        public void Bahanbakar() {
        System.out.println("Mobil ini menggunakan bahan bakar : bensin ");
    }
      @Override
        public void Suara() {
        System.out.println("Mobil ini bersuara : bromm..broommm.ngeengggg");  
        }
     @Override
        public void Tahun() {
        System.out.println("Mobil di Produksi Tahun : 2010");  
        }
}
