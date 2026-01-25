import java.util.Scanner;

public class sumofarraydeclaringinside {

    public static void main(String[] args) {

        int sum = 0;
        int arr[] = new int[5];

        Scanner s = new Scanner(System.in);

        System.out.println("enter 5 numbers");

        for (int i = 0; i < 5; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }

        System.out.println("sum " + sum);
    }
}
