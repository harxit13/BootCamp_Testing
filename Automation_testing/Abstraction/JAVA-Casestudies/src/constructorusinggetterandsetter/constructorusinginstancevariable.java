package constructorusinggetterandsetter;

public class constructorusinginstancevariable {

    String webNAme;
    int webAge;

    constructorusinginstancevariable(String name, int age) {
        this.webNAme = name;
        this.webAge = age;
    }

    public static void main(String[] args) {

        constructorusinginstancevariable obj1 =
                new constructorusinginstancevariable("Harshit", 21);

        System.out.println("Website Name: " + obj1.webNAme);
        System.out.println("Website Age: " + obj1.webAge);
    }
}