/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10.pkg10119912.rezkiramadhan.no2;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA  : Rezki Ramadhan
 * KELAS : IF10K
 * NIM  `: 10119912
 * 
 */
public class UTSIF1010119912REZKIRAMADHANNo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukan saldo Awal : ");
        Tabungan tbg = new Tabungan(input.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = input.nextInt();
        System.out.println("Saldo anda sekarang : "+tbg.ambilUang(jumlah));
    }
    
}
