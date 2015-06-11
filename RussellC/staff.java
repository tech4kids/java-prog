/**
 * Employee class(implement Employed interface) and 3 child classes. 
 * The Staff class prints the staff list and calculate total salary. 
 * @author Russell
 */
package company;

public interface Employed {
	double getSalary(); 
}

public abstract class Employee implements Employed {
	//3 contract types
	String[] contracts = new String[3]; {
		contracts[0] = "temporary";
		contracts[1] = "training";
		contracts[2] = "infinite";
	}
	
	private String name;
	private int contract;
	private int years;
	private String department;

	public Employee(String name, int contract, int years, String department) {
		this.name = name;
		this.contract = contract;
		this.years = years;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public int getContract() {
		return contract;
	}
	public int getYears() {
		return years;
	}
	public String getDepartment() {
		return department;
	}
	public abstract double getSalary();
	
	public String toString() {
		return getName() + ": " + department + " department, " + contracts[getContract()] + " contract, " + years + " years in company, salary of " + getSalary() + " bitcoins"; 
	}
}

public class ManagementEmployee extends Employee{
	public ManagementEmployee(String name, int years) {
		super(name, 2, years, "Management");
		name = getName();
		years = getYears();
	} 
	public double getSalary() {
	    double salary = 6000*getYears() + 40000;
		return salary;
	}
}

public class EngineeringEmployee extends Employee{
	public EngineeringEmployee(String name, int contract, int years) {
		super(name, contract, years, "Engineering");
		name = getName();
		contract = getContract();
		years = getYears();
	}
	public double getSalary() {
		double salary = 2500*getYears() + 25000;
		return salary;
	}
}

public class AdministrationEmployee extends Employee{
	public AdministrationEmployee(String name) {
		super(name, 0, 0, "Administration");
		name = getName();
	}
	public double getSalary() {
		double salary = 18000;
		return salary;
	}
}

public abstract class Staff implements Employed {
	public static void main(String[] args) {
		Employee[] employeeArray = new Employee[6];
		
		employeeArray[0]= new ManagementEmployee ("Bill", 9);
		employeeArray[1]= new EngineeringEmployee ("Anna", 2, 9);
		employeeArray[2]= new EngineeringEmployee ("John", 2, 5);
		employeeArray[3]= new EngineeringEmployee ("Elizabeth", 1, 3);
		employeeArray[4]= new EngineeringEmployee ("Micheal", 1, 2);
		employeeArray[5]= new AdministrationEmployee ("Albert");
		
		for (int i=0; i<employeeArray.length; i++) {
	        System.out.println(employeeArray[i].toString());
		}
		
		double managementSalary = employeeArray[0].getSalary();
		double engineeringSalary = 0;
		for (int i=1; i<5; i++) {
			engineeringSalary += employeeArray[i].getSalary();
		}
		double totalSalary = 0;
		for (int i=0; i<6; i++){
			totalSalary += employeeArray[i].getSalary();
		}
		double administrationSalary = employeeArray[5].getSalary();
		System.out.println("Management salary: " + managementSalary );
		System.out.println("Engineering salary: " + engineeringSalary);
		System.out.println("Administration salary: " + administrationSalary);
		System.out.println("Total salary: " + totalSalary);
	}	
}
		
	