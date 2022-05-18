package edu.n3.exercise_1;

public class App {

	public static void main(String[] args) {
		
		SmartPhone smartPhone=new SmartPhone();
		Generic generic=new Generic();
		generic.call(smartPhone);
		generic.toPhotograph(smartPhone);
	}
}
