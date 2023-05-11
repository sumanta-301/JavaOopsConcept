// if the first class is interface then we use implement instead of extends
// class--class: extends
// interface-- interface : extends
 abstract class Interface1{
	abstract void display0();
	abstract void print();
}
 abstract class Interface2 extends Interface1{
	 abstract int displayb(int a, int b);
	 abstract void print2(int sum);
	 void display0() {
		 System.out.println("This a method overriding of class Interface1");
	 }
	 void print() {
		 System.out.println("This is a second method overriding of class Interface1");
	 }
	 void displayb1(int c, int d) {
		System.out.println("Addition is "+ c+d);
	 }
 }
  class Abstraction1 extends Interface2{
	  
@Override
	void display0() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}

public static void main(String[] args) {
	Abstraction1 addition = new Abstraction1();
	addition.display0();
	addition.displayb(2, 3);
	addition.print();
	
	
}

@Override
int displayb(int a, int b) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
void print2(int sum) {
	// TODO Auto-generated method stub
	
}

  }
