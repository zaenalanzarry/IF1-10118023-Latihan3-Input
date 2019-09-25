/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan3;

import java.util.Scanner;
/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : Memasukkan Nilai Dari Keyrboard
 */

public class Latihan3 {

    public static void main(String[] args) {
        System.out.println("Masukkan nama anda :");
        Scanner scanner = new Scanner (System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah " + nama);
    }
    
}
