import java.util.Scanner;
class Car{
    int n;
}

public class constructornonpara{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Car c = new Car();
        System.out.println("enetr the number for the car");
        c.n = sc.nextInt();
        System.out.println("the entered number is " +c.n);
    }
}