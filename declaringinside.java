import java.util.Scanner;

public class declaringinside {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int sum = 0;
        int arr[] = new int[5];

        System.out.println("enter 5 numbers");

        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }

        System.out.println("sum " + sum);
    }
}
