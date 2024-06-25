import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> inputNum = new ArrayList<>();
		int max = 0;
		int index = 0;

		for (int i = 0; i < 9; i++) {
			inputNum.add(sc.nextInt());
			if (inputNum.get(i) > max) {
				max = inputNum.get(i);
				index = i+1;
			}
		}
		System.out.println(max + "\n" + index);

		sc.close();
	}

}
