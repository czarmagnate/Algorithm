import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] nArr = new int[n];

		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			nArr[i] = Integer.parseInt(st.nextToken());
		}

		int m = Integer.parseInt(br.readLine());
		int[] mArr = new int[m];

		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < m; i++) {
			mArr[i] = Integer.parseInt(st.nextToken());
		}

		for (int i : mArr) {
			int cnt = 0;
			for (int j : nArr) {
				if (i == j) {
					cnt = 1;
					break;
				}
			}
			bw.write(cnt + "\n");
		}

		bw.flush();
		bw.close();
	}

}
