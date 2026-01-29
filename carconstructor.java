import java.util.Scanner;
class car{
    int number;
    int speed;
    car(int number, int speed){
        this.number = number;
        this.speed = speed;
    }
}

public class carconstructor{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of car");
        int num = sc.nextInt();
        System.out.println("enter the speed");
        int carspeed = sc.nextInt();
        car c = new car(num,carspeed);
        System.out.println("the entered number " +c.number);
        System.out.println("the entered speed " +c.speed);
         sc.close();
    }
}