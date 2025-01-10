package org.javaturk.oofp.training.ch01HomeWork;


public class UnderGraduateStudent extends Student{
	
	protected String minor;
	public UnderGraduateStudent (int no, String name, int year, String dob, String major,String minor) {
		super(no, name, year, dob, major);
		this.minor=minor;
		}
	@Override
	public void study () {
		System.out.println("Under Graduate Students are studying not much");
	}
	
	@Override
	public void register() {
		System.out.println("UGS registered");
	}
	
	@Override
	public String toString() {
		return " UGS [no=" + no + ",name=" + name + ", year=" + year + " dob=" + dob + ", major=" + major + "minor " + minor +"] " ;

	}
}
