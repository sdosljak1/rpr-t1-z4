package ba.unsa.etf.rpr.tut1;

import java.util.Scanner;

public class Student {
    private String ime;
    private String prezime;
    private int indeks;
    public Stuent(String ime, String prezime, int indeks) {
        this.ime = ime;
        this.prezime = prezime;
        this.indeks = indeks;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        return prezime + ' ' + ime + ' (' + indeks + ')';
    }
}

public class Predmet {
    private Student[];
    private String naziv;
    private String sifra;
    private int maksBrStudenata;
    public void upisi (Student s) {
        for(int i = 0; i < maksBrStudenata; i++) {
            if(s.Student[i])
        }
    }
    public  void ispisi (Student s) {
        for(int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public int getMaksBrStudenata() {
        return maksBrStudenata;
    }

    public void setMaksBrStudenata(int maksBrStudenata) {
        this.maksBrStudenata = maksBrStudenata;
    }
}

public class Program {
    public void main {

    }
}



public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
