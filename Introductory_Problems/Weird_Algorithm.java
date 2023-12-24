import java.io.*;
import java.lang.*;
import java.util.*;

class Weird_Algorithm{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		ArrayList<Integer>list = new ArrayList<>();
		list.add(n);
		while(n != 1){
			if(n % 2 == 0){
				n /= 2;
			} else {
				n *= 3;
				n += 1;
			}
			list.add(n);
		}
		System.out.println(list);
	}
}