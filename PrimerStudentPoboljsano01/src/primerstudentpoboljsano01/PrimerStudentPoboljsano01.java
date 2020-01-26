
package primerstudentpoboljsano01;


public class PrimerStudentPoboljsano01 {

   
    public static void main(String[] args) {
      Student s1 = new Student("M", "Matematic", "mm16001", 10.0);
		Student s2 = new Student("N", "Numerovic", "mn14314", 9.5);
		Student s3 = new Student("V", "Verovatnic", "mv15314", 8.5);
		Student s4 = new Student("N", "Nastavnic", "ml14114", 9.5);
		Student s5 = new Student("R", "Racunalo", "mr17314", 9.7);
		Student s6 = new Student("I", "Informatikovic", "mi15114", 9.7);
		Student s7 = new Student("A", "Afikic", "af14001", 8.5);
		Student s8 = new Student("A", "Ainformatikovic", "ai14014", 8.5);
		
		Student[] studenti = {s1, s2, s3, s4, s5, s6, s7, s8};
		for (Student student : studenti)
			System.out.println(student); 		// Java sama poziva toString
		
		Student x = new Student("Testiranje", "Validacije", "ai14123", 8.5);
		System.out.println(x);
		x.setIndeks("mr15023");
		x.setIndeks("mp15023");
		x.setIndeks("mr163a3");
		System.out.println(x);
    }
    
}
