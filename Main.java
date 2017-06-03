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
public class Main {
    public static void main(String[] args){
        Kendaraan kd = new Kendaraan();
        System.out.println("Ini Kelas Kendaraan");
         System.out.println("------------------");
        
        Mobilkodok mk =  new Mobilkodok();
        mk.tampilmobil();
          System.out.println("------------------");
        mk.tampilmobilkodok();
            mk.Bahanbakar();
            mk.Suara();
            mk.Tahun();
         System.out.println("------------------");
        
        Mobilelf me = new Mobilelf();
        me.tampilmobilelf();
            me.Bahanbakar();
            me.Suara();
            me.Tahun();
        System.out.println("------------------");
        
        Mobilbalap mb = new Mobilbalap();
        mb.tampilmobilbalap();
            mb.Bahanbakar();
            mb.Suara();
            mb.Tahun();
        System.out.println("------------------");
        
        Sepeda_motor sm = new Sepeda_motor();
        sm.tampilkansepeda_motor();
        System.out.println("------------------");
        
        Sepeda sp = new Sepeda();
        sp.tampilkansepeda();
        System.out.println("------------------");
        
    }
    
}
