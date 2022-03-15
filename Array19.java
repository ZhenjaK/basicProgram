package by.online.array.one;

import java.util.Scanner;

public class Array19 {

	public static void main(String[] args) {
		int N;
		int i, n;
		int k;
		int j, temp, max;
		
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
		
		for(i=N-1; i>0;i--) {
			for(j=0;j<i;j++) {
				if(mas[j]>mas[j+1]) {
					temp=mas[j];
					mas[j]=mas[j+1];
					mas[j+1]=temp;
				}
			}
		}
		
		for (i = 0; i < N; i++) {
			System.out.print(" " + mas[i]);
		}
		System.out.println(" ");
		
		
		int[] amount = new int[N];
		
		for (i = 0; i < N; i++) {
			k=0;
			for (n = 0; n < N; n++) {
				if (mas[i]==mas[n]) {
				k++;	
				}
			}
			amount[i]=k;
		}
		
		
		for (i = 0; i < N; i++) {
			System.out.print(" " + amount[i]);
		}
		
		max=amount[0];
		for (i = 0; i < (N - 1); i++) {
			if (amount[i + 1] >= amount[i]) {
				if (amount[i + 1] >= max) {
					max = amount[i + 1];
					
				}
			}
		}
		
		
				
		for (i = 0; i < N; i++) {
			if(amount[i]==max) {
				System.out.print("max is  " + mas[i]);
				break;
			}
		}
		

	}

}
