// abstraction is hiding internal details and showing essential functionality.
//abstraction is declared by using abstract keyword before a class.
//we can achieve 0-100% abstraction
//abstract class can contain both the abstract and non-abstract method also
//It can also have constructor and static method also.
//we can't create the object of abstract class.
// A method have no body is called abstract method
//A method have body that is called non-abstract method
// 50%-- 66.88%
abstract class A{
	abstract void display();
	abstract void display3();
	void display1() {
		System.out.println("Non abstract Method");
	}
}
class A2 extends A{
	void display() {
		System.out.println("Second class extends class A");
	}
	void display3() {
		
	}
}
class A3 extends A{
	void display3() {
		
	}
	
	@Override
	void display() {
		// TODO Auto-generated method stub
		
	}
}
public class Abstraction extends A {

	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Abstract method display()");
	}

	@Override
	void display3() {
		// TODO Auto-generated method stub
		System.out.println("ABstract method display3()");
		
		
	}
	public static void main(String[] args) {
		Abstraction ss =new Abstraction();
		ss.display();
		ss.display3();
		ss.display1();
		A ss1 = new Abstraction();// upcasting-- object of child class & reference of parent class
		ss1.display1();
	}

		
}

	
	

