package by.online.array.one;

import java.util.Scanner;

public class Array17 {

	public static void main(String[] args) {
		int N;
		int i, m;
		int n = 0;
		int min;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		N = sc.nextInt();

		int[] mas = new int[N];

		for (i = 0; i < N; i++) {
			System.out.println("Enter element " + i);
			mas[i] = sc.nextInt();
		}

		min = mas[0];
		for (i = 0; i < (N - 1); i++) {
			if (mas[i + 1] < mas[i]) {
				if (mas[i + 1] < min) {
					min = mas[i + 1];

				}
			}
		}

		System.out.println("min  " + min);

		for (i = 0; i < N; i++) {
			if (mas[i] == min) {
				n += 1;
			}
		}

		System.out.println("n  " + n);

		n = N - n;

		int[] masM = new int[n];
		
		m = 0;
		for (i = 0; i < N; i++) {
			if (mas[i] != min) {
				masM[m] = mas[i];
				m++;
			}
		}
		for (i = 0; i < n; i++) {
			System.out.print(" " + masM[i]);
		}
		
	}

}
