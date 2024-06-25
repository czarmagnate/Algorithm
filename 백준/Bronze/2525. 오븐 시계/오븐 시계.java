import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int curHour = sc.nextInt();
		int curMin = sc.nextInt();
		int minute = sc.nextInt();

		if ((curMin + (minute % 60))>=60) {
			curHour += (minute/60)+1;
			curMin += (minute % 60)-60;
			if(curHour >= 24) {
				curHour -= 24;
			}
		} else {
			curHour += (minute/60);
			curMin += (minute % 60);
			if(curHour >= 24) {
				curHour -= 24;
			}
		}
		System.out.println(curHour + " " + curMin);
		
		sc.close();
	}

}