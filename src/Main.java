public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) Stwożyć interfejs Budynek,
        b) interfejs powinien mieć metody:
            - double powierzchnia(double pow);
            - String adresBudynku(String adres);
            - int liczbaOkien(int value);
            - void liczbaMieszkancow(int value);
            - void kolorDomu(KolorEnum kolor);
        c) stworzyć enum KolorEnum z przykładowymi kolorami,
        d) stworzyć jedną metodę z 2 parametrami wymyśloną przez siebie,
        */

        /* zad.2
        a) napisać klasę Dom implementującą interfejs Budynek,
        b) zaimplementować wszystkie metody,
        c) stworzyć brakujące pola(prywatne), gettery i settery, napisać metodę toString
        (gettery i settery najlepiej wygenerować: Code/Prawy myszy --> Generate --> getters/setters/toString)
        d) stworzyć jedną dowolną metodę przez siebie
        */

        /* zad.3
        a) w klasie Main stworzyć 2 objekty typu Dom deklarując pierwszy objekt Typem Dom,
        drugi objekt typem Budynek,
        b) wykorzystać wszystkie metody do implementacji pól
        c) wyświetlić w konsoli metodę toString (na obu objektach) opisującą zachowanie klasy Dom
        */

        Dom dom = new Dom();
        dom.setBudynek("Domek jednorodzinny");
        dom.adresBudynku("Kolorowa 25");
        dom.kolorDomu(KolorEnum.Czerwony);
        dom.liczbaMieszkancow(5);
        dom.liczbaOkien(8);
        dom.powierzchnia(72.5);
        dom.cenaMieszkania(432.530);

        Budynek dom2 = new Dom();
        dom2.setBudynek("Domek bliźniak");
        dom2.adresBudynku("Srebrna 2");
        dom2.kolorDomu(KolorEnum.Szary);
        dom2.liczbaMieszkancow(2);
        dom2.liczbaOkien(7);
        dom2.powierzchnia(54.2);
        //dom2.cenaMieszkania(432.530); metody nie ma w interfejsie

        System.out.println(dom.toString() + "\n");
        System.out.println(dom2.toString());
    }
}
