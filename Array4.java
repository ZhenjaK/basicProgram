package by.online.array.one;

import java.util.Scanner;

public class Array4 {

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
		
		for (i = 0; i < (N-1); i++) {
			if (mas[i]<mas[i+1]) {
							
				if (i==(N-2)) {
					System.out.println("increasing sequence");
				}
			} else {
				System.out.println("Non-increasing sequence");
				break;
			}
			
		}
		
		
	}

}
