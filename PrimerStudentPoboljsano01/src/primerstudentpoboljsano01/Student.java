package primerstudentpoboljsano01;

public class Student {

    private String ime, prezime, indeks;
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

    public int godinaUpisa() {
        return Integer.parseInt("20" + indeks.charAt(2) + indeks.charAt(3));

    }

    public int brojIndeksa() {
        return Integer.parseInt(indeks.substring(4, 6));
    }

    public void setIndeks(String indeks) {
        if (validirajIndeks(indeks)) {
            this.indeks = indeks;

        } else {
            System.out.println("Neuspela validacija indeksa");
        }

    }

    private boolean validirajIndeks(String indeks) {
        indeks = indeks.toLowerCase();

        char studije = indeks.charAt(0);
        if (studije != 'm' && studije != 'a') {
            return false;
        }
        String dopustiviSmerovi = "mnvlrai";
        char smer = indeks.charAt(1);
        if (studije == 'm' && !dopustiviSmerovi.contains("" + smer)) {
            return false;
        }
        dopustiviSmerovi = "fi";
        if (studije == 'a' && !dopustiviSmerovi.contains("" + smer)) {
            return false;
        }

        // proveravamo ostatak indeksa (zahtevamo da su cifre)
        for (int i = 2; i < indeks.length(); i++) {
            if (!Character.isDigit(indeks.charAt(i))) {
                return false;
            }
        }

        // Inace, prosledjeni indeks je korektan
        return true;
    }

    @Override
    public String toString() {
        return "Student{" + "ime=" + ime + ", prezime=" + prezime + ", indeks=" + indeks + ", prosek=" + prosek + '}';
    }
    

}
