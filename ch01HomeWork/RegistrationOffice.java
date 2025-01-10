package org.javaturk.oofp.training.ch01HomeWork;

public class RegistrationOffice {
	
	public Student getAStudent () {
		Student student = null;
		
		int i = (int) (5 * Math.random());
		
		switch (i) {
			
		case 0:
			student = new VocationalStudent(111, "Suleyman Cakir", 34, "24/05/1882", "Civil");
			break;
		case 1:
			student = new GraduateStudent(222, "Abdulhey Coban", 27, "01/01/1886", "Electrical", "Polat Alemdar", "Derin Devlet");
			break;
		case 2:
			student = new UnderGraduateStudent(333, "Gullu Erhan", 24, "02.02.1994", "Guzel Sanatlar", "Oyunculuk");
			break;
		case 3:
			student = new MasterStudent(444, "Memati Bas", 38, "03.03.1880", "Makina", "Iskender", "Aksaclilar");
			break;
		case 4:
			student = new PhdStudent(555, "Deli Hikmet", 42, "05.05", "Tv Tamiri", "Polatin Babasi", "Bozulmayan Tv",true);
			break;
		}
		return student;
	}
	
	public void registerStudent(Student student) {
		
		
	}
	
	
}
