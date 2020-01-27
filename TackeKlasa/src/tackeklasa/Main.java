
package tackeklasa;


public class Main {

    public static void main(String[] args) {
		// t1: koordinatni pocetak
		Tacka t1 = new Tacka();
		// t2: tacka (2,2)
		Tacka t2 = new Tacka(2, 2);

		System.out.println("t1: " + t1); // t1 se "sabira" sa stringom => implicitno se poziva t1.toString()
		System.out.println("t2: " + t2); // t2 se "sabira" sa stringom => implicitno se poziva t2.toString()

		// tacka t1 se translira za dati pomeraj
		System.out.print(t1 + " -> ");
		t1.pomeranjeTacke(2, 2);
		System.out.println(t1);
		// porede se tacke t1 i t2
		if (t1.equals(t2))
			System.out.println("t1 == t2");
		else
			System.out.println("t1 != t2");

		// tacka t1 se opet translira za dati pomeraj
		System.out.print(t1 + " -> ");
		t1.pomeranjeTacke(-2, -2);
		System.out.println(t1);
		// racuna se rastojanje izmedju tacaka t1 i t2
		double d = t1.rastojanjeTacaka(t2);
		System.out.println("d(t1, t2) = " + d);
	}
    
}
