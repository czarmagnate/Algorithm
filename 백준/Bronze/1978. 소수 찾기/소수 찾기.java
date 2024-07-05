import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cnt = 0;
		int n = sc.nextInt();
		int cnt2 = 0;

		for (int i = 0; i < n; i++) {
			int num = sc.nextInt();

			for (int j = 1; j <= num; j++) {
				if (num % j == 0)
					cnt++;
			}
			if (cnt == 2) {
				cnt2++;
			}
			cnt = 0;
		}
		System.out.println(cnt2);

		sc.close();
	}

}
