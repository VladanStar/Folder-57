package primerstudenti0101;

public class Student {

    private String ime;
    private String prezime;
    private String indeks;

    private double prosek;

    public Student() {
    }

    public Student(String ime, String prezime, String indeks, double prosek) {
        this.ime = ime;
        this.prezime = prezime;
        this.indeks = indeks;
        this.prosek = prosek;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getIndeks() {
        return indeks;
    }

    public double getProsek() {
        return prosek;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public void setIndeks(String indeks) {
        this.indeks = indeks;
    }

    public void setProsek(double prosek) {
        this.prosek = prosek;
    }

    public int setGodinaUpisa() {
        // Staticki metod 'parseInt' klase 'Integer' moze da iz
        // objekta klase 'String' izdvoji vrednost tipa 'int'
        return Integer.parseInt("20" + indeks.charAt(2) + indeks.charAt(3));
    }

    public int getBrojIndeksa() {
        return Integer.parseInt("" + indeks.substring(4, 6));
    }

    public String getSmer() {
        char studije = indeks.charAt(0);
        char smer = indeks.charAt(1);
        if (studije == 'm') {
            switch (smer) {
                case 'm':
                    return "Teorijska fizika i matematika";
                case 'n':
                    return "Primenjena matematika";
                case 'v':
                    return "Statistika i matematika";
                case 'l':
                    return "Profesor matematike i geometrije";
                case 'r':
                    return "Racunarstvo i informatika";
                case 'a':
                    return "Astronomije";
                case 'i':
                    return "Informatika";
                default:
                    return "Broj indeksa nije unet adekvatno";

            }

        } else if (studije == 'a' && smer == 'f') {
            return "Astrofizika";
        } else if (studije == 'a' && smer == 'i') {
            return "Astroinformatika";
        } else {
            return "Ne postoje informacije u registru.";
        }
    }

    @Override
    public String toString() {
        return "Student{" + "ime=" + ime + ", prezime=" + prezime + ", indeks=" + indeks + ", prosek=" + prosek + '}';
    }

}
