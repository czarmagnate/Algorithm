import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] strArr;

		String str = sc.nextLine();

		if (str.startsWith(" ")) {
			str = str.replaceFirst(" ", "");
			strArr = str.split(" ");
		} else {
			strArr = str.split(" ");
		}
		if (str.length() == 0) {
			System.out.println(0);
		} else {
			System.out.println(strArr.length);
		}

		sc.close();
	}
}
