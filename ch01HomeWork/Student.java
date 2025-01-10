package org.javaturk.oofp.training.ch01HomeWork;


public class Student {

	protected int no;
	protected String name;
	protected int year;
	protected String dob;
	protected String major;
	
	public Student (int no, String name, int year, String dob, String major) {
		this.no=no;
		this.name=name;
		this.year=year;
		this.dob=dob;
		this.major=major;
	}
	
	public void study() {
		System.out.println("Student working");
	}
	
	public void register() {
		System.out.println("Student registered");
	}
	@Override
	public String toString() {
		return " Student [no=" + no + ",name=" + name + ", year=" + year + " dob=" + dob + ", major=" + major + "] " ;
		
	}
	
}
