package interfaces;

interface First{
	public void myMethod();
}
interface Second{
	public void myMethod();
}
 class DemoClass implements First,Second{
	 public void myMethod() {
		 System.out.println("Enter some text..");
	 }
	 public void myOtherMethod() {
		 System.out.println("Enter some other text..");
   }
 }
public class main {
  public static void main(String[] args) {
	  DemoClass obj= new DemoClass();
	  obj.myMethod();
	  obj.myOtherMethod();
  }
}
