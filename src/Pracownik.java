public class Pracownik implements PracownikI{
    private String imie, nazwisko, stanowisko;
    private int wynagrodzenie;
    private boolean l4;

    public Pracownik() {
    }

    public Pracownik(String imie, String nazwisko, String stanowisko, int wynagrodzenie, boolean l4) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stanowisko = stanowisko;
        this.wynagrodzenie = wynagrodzenie;
        this.l4 = l4;
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
    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Override
    public void setWynagordzenie(int wynagordzenie) {
        this.wynagrodzenie = wynagordzenie;
    }

    @Override
    public void setL4(boolean l4) {
        this.l4 = l4;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public int getWynagrodzenie() {
        return wynagrodzenie;
    }

    public boolean isL4() {
        return l4;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko +
                "\nStanowisko: " + stanowisko +
                "\nWynagrodzenie: " + wynagrodzenie +
                "\nCzy ma l4: " + (l4 ? "Tak" : "Nie");
    }
}
