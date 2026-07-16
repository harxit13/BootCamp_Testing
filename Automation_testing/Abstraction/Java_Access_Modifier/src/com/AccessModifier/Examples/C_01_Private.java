package com.AccessModifier.Examples;

class A{
	int x=100;
}

public class C_01_Private {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A obj=new A();
         int output=obj.x;
         System.out.println("Output is:" + output);
	}

}
