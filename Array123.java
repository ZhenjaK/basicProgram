import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		int i;
		int k;
		int j;
		int[] mas1 = new int[] { 2, 4, 6, 4, 2, 7, 4, 5, 3, 4, 5, };
		int[] mas2 = new int[] { 1, 1, 1, 1, 1 };
		int[] mas = new int[mas1.length + mas2.length];
		k = enter("Enter k");
		for (i = 0; i < k+1; i++) {
			mas[i] = mas1[i];
		}
				for (i = k + 1, j=0; j < mas2.length; j++, i++) {
					mas[i]=mas2[j];
								
			
		}
		for(i=k,j=k+mas2.length;j<mas.length; i++, j++) {
			mas[j]=mas1[i];
		}
		
		for (i = 0; i < mas.length ; i++) {
			System.out.print(" " + mas[i]);
		}

	}

	public static int enter(String message) {
		int k;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Error, please enter again");
		}
		k = sc.nextInt();
		return k;
	}

}
