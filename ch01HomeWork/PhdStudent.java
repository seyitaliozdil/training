package org.javaturk.oofp.training.ch01HomeWork;


public class PhdStudent extends GraduateStudent{
	protected boolean qualifyingExamTaken;
	
	public PhdStudent (int no, String name, int year, String dob, String major,String advisor,String thesis, boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor, thesis);
		this.qualifyingExamTaken=qualifyingExamTaken;
	}
	
	@Override
	public void study () {
		System.out.println("Phd Students always a lot work");
	}
	@Override
	public void register() {
		System.out.println("Phd Student can be register if have a thesis");
	}
	@Override
	public void writeThesis() {
		System.out.println("Phd Student is wrote thesis of " + thesis);
	}
	@Override
	public void meetWithAdvisor() {
		System.out.println("Phd Student " + name + " going to meet Advisor " + advisor);
	}
	
	public void WritePaper() {
		System.out.println("Phd Student writing paper");
	}
	
	
}
