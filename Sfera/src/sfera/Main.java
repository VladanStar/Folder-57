package sfera;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // poziv podrazumevanog konstruktora
        Sfera jedinicna = new Sfera();
        System.out.println("jedinicna: " + jedinicna.toString());
        // poziv instancnog metoda zapremina() klase Sfera kada smo izvan tela te klase!!!
        // instancni metod se uvek poziva za konkretan objekat klase (ovde: "jedinicna")
        System.out.format("zapremina jedinicne sfere: %.2f\n", jedinicna.zapremina());

        Scanner sc = new Scanner(System.in);
        System.out.println("unesite koordinate centra sfere (realni brojevi):");
        System.out.print("x = ");
        double x = sc.nextDouble();
        System.out.print("y = ");
        double y = sc.nextDouble();
        System.out.print("z = ");
        double z = sc.nextDouble();
        System.out.println("unesite radijus sfere (pozitivan realan broj):");
        System.out.print("r = ");
        double r = sc.nextDouble();

        // poziv konstruktora sa cetiri argumenta tipa double
        Sfera globus = new Sfera(x, y, z, r);
        System.out.println("globus: " + globus);
        System.out.printf("zapremina globusa: %.2f\n", globus.zapremina());

        System.out.println("promena radijusa jedinicne sfere:");
        double novi_radius = sc.nextDouble();
        jedinicna.setRadius(novi_radius);
        System.out.println("jedinicna: " + jedinicna.toString());
        System.out.format("zapremina jedinicne sfere: %.2f\n", jedinicna.zapremina());

        System.out.println("istoGlobus = globus");
        Sfera istoGlobus = globus;
        System.out.println("\tza istoGlobus nema poziva konstruktora!\n"
                + "\t=> kada nema poziva konstruktora, ne pravi se novi objekat!");
        // Dobili smo jos jednu referencu (istoGlobus) na postojeci objekat u memoriji
        // na koji smo imali referencu u promenljivoj globus
        System.out.println("istoGlobus: " + istoGlobus);
        System.out.println("promena radijusa za istoGlobus:");
        novi_radius = sc.nextDouble();
        istoGlobus.setRadius(novi_radius);
        System.out.println("globus: " + globus);
        System.out.println("istoGlobus: " + istoGlobus);

        // nova vrednost radijusa je negativna, pa se promena nece izvrsiti
        System.out.println("\npromena radijusa za istoGlobus na -5:");
        istoGlobus.setRadius(-5);
        System.out.println("istoGlobus: " + istoGlobus);
    }

}
