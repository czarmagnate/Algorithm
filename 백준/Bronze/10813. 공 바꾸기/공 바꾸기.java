import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] nArr = new int[n + 1];
		int m = sc.nextInt();

		for (int i = 1; i < n + 1; i++) {
			nArr[i] = i;
		}

		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int temp = 0;

			temp = nArr[a];
			nArr[a] = nArr[b];
			nArr[b] = temp;
		}

		for (int i = 1; i < n + 1; i++)
			System.out.print(nArr[i] + " ");

		sc.close();
	}

}
