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
public class Mobilkodok implements Mobil {
    
    public void tampilmobil() {
    System.out.println("Ini Kelas Mobil");
        Kendaraan mbl = new Kendaraan();
        mbl.setMerk("Volkswagen");
        System.out.println("Merk Mobil Ini = " + mbl.getMerk());
        mbl.setJenis("Mini Bus");
        System.out.println("Jenis Mobil Ini = " + mbl.getJenis());
    }
    
    public void tampilmobilkodok() {
        System.out.println("Kelas Mobilkodok implements Mobil");
    }
        @Override
        public void Bahanbakar() {
        System.out.println("Mobil ini menggunakan bahan bakar : bensin ");
    }
      @Override
        public void Suara() {
        System.out.println("Mobil ini bersuara : bremm...brem....");  
        }
        
    @Override
        public void Tahun() {
        System.out.println("Mobil di Produksi Tahun : 1983");  
        }
    }
