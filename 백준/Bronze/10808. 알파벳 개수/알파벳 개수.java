import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char[] charArr = new char[26];
		int[] arr = new int[26];
		charArr[0] = 'a';

		for (int i = 1; i < charArr.length; i++) {
			charArr[i] = (char) (charArr[i - 1] + 1);
		}
		String s = sc.next();

		for (int i = 0; i < s.length(); i++) {
			for (int j = 0; j < charArr.length; j++) {
				if (s.charAt(i) == charArr[j]) {
					arr[j] += 1;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}
