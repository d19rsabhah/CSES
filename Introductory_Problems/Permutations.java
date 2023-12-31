import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an Integer: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
		ArrayList<Integer> odd = new ArrayList<>();
		ArrayList<Integer> even = new ArrayList<>();
        if (n == 2 && n == 3) {
            System.out.println("NO SOLUTION!");
        } else {
            int x = n;
            for (int i = 0; i < n; i++) {
                arr[i] = x--;
            }

			for(int i = 0; i < n; i++){
				if(arr[i] % 2 == 0){
					even.add(arr[i]);
				} else {
					odd.add(arr[i]);
				}
			}

			for(int i = 0; i < odd.size(); i++){
				even.add(odd.get(i));
			}
			// Print the beautiful permutation
        for (int i = 0; i < n; i++) {
            System.out.print(even.get(i) + " ");
        }
        }

        
    }
}
