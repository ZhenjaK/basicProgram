package by.online.array.one;

import java.util.Scanner;

public class Cycle5 {

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
			if (mas[i]%2==0) {
				n=n+1;
			}
		}
		
		int[] mas2 = new int[n];
		
		for (i = 0; i < N; i++) {
			if (mas[i]%2==0) {
				mas2[m]=mas[i];
				m=m+1;
			}
		}
		if(m==0) {
			System.out.println("We don't have such values");	
		}
		for (m = 0; m < n; m++) {
			System.out.print(mas2[m]);
			System.out.println();
		}
		
		
		
	}

}
