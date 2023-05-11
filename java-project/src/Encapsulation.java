
public class Encapsulation {
	
	private String name;
	private int age;
	private char gender;
	public Encapsulation(String name, int age, char gender) {
		//per();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	void print() {
		System.out.println("I am printing a private variable");
		};
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
}


 