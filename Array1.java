package by.online.array.one;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {

		int N;
		int K;
		int sum = 0;
		int i;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		N = sc.nextInt();
		System.out.println("Enter K");
		K = sc.nextInt();

		int[] mas = new int[N];

		for (i = 0; i < mas.length; i++) {
			System.out.println("Enter element " + i);
			mas[i] = sc.nextInt();
		}

		for (i = 0; i < mas.length; i++) {
			System.out.print(" " + mas[i]);
		}

		for (i = 0; i < mas.length; i++) {
			if (mas[i]%K==0) {
				sum=sum+mas[i];
			}
		}
		System.out.println();
		System.out.print(sum);
	}

}
