import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		ArrayList<String> list = new ArrayList<String>();

		for (int i = 0; i < n; i++) {
			str[i] = br.readLine();
			if (!list.contains(str[i]))
				list.add(str[i]);
		}

		list.sort(Comparator.naturalOrder());

		for (int i = 1; i <= 50; i++) {
			for (String s : list) {
				if (s.length() == i) {
					sb.append(s + "\n");
				}
			}
		}
		System.out.println(sb);

	}

}
