package exceptionhandling;

public class C_02_CheckedException_ThrowDeclration {
int x=143;
public void m1() {
	System.out.println("VAlue of x:"+x);
}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		C_02_CheckedException_ThrowDeclration obj = new C_02_CheckedException_ThrowDeclration();
		obj.m1();
		Thread.sleep(0);
	}

}
