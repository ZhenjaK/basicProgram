package by.online.array.one;

import java.util.Scanner;

public class Array14 {

	public static void main(String[] args) {
		int N, N2 = 0, N1 = 0;
		int i, m;
		int max;
		int min;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		N = sc.nextInt();

		int[] mas = new int[N];

		for (i = 0; i < N; i++) {
			System.out.println("Enter element " + i);
			mas[i] = sc.nextInt();
		}

		for (i = 0; i < N; i++) {
			if (mas[i] % 2 == 0) {
				N2 += 1;

			}
		}
		System.out.println("N2 " + N2);

		for (i = 0; i < N; i++) {
			if (mas[i] % 2 != 0) {
				N1 += 1;
			}
		}
		System.out.println("N1 " + N1);

		int[] mas1 = new int[N1];
		int[] mas2 = new int[N2];

		m = 0;
		for (i = 0; i < N; i++) {
			if (mas[i] % 2 == 0) {
				mas2[m] = mas[i];
				m++;
			}
		}

		for (i = 0; i < N2; i++) {
			System.out.print(" " + mas2[i]);
		}
		System.out.println(" ");

		m = 0;
		for (i = 0; i < N; i++) {

			if (mas[i] % 2 != 0) {
				mas1[m] = mas[i];
				m++;
			}
		}

		for (i = 0; i < N1; i++) {
			System.out.print(" " + mas1[i]);
		}
		System.out.println(" ");

		max = mas2[0];
		for (i = 0; i < (N2 - 1); i++) {
			if (mas2[i + 1] > mas2[i]) {
				if (mas2[i + 1] > max) {
					max = mas2[i + 1];

				}
			}
		}
		min = mas1[0];
		for (i = 0; i < (N1 - 1); i++) {
			if (mas1[i + 1] < mas1[i]) {
				if (mas1[i + 1] < min) {
					min = mas1[i + 1];

				}
			}
		}

		System.out.println("max " + max);
		System.out.println("min " + min);

	}

}
