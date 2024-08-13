import java.io.*;
import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Long> list = new ArrayList<>();
		for (int i = 0; i < n - 1; i++) {
			long x = sc.nextLong();
			list.add(x);
		}
		System.out.println(Solution(list, n));
	}

	private static long Solution(ArrayList<Long> arr, int n) {
		long N = (long)n * ((long)n + 1l) / 2l;
		for (int i = 0; i < n - 1; i++) {
			N -= arr.get(i);
		}
		return N;
	}
}