/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116435.luthfiazizalpaqih.latihan43.gajipegawai;

import java.util.Scanner;
/**
 *
 * @author Luthfi
 * NIM  : 10116435
 * NAMA : Luthfi Aziz Al Paqih
 */

public class PBOUlang10116435LuthfiAzizAlPaqihLatihan43Gajipegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        GajiPegawai gape = new GajiPegawai();
        
        System.out.println("### Data Gaji Karyawan PT. KAKATU ###");
        System.out.println("-------------------------------------");
        System.out.print("Nama Karyawan : ");
        gape.setNama(sc1.nextLine());
        
        System.out.print("Alamat : ");
        gape.setAlamat(sc2.nextLine());
        
        System.out.print("Uang Transport : Rp " );
        gape.setUangTransport(sc3.nextInt());
        
        System.out.print("Uang Tunjangan : Rp ");
        gape.setUangTunjangan(sc3.nextInt());
        
        
        System.out.print("Gaji Pokok : Rp ");
        gape.setGajiPokok(sc3.nextInt());
        gape.totalGaji(gape.getUangTunjangan(), gape.getUangTransport(), 
                gape.getGajiPokok());
        System.out.print("Total Gaji : Rp " + gape.getTotalGaji());
        
        gape.tampilData(gape.getNama(), gape.getAlamat(), 
                gape.getUangTunjangan(), gape.getUangTransport(), 
                gape.getGajiPokok(), gape.getTotalGaji());
    }
    
}
