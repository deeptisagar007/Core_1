package com.marlabs.day1.constructors;

public class MarlabsTraineeAssociate {
	int traineeid;
	String traineeName;
	String trainedOn;
	String trainingLocation;
	String preferredLocation;
	String deployedLocation;

	public MarlabsTraineeAssociate() {
		System.out.println("In Defaut const");
		preferredLocation = "NY";
		deployedLocation = "NY";

	}

	/**
	 * @param traineeid
	 * @param traineeName
	 * @param trainedOn
	 * @param trainingLocation
	 */
	public MarlabsTraineeAssociate(int traineeid, String traineeName, String trainedOn, String trainingLocation) {
		this();
		System.out.println("In 4 Params Const");
		this.traineeid = traineeid;
		this.traineeName = traineeName;
		this.trainedOn = trainedOn;
		this.trainingLocation = trainingLocation;
	}

	/**
	 * @param traineeid
	 * @param traineeName
	 * @param trainedOn
	 * @param trainingLocation
	 * @param preferredLocation
	 * @param deployedLocation
	 */
	public MarlabsTraineeAssociate(int traineeid, String traineeName, String trainedOn, String trainingLocation,
			String preferredLocation, String deployedLocation) {
		System.out.println("In Params Const");
		this.traineeid = traineeid;
		this.traineeName = traineeName;
		this.trainedOn = trainedOn;
		this.trainingLocation = trainingLocation;
		this.preferredLocation = preferredLocation;
		this.deployedLocation = deployedLocation;
	}

	@Override
	public String toString() {
		return "MarlabsTraineeAssociate [traineeid=" + traineeid + ", traineeName=" + traineeName + ", trainedOn="
				+ trainedOn + ", trainingLocation=" + trainingLocation + ", preferredLocation=" + preferredLocation
				+ ", deployedLocation=" + deployedLocation + "]";
	}

	public void display() {
		System.out.println("In Display");
		System.out.println(this);
	}

}
