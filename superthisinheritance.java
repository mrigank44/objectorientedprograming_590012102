class Car {
    int price;

    Car(int price) {
        this.price = price;   // using this
    }
}

class BMW extends Car {
    int mileage;

    BMW(int price, int mileage) {
        super(price);     
        this.mileage = mileage; 
    }
}

public class superthisinheritance{
    public static void main(String[] args) {
        BMW obj = new BMW(5000000, 15);

        System.out.println(obj.price);
        System.out.println(obj.mileage);
    }
}
