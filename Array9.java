package by.online.array.one;

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) {
		int N;
		int i;
		int max, imax = 0;
		int min, imin = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		N = sc.nextInt();

		int[] mas = new int[N];

		for (i = 0; i < N; i++) {
			System.out.println("Enter element " + i);
			mas[i] = sc.nextInt();
		}
		max = mas[0];
		for (i = 0; i < (N - 1); i++) {
			if (mas[i + 1] > mas[i]) {
				if (mas[i + 1] > max) {
					max = mas[i + 1];
					imax = i + 1;
				}
			}
		}
		min = mas[0];
		for (i = 0; i < (N - 1); i++) {
			if (mas[i + 1] < mas[i]) {
				if (mas[i + 1] < min) {
					min = mas[i + 1];
					imin = i + 1;
				}
			}
		}
mas[imax]=min;
mas[imin]=max;


for (i = 0; i < N; i++) {
	System.out.print(" " + mas[i]);
}

		
	}

}
