
public class Static1 {
	static String name = "Sumanta";
	public static void main(String[] args) {
		//System.out.println(name);
		Static1 fName = new Static1();
		fName.name =  "Sachin"; //we can also access by creating object but this is not preferable
		System.out.println(fName);
		
		//Static1.name="Sachin"; // right way or also called as static way to call static variable
		
	}
}
