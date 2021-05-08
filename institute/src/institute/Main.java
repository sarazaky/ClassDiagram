package institute;

public class Main {

	public static void main(String[] args) {
		Subject math = new Subject("Math", 100);
		Subject science = new Subject("Science", 150);
		Subject eng = new Subject("English", 50);
		//////
		Student ammar = new Student("Ammar", 1);
		Student yomna = new Student("Yomna", 2);
		
		Subject[] ammarSubjects = {math, science};
		Subject[] yomnaSubjects = {math, science, eng};
		
		ammar.setCourses(ammarSubjects);
		yomna.setCourses(yomnaSubjects);
		////////
		Instructor yara = new Instructor("Yara");
		Instructor anas = new Instructor("Anas");
		
		Subject[] yaraSubjects = {math};
		Subject[] anasSubjects = {science, eng};
		
		yara.setCourses(yaraSubjects);
		anas.setCourses(anasSubjects);
		/////////
		Administrator zaky = new Administrator("Zaky");
		Administrator hoida = new Administrator("Hoida");
		/////////
		Student[] stdList = {ammar, yomna};
		Instructor[] insList = {yara, anas};
		Administrator[] adminList = {zaky, hoida};
		
		EducationalInstitute iti = new EducationalInstitute("ITI", stdList, insList, adminList);
		
		yara.displayInfo();
		anas.displayInfo();
		
		System.out.println("Ammar total grades= " + ammar.getTotalGrade());
		System.out.println("Yomna total grades= " + yomna.getTotalGrade());
		
		

	}

}
