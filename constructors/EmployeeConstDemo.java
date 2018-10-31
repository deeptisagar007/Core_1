package com.marlabs.day1.constructors;

public class EmployeeConstDemo {

	public static void main(String[] args) {
		System.out.println("I am from main Method");
		Employee employee = new Employee();
		System.out.println(employee);
		employee.displayEmployeeDetails();

		Employee employee2 = new Employee();
		System.out.println(employee2);
		employee2.displayEmployeeDetails();

		Employee employee3 = new Employee(2018, "Sanjay", "Contract", 3500, 500, 9, "Pass");
		System.out.println(employee3);
		employee3.displayEmployeeDetails();

		Employee employee4 = new Employee(2018, "Deepti", "Contract", 3500, 600, 7, "Passs");
		System.out.println(employee4);
		employee4.displayEmployeeDetails();

		Employee employee5 = new Employee(employee4);
		System.out.println(employee5);
		employee5.displayEmployeeDetails();

		if (employee4 == employee5) {
			System.out.println("Same memory Locations");
		} else {
			System.out.println("Different Memory locations");
		}

		System.out.println("Ed of Main Method");
	}

}
