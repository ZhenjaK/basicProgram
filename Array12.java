package by.online.array.one;

import java.util.Scanner;

public class Array12 {

	public static void main(String[] args) {
		int N;
		int i,m;
		int sum=0;
					
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array size");
		N = sc.nextInt();
		
		int[] mas = new int[N];

		for (i = 0; i < N; i++) {
			System.out.println("Enter element " + i);
			mas[i] = sc.nextInt();
		}
		
		for (i = 0; i < N; i++) {
			if (i == 2) {
				sum = sum + mas[i];
				System.out.println(mas[i]);
			}

			for(m=2;m<i;m++) {
								if(i%m==0) {
					break;
				}
				if(m==(i-1)) {
					sum=sum+mas[i];
					System.out.println(mas[i]);
				}
			}
		}

		System.out.println(sum);
	}

}
