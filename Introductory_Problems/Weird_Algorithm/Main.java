import java.io.*;
import java.lang.*;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		while (n != 1) {
			System.out.print(n + " ");
			if (n % 2l == 0l) {
				n /= 2l;
			} else {
				n *= 3l;
				n += 1l;
			}
		}
		System.out.println(1);
	}
}