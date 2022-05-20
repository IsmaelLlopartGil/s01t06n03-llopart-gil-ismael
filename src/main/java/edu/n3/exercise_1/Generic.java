package edu.n3.exercise_1;

public class Generic {

	public <T extends Phone> void call(T phone) {
		phone.call("987654321");
	//	phone.toPhotograph();
		System.out.println("El objecte no pot invocar al mètode toPhotograph. Error de compilació: \"The method toPhotograph() is undefined for the type T\"");
	}
	
	public <T extends SmartPhone> void toPhotograph(T smartphone) {
		smartphone.toPhotograph();
	}
}
