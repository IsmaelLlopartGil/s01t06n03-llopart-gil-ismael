package edu.n6.exercise_1;

public class SmartPhone implements Phone, Camera {

	public SmartPhone() {
		
	}

	@Override
	public void call(String phoneNumber) {
		System.out.println("Trucant al número " + phoneNumber);
	}

	@Override
	public void toPhotograph() {
		System.out.println("S'està fent una foto.");
	}

}
