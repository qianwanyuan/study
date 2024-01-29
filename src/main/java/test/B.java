package test;

public class B extends A{
	B(){
		this("abc");
		System.out.println("b");
	}
	B(String name){
		System.out.println("b name");
	}
}
