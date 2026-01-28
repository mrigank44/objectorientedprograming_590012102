import java.util.Scanner;
class Car{
    int n;
    Car(int n){
    this.n= n;
}
}

public class constructorpara{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for num");
        int num = sc.nextInt();
        Car c = new Car(num);
        System.out.println("the entered value is " +c.n);
        
        sc.close();
    }
}