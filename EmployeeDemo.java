package com.marlabs.day1;

public class EmployeeDemo {

	public static void main(String[] args) {
		System.out.println("I am from Main Method");
		Employee employee = new Employee();
		employee.displayEmployeeDetails();
		System.out.println(employee);
		employee.empNumber = 111;
		employee.empName = "AAA";
		employee.empType = "Contract";
		employee.empBasic = 9056.34d;
		employee.empComm = 2345;
		employee.empDeptNumber = 10;
		employee.displayEmployeeDetails();
		System.out.println("End of Main Method");

		Employee employee1 = new Employee();
		System.out.println(employee1);
		employee1.empNumber = 222;
		employee1.empName = "BBB";
		employee1.empType = "Contract";
		employee1.empBasic = 9056.34d;
		employee1.empComm = 2000;
		employee1.empDeptNumber = 20;
		employee1.displayEmployeeDetails();

		Employee employee2 = new Employee();
		employee2.displayEmployeeDetails();
		employee2.doInitialization();
		employee2.displayEmployeeDetails();
		employee2.setEmpPassWord("Admin@123");
		System.out.println(employee2.getEmpPassWord());

		Employee employee3 = new Employee();
		employee3.doInitialization(201, "Deepti", "Permanent", 10000.999, 2500, 9, "Pass");
		employee3.displayEmployeeDetails();
		System.out.println("End of Main Method");
	}

}
