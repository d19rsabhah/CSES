import java.util.Scanner;

public class Number_Spiral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            long y = sc.nextLong();
            long x = sc.nextLong();
            if (x > y) {
                if (x % 2 == 1) {
                    System.out.println(x * x - y + 1);
                } else {
                    x--;
                    System.out.println(x * x + y);
                }
            } else {
                if (y % 2 == 0) {
                    System.out.println(y * y + 1);
                } else {
                    y--;
                    System.out.println(y * y + x);
                }
            }
        }

    }
}
