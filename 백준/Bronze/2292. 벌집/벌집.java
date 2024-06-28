import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long n = sc.nextInt() - 1;

		if (n == 0) {
			System.out.println(1);
		}
        
		int a = 1;
	
		while (n > 0) {
			n -= 6 * a;
			a++;
			if (n <= 0)
				System.out.println(a);
		}

		sc.close();
	}
}
