public class Dom implements Budynek{

    private double pow, cena;
    private String adres, budynek;
    private int lOkien, lMieszkancow;
    private KolorEnum kolor;

    @Override
    public String getBudynek() {
        return budynek;
    }

    @Override
    public void setBudynek(String budynek) {
        this.budynek = budynek;
    }

    @Override
    public double powierzchnia(double pow) {
        this.pow = pow;
        return pow;
    }

    @Override
    public String adresBudynku(String adres) {
        this.adres = adres;
        return adres;
    }

    @Override
    public int liczbaOkien(int lOkien) {
        this.lOkien = lOkien;
        return lOkien;
    }

    @Override
    public void liczbaMieszkancow(int lMieszkancow) {
        this.lMieszkancow = lMieszkancow;
    }

    @Override
    public void kolorDomu(KolorEnum kolor) {
        this.kolor = kolor;
    }

    @Override
    public double powNaJednaOs(double pow, int lMieszkancow)
    {
        return pow/lMieszkancow;
    }

    public void cenaMieszkania(double cena) {
        this.cena = cena;
    }

    public double cenaZam2(double pow, double cena)
    {
        return cena/pow;
    }

    @Override
    public String toString() {
        return budynek +
                "\nAdres: " + adres +
                "\nPowierzchnia: " + pow + "m2" +
                "\nKolor: " + kolor +
                "\nLiczba okien: " + lOkien +
                "\nLiczba mieszkańców: " + lMieszkancow +
                "\nPowierzchnia na jedną osobę: " + powNaJednaOs(pow, lMieszkancow) +
                "\nCena za m2: " + cenaZam2(pow, cena) + " PLN";
    }
}
