import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
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
		Arrays.sort(nArr);

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < m; i++) {
			int a = Integer.parseInt(st.nextToken());
			bw.write(lastIndex(nArr, a) - firstIndex(nArr, a) + " ");
		}
		br.close();
		bw.flush();
		bw.close();
	}

	public static int firstIndex(int[] array, int value) {
		int left = 0;
		int right = array.length;

		while (left < right) {
			int middle = (left + right) / 2;
			if (value <= array[middle]) {
				right = middle;
			} else {
				left = middle + 1;
			}
		}
		return left;
	}

	public static int lastIndex(int[] array, int value) {
		int left = 0;
		int right = array.length;
		
		while (left < right) {
			int middle = (left + right) / 2;
			if (value < array[middle]) {
				right = middle;
			} else {
				left = middle + 1;
			}
		}
		return left;
	}

}