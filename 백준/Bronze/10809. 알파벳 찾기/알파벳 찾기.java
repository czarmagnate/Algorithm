import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		String s = br.readLine();

		for (int i = s.length() - 1; i >= 0; i--) {
			arr[s.charAt(i) - 97] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i] + " ");
		}

		bw.flush();
		bw.close();

	}

}
