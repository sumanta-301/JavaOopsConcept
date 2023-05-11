// example of method over-riding
//class A{
//	int a = 90;
//	void s() {
//		System.out.println("My doubt");
//	}
//	A(){
//		System.out.println("A class");
//	}
//}
class B {
	void display() {
		System.out.println("BBBBB");
	}
	void display(int a) {
		System.out.println("BBBBB" + a);
		
	}
	void display(int a, int b) {
		System.out.println("BBBBB" + a+""+b);
		
	}
}

public class PolumorphismExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B aaa = new B();
		aaa.display();
		aaa.display(2);
		aaa.display(44,66);
		System.out.println("main method");
	}

}
