package overloading;

public class overload extends A,B{
	public static void main(String[] args){
		A obj1=new A();
		obj1.sum(10,20);
		obj1.print1();
		
		B obj2= new B();
		obj2.sum(30,40,50);
		obj2.print2();

	}
}
	

