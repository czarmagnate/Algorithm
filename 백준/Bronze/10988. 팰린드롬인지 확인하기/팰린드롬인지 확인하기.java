import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = br.readLine();

		isPalindrome(s);

		bw.flush();
		bw.close();
	}

	public static void isPalindrome(String s) {
		String temp = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			temp += s.charAt(i);
		}
		if (s.equals(temp))
			System.out.println(1);
		else
			System.out.println(0);
	}

}
