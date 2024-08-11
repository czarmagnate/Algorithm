import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = Integer.parseInt(br.readLine());
		int[] nArr = new int[2 * n];

		for (int i = 0; i < n; i++) {
			nArr[i] = i + 1;
		}

		int firstIndex = 0;
		int lastIndex = n - 1;

		while (firstIndex != lastIndex) {
			firstIndex++; // 첫 카드 버리기
			lastIndex++; // 두 번째 카드 현재배열 마지막으로(n / n+1 순)
			nArr[lastIndex] = nArr[firstIndex];
			firstIndex++; // 다음 카드로 이동
		}

		bw.write(nArr[firstIndex] + "");

		bw.flush();
		bw.close();
	}
}
