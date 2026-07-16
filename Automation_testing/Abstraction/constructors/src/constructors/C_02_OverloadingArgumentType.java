package constructors;

public class C_02_OverloadingArgumentType {

    public C_02_OverloadingArgumentType(int a, int b) {
        int c = a + b;
        System.out.println("Summation is: " + c);
    }

    public C_02_OverloadingArgumentType(double a, double b) {
        double c = a + b;
        System.out.println("Summation is: " + c);
    }

    public void display() {
        System.out.println("Constructor overloading is working successfully");
    }

    public static void main(String[] args) {

        C_02_OverloadingArgumentType obj1 = new C_02_OverloadingArgumentType(10, 20);
        obj1.display();

        C_02_OverloadingArgumentType obj2 = new C_02_OverloadingArgumentType(20.55, 20.51);
        obj2.display();
    }
}