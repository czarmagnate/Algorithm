import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] arr = { "black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white" };
		String first = sc.next();
		String second = sc.next();
		String third = sc.next();
		long answer = 0;

		for (int i = 0; i < arr.length; i++) {
			if (first.equals(arr[i])) {
				answer += i * 10;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (second.equals(arr[i])) {
				answer += i;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (third.equals(arr[i])) {
				for (int j = 0; j < i; j++) {
					answer *= 10;
				}
			}
		}
		System.out.println(answer);

		sc.close();
	}

}