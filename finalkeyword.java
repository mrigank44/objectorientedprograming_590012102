class A {
    final int variable = 1;   

    final void show() {       
        System.out.println("Final method in class A");
    }
}

final class B {
    static int variable1 = 10;
}


class C extends B {
}


class D extends A {
    
    void show() {
        System.out.println("Overriding final method");
    }
}

public class finalkeyword {
    public static void main(String[] args) {

        A objA = new A();

      
        objA.variable = 100;

        System.out.println(objA.variable);

        B.variable1 = 20;    
        System.out.println(B.variable1);
    }
}