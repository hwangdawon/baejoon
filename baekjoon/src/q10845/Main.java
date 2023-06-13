package q10845;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String line = br.readLine();
			int n = Integer.parseInt(line);
			QueueExam q = new QueueExam(10000);
			for (int i = 0; i < n; i++) {
				line = br.readLine();
				StringTokenizer st = new StringTokenizer(line);

				String cmd = "";
				String value = "";

				if (st.countTokens() == 2) {
					cmd = st.nextToken();
					value = st.nextToken();
				} else {
					cmd = st.nextToken();
				}

				switch (cmd) {
				case "push":
					int v = Integer.parseInt(value);
					q.push(v);
					break;
				case "pop":
					q.pop();
					break;
				case "front":
					q.front();
					break;
				case "back":
					q.back();
					break;
				case "size":
					int size = q.size();
					System.out.println(size);
					break;
				case "empty":
					q.empty();
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}