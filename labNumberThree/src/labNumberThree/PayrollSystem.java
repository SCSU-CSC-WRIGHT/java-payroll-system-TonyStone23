package labNumberThree;

public class PayrollSystem {

	public static void main(String[] args) {
		//create employees
		Employee employeeOne = new Employee("John Doe", 101, "Engineering", 25.0, 45.0);
		Employee employeeTwo = new Employee("Jane Smith", 102, "Marketing", 30.0, 40.0);
		Employee employeeThree = new Employee("John Doe", 103, "HR", 20.0, 50.0);
		//print employees
		System.out.print(employeeOne + "\n" + employeeTwo + "\n" + employeeThree);
	}
}



/*
	//expected output:
Employee{name='John Doe', employeeId=101, department='Engineering', hourlyWage=25.0, hoursWorked=45.0, weeklySalary=1187.5}
Employee{name='Jane Smith', employeeId=102, department='Marketing', hourlyWage=30.0, hoursWorked=40.0, weeklySalary=1200.0}
Employee{name='Bob Johnson', employeeId=103, department='HR', hourlyWage=20.0, hoursWorked=50.0, weeklySalary=1100.0}
*/