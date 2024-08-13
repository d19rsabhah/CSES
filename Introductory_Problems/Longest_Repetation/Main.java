import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int max_repetition = 1;
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {

            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
                if (count > max_repetition) {
                    max_repetition = count;
                }
            } else {
                count = 1;
            }
        }
        System.out.println(max_repetition);
    }
}