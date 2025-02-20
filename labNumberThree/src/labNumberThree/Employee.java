package labNumberThree;

public class Employee {
	//class variables
	private String name;
	private int employeeID;
	private String department;
	private double hourlyWage;
	private double hoursWorked;
	private double weeklySalary;
	
	//constructor method
	public Employee(String name, int employeeID, String department, double hourlyWage, double hoursWorked) {
		this.name = name;
		this.employeeID = employeeID;
		this.department = department;
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}
	//getters
	public String getName() {
		return name;
	}
	public int getID() {
		return employeeID;
	}
	public String department() {
		return department;
	}
	public double hourlyWage() {
		return hourlyWage;
	}
	public double hoursWorked() {
		return hoursWorked;
	}
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setName(int employeeID) {
		this.employeeID = employeeID;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}
	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public double calculateWeeklySalary() {
	
		if(hoursWorked < 40.0){
			weeklySalary = hourlyWage * hoursWorked;
		} else {
			weeklySalary = (40.0 * hourlyWage) + ((hoursWorked - 40.0)*(hourlyWage * 1.5));
		}
		return weeklySalary;
	}
	@Override
	public String toString() {
		return "Employee{name='"+name+"', employeeID='"+employeeID+"', department='"+department+"', hourlyWage='"
				+hourlyWage+"', hoursWorked='"+hoursWorked+"', weeklySalary='"+calculateWeeklySalary()+"}";
	}
}
