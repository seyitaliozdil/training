package org.javaturk.oofp.training.ch01HomeWork;


public class GraduateStudent extends Student{
	
	protected String advisor;
	protected String thesis;
	
	public GraduateStudent (int no, String name, int year, String dob, String major,String advisor,String thesis) {
		super(no, name, year, dob, major);
		this.advisor=advisor;
		this.thesis=thesis;
	}
	
	@Override
	public void study () {
		System.out.println("Graduate Students always work");
	}
	@Override
	public void register() {
		System.out.println("Graduate Student can be register if have a thesis");
	}
	
	public void writeThesis() {
		System.out.println("Graduate Student is writing thesis of " + thesis);
	}
	public void meetWithAdvisor() {
		System.out.println("Graduate Student " + name + " going to meet Advisor " + advisor);
	}

}
