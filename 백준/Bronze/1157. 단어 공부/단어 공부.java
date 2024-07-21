import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		char[] ch = br.readLine().toLowerCase().toCharArray();
		int[] nArr = new int[26];

		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < nArr.length; j++) {
				if (ch[i] - 97 == j) {
					nArr[j] += 1;
				}
			}
		}

		int max = 0;
		int maxIndex = 0;
		int cnt = 0;

		for (int i = 0; i < nArr.length; i++) {
			if (nArr[i] > max) {
				max = nArr[i];
				maxIndex = i;
			}
		}

		for (int i : nArr) {
			if (i == max) {
				cnt += 1;
			}
		}

		if (cnt == 1) {
			bw.write((char) (maxIndex + 65));
		} else {
			bw.write("?");
		}

		bw.flush();
		bw.close();
	}

}
