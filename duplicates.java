import java.util.Scanner;

public class duplicates {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break; 
                }
            }
        }

        if (count > 0) {
            System.out.println("Duplicate elements are present");
        } else {
            System.out.println("No duplicate elements are present");
        }
    }
}
