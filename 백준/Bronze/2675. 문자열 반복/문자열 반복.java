import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		for (int i = 0; i < T; i++) {
			int a = sc.nextInt();
			String s = sc.next();

			for (int x = 0; x < s.length(); x++) {
				for (int j = 0; j < a; j++) {
					System.out.print(s.charAt(x));
				}
			}
			System.out.println();

		}

		sc.close();
	}

}