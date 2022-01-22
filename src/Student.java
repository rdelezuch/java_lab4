public class Student  implements StudentI{
    private String imie, nazwisko;
    private int nrIndeksu;
    private KierunekEnum kierunek;
    private boolean aktywnosc = false;

    public Student() {
    }

    public Student(String imie, String nazwisko, int nrIndeksu, KierunekEnum kierunek, boolean aktywnosc) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.nrIndeksu = nrIndeksu;
        this.kierunek = kierunek;
        this.aktywnosc = aktywnosc;
    }

    @Override
    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    @Override
    public void setKierunek(KierunekEnum kierunek) {
        this.kierunek = kierunek;
    }

    @Override
    public void setNrIndeksu(int nrIndeksu) {
        this.nrIndeksu = nrIndeksu;
    }

    @Override
    public void setAktywnosc(boolean aktywnosc) {
        this.aktywnosc = aktywnosc;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getNrIndeksu() {
        return nrIndeksu;
    }

    public KierunekEnum getKierunek() {
        return kierunek;
    }

    public  boolean isAktywnosc() {
        return aktywnosc;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko +
                "\nNr indeksu: " + nrIndeksu +
                "\nKierunek: " + kierunek +
                "\nCzy uczęszcza: " + (aktywnosc ? "Tak" : "Nie");
    }
}
