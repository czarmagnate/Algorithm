import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr1 = { 0, 0 };
		int[] arr2 = { sc.nextInt(), sc.nextInt() };
		int[] arr3 = { sc.nextInt(), sc.nextInt() };

		int min = arr2[0] - arr1[0];

		for (int i = 0; i < arr1.length; i++) {
			if (arr2[i] - arr1[i] < min) {
				min = arr2[i] - arr1[i];
			}
			if (arr3[i] - arr2[i] < min) {
				min = arr3[i] - arr2[i];
			}
		}
		System.out.println(min);

		sc.close();
	}

}
