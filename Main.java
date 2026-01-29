class Car {
    int n;

    Car(int price) {
        this.n = price - 4; 
    }

    void displayPrice() {
        System.out.println("Modified price (n): " + n);
    }
}

class BMW extends Car {
    int m;

    BMW(int price) {
        super(price); 
    }

    void f1() {
        this.m = 10; 
        System.out.println("Value of m: " + m);
    }
}

public class Main {
    public static void main(String[] args) {
        BMW c1 = new BMW(100); 
        
        c1.displayPrice();
        c1.f1();
    }
}