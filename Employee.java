package PracticeConstructor;

public class Employee {

	private String name;
	private double payRate;
	private final int EMPLOYEE_ID;
	private static int nextID=1000;
	
	public static final double STARTING_PAY_RATE = 12.50;
	
	//First  Constructor
	public Employee(String name) {
		this.name= name;
		EMPLOYEE_ID = getNextID();
	}
	
	public Employee(String name, double payRate) {
		this.name=name;
		this.payRate=payRate;
		EMPLOYEE_ID = getNextID();
	}
	
	public String getName() {
		return name;
	}
	public int getEmployeeID() {
		return EMPLOYEE_ID;
	}
	public double getPayRate() {
		return payRate;
	}
	
	public void changeName(String newName) {
		name=newName;
	}
	public void changePayRate(double newPayRate) {
		payRate = newPayRate;
	}
	
	public static int getNextID() {
		int id = nextID;
		nextID++;
		return id;
	}
	


}
