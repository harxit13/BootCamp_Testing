package com.AccessModifier.Examples;

class B{
	int x=10;
	public void b1() {
		System.out.println("This is just a print method");
	}
	protected int z=200;
	protected void ProtectedMethod() {
		System.out.println("This is the protected method");
	}
}
public class C_02_Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         B obj = new B();
         int output= obj.z;
         System.out.println("Value of Z is:" + output);
         obj.b1();
         obj.ProtectedMethod();
	}

}
