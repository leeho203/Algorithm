import java.util.*;

public class CatalanNumber {
	static long[] cache = new long[31];

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String result = "";

		for (int i = 0; i < cache.length; i++)
			cache[i] = -1;

		while (true) {
			int num = sc.nextInt();
			if (num == 0)
				break;
			result += catalan(num) + "\n";
		}

		System.out.print(result);
	}

	static long catalan(int n) {
		long result = 0;

		if (n == 0 || n == 1)
			return 1;

		if (cache[n] != -1)
			return cache[n];

		for (int i = 0; i < n; i++)
			result += catalan(i) * catalan(n - 1 - i);

		return cache[n] = result;
	}
}
