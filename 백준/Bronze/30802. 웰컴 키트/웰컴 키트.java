import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[6];
		int cnt = 0;
		int cntP = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int t = sc.nextInt();
		int p = sc.nextInt();

		for (int i : arr) {
			if (i % t == 0)
				cnt += i / t;
			else if (i == 0)
				cnt += 0;
			else
				cnt += i / t + 1;

		}

		System.out.println(cnt);
		System.out.println((n / p) + " " + (n % p));

		sc.close();
	}

}
