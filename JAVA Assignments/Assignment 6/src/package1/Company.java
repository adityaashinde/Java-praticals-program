package package1;

class Employee {
	int empId;
	String name;
	Employee(int empId , String name){
		this.empId = empId;
		this.name = name;
	}
}

class Manager extends Employee {
	int salary;
	Manager(int empId, String name, int salary) {
		super(empId,name);
		this.salary = salary;
	}
}

class SalesManager extends Manager {
	int commission;
	SalesManager(int empId, String name, int salary, int commission) {
		super(empId,name,salary);
		this.commission = commission;
	}
}

public class Company {
	public static void main(String[] args) {
		SalesManager sm = new SalesManager(101, "aditya", 32466, 12344);
		System.out.println(sm.empId);
		System.out.println(sm.name);
		System.out.println(sm.salary);
		System.out.println(sm.commission);
	}
}
