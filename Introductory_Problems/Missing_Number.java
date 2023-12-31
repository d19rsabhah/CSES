import java.io.*;
import java.util.*;
import java.lang.*;

public class Missing_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < n - 1; i++) {
			int x = sc.nextInt();
			list.add(x);
		}
		System.out.println(Solution(list, n));
	}

	private static int Solution(ArrayList<Integer> arr, int n) {
		int N = n * (n + 1) / 2;
		for (int i = 0; i < n - 1; i++) {
			N -= arr.get(i);
		}
		return N;
	}
}