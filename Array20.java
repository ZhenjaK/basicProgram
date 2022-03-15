package by.online.array.one;

import java.util.Scanner;

public class Array20 {

	public static void main(String[] args) {
		int N;
		int i;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		N = sc.nextInt();

		int[] mas = new int[N];

		for (i = 0; i < N; i++) {
			System.out.println("Enter element " + i);
			mas[i] = sc.nextInt();
		}
		
		for (i = 0; i < N; i++) {
			System.out.print(" " + mas[i]);
		}
		System.out.println(" ");
		
		for (i = 1; i < N; i+=2) {
			mas[i]=0;
		}
		for (i = 0; i < N; i++) {
			System.out.print(" " + mas[i]);
		}
	}

}
