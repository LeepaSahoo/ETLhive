package com.ETLhive.www.Selenium;

public class overloading {
	
public static void main(String[] args){
	A obj1=new A();
	obj1.sum(10,20);
	B obj2= new B();
	obj2.sum(30,40,50);
}
}


class A{
	int a;
	int b;
	int sum(int x,int y) {
		int c=a+b;
	}
	System.out.println(c);
}

class B{
	int p;
	int q;
	int r;
	int sum(int x, int y, int z) {
		int t= p+q+r; 			
	}
	System.out.println(t);
}