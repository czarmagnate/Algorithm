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
		double[] arr = new double[n];
		double max = arr[0];
		double sum = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for (double i : arr) {
			if (i > max)
				max = i;
		}

		for (int i = 0; i < n; i++) {
			arr[i] /= max / 100;
			sum += arr[i];
		}

		bw.write("" + (sum / n));
		bw.flush();
		bw.close();
	}

}
