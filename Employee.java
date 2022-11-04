package Classwork;

public class Employee {

	private String firstName;
	private String lastName;
	private String position;
	private double salary;
	private double hourWorked;
	
	public Employee(){
		this.firstName="";
		this.lastName="";
		this.position="";
		this.salary=12.50;
		this.hourWorked=0.0;
	}
	
	public Employee(String firstName, String lastName, String position, double salary, double hourWorked) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.position=position;
		this.salary=salary;
		this.hourWorked=hourWorked;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPos() {
		return position;
	}
	public double  getSalary() {
		return salary;
	}
	public double getHours() {
		return hourWorked;
	}
	
	public void setFirstname() {
		this.firstName=firstName;
	}
	public void setLastname() {
		this.lastName=lastName;
	}
	public void setPos() {
		this.position=position;
	}
	public void setSal() {
		this.salary=salary;
	}
	public void setHours() {
		this.hourWorked=hourWorked;
	}
	
	public double showCurrentPay() {
		double pay=0.0;
		if(hourWorked<=40) {
			pay=hourWorked*salary;
		}
		else {
			double overtime = hourWorked-40.0;
			pay=(40*salary)+(overtime*salary*1.5);
		}
		return pay;
	}
	public String displayPayCheck() {
		StringBuilder sb= new StringBuilder();
		sb.append("=====" +firstName.toUpperCase()+" " +lastName.toUpperCase()+"=====\n");
		sb.append("Hours Worked : " + hourWorked +"\n");
		sb.append("Position :" + position + "\n");
		sb.append("Salary :" + salary +"\n");
		sb.append("Total Pay: " +this.showCurrentPay()+"\n");
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		Employee firstemp = new Employee("Tyler", "Lericos", "Teammember", 12.50, 23);
		System.out.println(firstemp.displayPayCheck());
		
		Employee secemp = new Employee("Gary", "theSnail", "Manager", 7.98, 12);
		System.out.println(secemp.displayPayCheck());

	}

}
