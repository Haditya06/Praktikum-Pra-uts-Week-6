//Nama : Haditya Muyassar Rizki
//Nim  : 108082500009

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] aanehbanget) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jam masuk   : ");
        int jamMasuk = input.nextInt();
        System.out.print("Masukkan menit masuk : ");
        int menitMasuk = input.nextInt();
        System.out.print("Masukkan jam keluar  : ");
        int jamKeluar = input.nextInt();
        System.out.print("Masukkan menit keluar: ");
        int menitKeluar = input.nextInt();

        int totalMasuk = (jamMasuk * 60) + menitMasuk;
        int totalKeluar = (jamKeluar * 60) + menitKeluar;
        int lamaMenit = totalKeluar - totalMasuk;
        int lamaJam = lamaMenit / 60; 
        int tarif;

        if (lamaJam < 2) {
            tarif = 5_000;
        } else if (lamaJam <= 5) {
            tarif = 10_000;
        } else {
            tarif = 15_000;
        }
        System.out.println("Lama parkir: " + lamaJam +" Jam");
        System.out.println("Tarif parkir yang harus dibayar: Rp" + tarif);
    }
}
