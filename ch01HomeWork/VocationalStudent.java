package org.javaturk.oofp.training.ch01HomeWork;


public class VocationalStudent extends Student{
	
	public VocationalStudent (int no, String name, int year, String dob, String major) {
		super(no, name, year, null, major);
	}
	
	@Override
	public void study() {
		System.out.println("Vocational Student you have to work");
	}
	
	@Override
	public void register() {
		System.out.println("Vocatinal Student registered with honor");
	}
	
	@Override
	public String toString () {
		return " VocationalStudent [no=" + no + ",name=" + name + ", year=" + year + " dob=" + dob + ", major=" + major + "] " ;

	}
}
