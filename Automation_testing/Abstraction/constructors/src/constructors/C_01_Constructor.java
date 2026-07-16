package constructors;

public class C_01_Constructor {

	public C_01_Constructor() {
		System.out.println("This is the constructor block");
	}
	//method
	public void method() {
		System.out.println("This is method block");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        C_01_Constructor obj= new C_01_Constructor();//default constructor
        obj.method();
	}

}
