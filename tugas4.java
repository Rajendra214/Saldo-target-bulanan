/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author NITRO V 15
 * RAJENDRA ARIELLA SATRIANI
 * 23176013
 * SISTEM INFORMASI
 */
public class tugas4 {
 

    public static void main(String[] args) {
        double saldoAwal = 3500000; // Saldo awal
        double bunga = 0.08; // Bunga per bulan dalam persen
        double saldoTarget = 6000000; // Saldo target

        int bulan = 0;
        double saldo = saldoAwal;

        while (saldo < saldoTarget) {
            saldo += saldo * bunga;
            bulan++;
            System.out.printf("Saldo di bulan ke-%d Rp.%,.0f%n", bulan, saldo);
        }
    }
}


