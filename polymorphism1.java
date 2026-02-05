class Subject{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a, int g,int c){
        return a+g+c;
    }
}

class bmw extends Subject{
    @Override
    int sum(int a,int b){
        return a+b;
    }
}

public class polymorphism1 {
public static void main(String[] args) {
    Subject d = new Subject();
    bmw e = new bmw();
    System.out.println(d.sum(2,3));
    System.out.println(d.sum(2,3,9));
    System.out.println(e.sum(1,2));
}
}
