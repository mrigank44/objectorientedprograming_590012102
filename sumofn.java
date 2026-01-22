import java.util.Scanner;

public class sumofn {

    int sum = 0;
    int n;
    int[] arr;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sumofn obj = new sumofn();

        System.out.print("Enter number of elements: ");
        obj.n = sc.nextInt();

        obj.arr = new int[obj.n];

        System.out.println("Enter " + obj.n + " numbers:");

        for (int i = 0; i < obj.n; i++) {
            obj.arr[i] = sc.nextInt();
            obj.sum += obj.arr[i];
        }

        System.out.println("Sum = " + obj.sum);
        sc.close();
    }
}
