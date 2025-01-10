package org.javaturk.oofp.training.ch01HomeWork;


public class MasterStudent extends GraduateStudent {
	
	public MasterStudent (int no, String name, int year, String dob, String major,String advisor,String thesis) {
		super(no, name, year, dob, major, advisor, thesis);
	}
	
	@Override
	public void study () {
		System.out.println("Master Students working");
	}
	
	@Override
	public void register() {
		System.out.println("Master Student registered");
	}
	
	@Override
	public void writeThesis() {
		System.out.println("Master Student is writing thesis of " + thesis);
	}
	
	@Override
	public void meetWithAdvisor() {
		System.out.println("Master Student " + name + " going to meet Advisor " + advisor);
	}
	
}
