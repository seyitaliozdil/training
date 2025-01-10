package org.javaturk.oofp.training.ch01HomeWork;

public class TestRegistration {

	public static void main(String[] args) {
		
		RegistrationOffice newStudent = new RegistrationOffice();
		Student student = newStudent.getAStudent();
		
		
		if (student instanceof PhdStudent) {
			System.out.println("Do you have a Paper student " + student.name + "?");
			PhdStudent newPhdStudent = (PhdStudent) student;
			newPhdStudent.WritePaper();
			
		}
		else if(student instanceof MasterStudent) {
			MasterStudent newMasterStudent = (MasterStudent) student;
			newMasterStudent.writeThesis();
		}
		else if(student instanceof GraduateStudent) {
			GraduateStudent newGraduateStudent = (GraduateStudent) student;
			newGraduateStudent.meetWithAdvisor();
		}
		else if(student instanceof VocationalStudent) {
			VocationalStudent newVocationalStudent = (VocationalStudent) student;
			newVocationalStudent.study();
		}
		else if(student instanceof UnderGraduateStudent) {
			UnderGraduateStudent newUGS = (UnderGraduateStudent) student;
			newUGS.register();
		}
		else {
			System.out.println("Biz seni alamayiz babba");
		}

		
	}

}


