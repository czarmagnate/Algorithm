import java.util.Arrays;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] arr = new int[28];
		int[] notSub = new int[2];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);

		for (int i = 1; i <= arr.length; i++) {
			if (arr[i - 1] == i + 1) {
				notSub[0] = i;
				break;
			}
		}
		for (int i = 1; i <= arr.length; i++) {
			if (arr[i - 1] == i + 2) {
				notSub[1] = i + 1;
				break;
			}
		}

		if (notSub[0] == 0) {
			System.out.println(29 + "\n" + 30);
		} else if (notSub[1] == 0) {
			System.out.println(notSub[0]);
			System.out.println(30);
		} else {
			System.out.println(notSub[0]);
			System.out.println(notSub[1]);
		}

		sc.close();
	}

}