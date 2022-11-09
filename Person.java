package PracticeConstructor;

public class Person {

	private String name = "";
	private int age = 12;
	
	//Constructor
	public Person(String initialName) {
		this.name=name;
		this.age=0;
	}
	public void printPerson() {
		System.out.println(this.name +" , age"+ this.age +"years");
	}
	
	//Getter
	public String getName() {
		return name;
	}
	
}
