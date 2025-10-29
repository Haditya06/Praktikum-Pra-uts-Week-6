//Nama : Haditya Muyassar Rizki
//Nim  : 108082500009

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] tauahhaneh) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan bilangan pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan bilangan kedua: ");
        int b = input.nextInt();
      
        int x = a;
        int y = b;
        while (b !=0){
            int sisa = a%b;
            a = b;
            b = sisa;
        }System.out.println("FPB dari "+x+" dan "+y+" adalah "+a);
    }
}
