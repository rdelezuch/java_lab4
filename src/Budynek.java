public interface Budynek {

    void setBudynek(String budynek);

    String getBudynek();

    double powierzchnia(double pow);
    String adresBudynku(String adres);
    int liczbaOkien(int lOkien);
    void liczbaMieszkancow(int lMieszkancow);
    void kolorDomu(KolorEnum kolor);

    double powNaJednaOs(double pow, int lMieszkancow);
}
