package com.marlabs.day1.constructors;

public class ThisDemo {

	public static void main(String[] args) {
		System.out.println("In Main Method");

		MarlabsTraineeAssociate traineeAssociate = new MarlabsTraineeAssociate(10, "Sanjay", "Java", "NJ", "NY", "NY");
		System.out.println(traineeAssociate.toString());

		MarlabsTraineeAssociate traineeAssociate2 = new MarlabsTraineeAssociate(7, "Deepti", "Java", "NJ");
		System.out.println(traineeAssociate2);

		traineeAssociate2.display();
		System.out.println("End of Main Method");
	}

}
