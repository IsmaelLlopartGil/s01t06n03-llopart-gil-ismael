package edu.n6.exercise_1;

public class Generic {

	public void call(Phone phone) {
		phone.call("987654321");
	//	phone.toPhotograph();   
	//	SmartPhone smartphone=(SmartPhone)phone;
	//	smartphone.toPhotograph();   
		System.out.println("No pot invocar al mètode to Photograph tret que es castegi, amb els problemes derivats en temps d'execució.");
	}
	
	public void toPhotograph(SmartPhone smartphone) {
		smartphone.toPhotograph();
	}
}
