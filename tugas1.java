//Nama : Haditya Muyassar Rizki
//Nim  : 108082500009

import java.util.Scanner;

public class tugas1{
	public static void main(String[] aduhbang) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Masukan: ");
		int a = sc.nextInt();

		if(a % 2 == 0){
			System.out.print(a+" Tidak Valid");
		}else{
			System.out.print(a+ " Valid");
		}		

    }
}