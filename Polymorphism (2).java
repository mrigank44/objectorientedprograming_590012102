class Subject{
    int sum(int a,int b){
        return a+b;
    }
}

public class Polymorphism {
public static void main(String[] args) {
    Subject d = new Subject();
    System.out.println(d.sum(2,3));
}
}
