package PracticeConstructor;

public class EmployeeMain {
	
	public static void main(String[] args) {
		Employee emp1 = new Employee("Harry Connick Junior", 20);
		
		System.out.println(emp1.getName()+ " ID: " + +Employee.getNextID());
		
		Employee emp2 =new Employee("Samuel L Jackson", 17);
		
		System.out.println(emp2.getName()+ " ID: " + Employee.getNextID());
		
		emp1.changePayRate(30);
		
		System.out.println(emp1.getPayRate());

	}

}
