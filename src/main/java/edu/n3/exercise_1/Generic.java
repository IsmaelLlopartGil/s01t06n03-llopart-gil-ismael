package edu.n3.exercise_1;

public class Generic {

	public void call(Phone phone) {
		phone.call("987654321");
	//	phone.toPhotograph();   
	//	SmartPhone smartphone=(SmartPhone)phone;
	//	smartphone.toPhotograph();   
		System.out.println("El mètode call no pot invocar al mètode to Photograph tret que es castegi.");
	}
	
	public void toPhotograph(SmartPhone smartphone) {
		smartphone.toPhotograph();
	}
}
