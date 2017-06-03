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
public class Sepeda {
    public void tampilkansepeda() {
        System.out.println("Ini kelas Sepeda");
        Kendaraan kd = new Kendaraan();
        kd.setJenis("BMX");
        System.out.println("Jenis Sepeda Ini Adalah : " + kd.getJenis());
        kd.setMerk("Sergio");
        System.out.println("Merk Sepeda Ini Adalah : " + kd.getMerk());
        
    }
    
}
