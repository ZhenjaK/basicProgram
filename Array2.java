package by.online.array.one;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int N;
		int i;
		int n=0;
		int m=0;
		
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		N = sc.nextInt();
		
		int[] mas = new int[N];

		for (i = 0; i < N; i++) {
			System.out.println("Enter element " + i);
			mas[i] = sc.nextInt();
		}
		
		for (i = 0; i < N; i++) {
			if (mas[i]==0) {
				n=n+1;
			}
		}
		
		int[] index = new int[n];
		
		for (i = 0; i < N; i++) {
			if (mas[i]==0) {
				index[m]=i;
				m=m+1;
			}
		}
		for (m = 0; m < n; m++) {
			System.out.print(index[m]);
			System.out.println();
		}
		
		
		
	}

}
