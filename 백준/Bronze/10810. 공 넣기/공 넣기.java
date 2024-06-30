import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] nArr = new int[n];

		int a = 0;
		int b = 0;
		int c = 0;

		for (int i = 0; i < m; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			for (int j = a - 1; j < b; j++)
				nArr[j] = c;
		}

		for (int i = 0; i < n; i++) {
			System.out.print(nArr[i] + " ");
		}

		sc.close();
	}
}
