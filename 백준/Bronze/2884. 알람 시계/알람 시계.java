import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();

		if (min - 45 < 0) {
			hour--;
			min = 60 + (min - 45);
		} else
			min = (min - 45);

		if (hour == -1)
			hour = 23;
		else
			hour %= 24;

		System.out.println(hour + " " + min);

		sc.close();
	}

}
