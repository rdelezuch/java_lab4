
public class Main {
    public static void main(String[] args) {

        /* zad.1
        a) napisać interfejs CzlowiekI
        b) zadeklarować 2 metody

        c) napisać interfejs StudentI który dziedziczy po interfejsie CzlowiekI
        d) zadeklarować 3 metody

        e) napisać interfejs PracownikI który dziedziczy po interfejsie CzlowiekI
        f) zadeklarować 3 metody
         */

        /* zad.2
        a) napisać klasę Student która będzie implementować interfejs StudentI
        b) napisać klasę Pracownik która będzie implementować interfejs PracownikI
        c) stworzyć pola, gettery i settery, metodę toString dla obu klas, (constructor z przeciążeniem - jak ktoś chce ),
        (gettery i settery / toString() ..., najlepiej wygenerować: Code/Prawy myszy-->Generate-->getters/setters/toString)
        */

        /* zad.3
        a) stworzyć 2 objekty typu Student i uzupełnić wszystkie pola
        b) stworzyć 2 objekty typu Pracownik i uzupełnić wszystkie pola
        c) wypisać metody toString() wszystkich objektów*/

        Student s1 = new Student();
        s1.setImie("Marek");
        s1.setNazwisko("Balcerzak");
        s1.setNrIndeksu(12345);
        s1.setKierunek(KierunekEnum.Budownictwo);
        s1.setAktywnosc(true);

        Student s2 = new Student("Robert", "Makłowicz", 77234, KierunekEnum.Informatyka, false);

        Pracownik p1 = new Pracownik();
        p1.setImie("Wojtek");
        p1.setNazwisko("Baja");
        p1.setStanowisko("Kierownik");
        p1.setWynagordzenie(12500);
        p1.setL4(false);

        Pracownik p2 = new Pracownik("Miłosz", "Niebywał", "Kopacz", 3500, true);

        System.out.println(s1.toString() + "\n");
        System.out.println(s2.toString() + "\n");
        System.out.println(p1.toString() + "\n");
        System.out.println(p2.toString() + "\n");

        /*zad.4 - Dla chętnych
        a) stworzyć klasę Kierownik która będzie implementować interfejs PracownikI,
        b) zaimplementować wszystkie metody, i stworzyć pola
        c) stworzyć 2 objekty typu Kierownik i uzupełnić wszystkie pola,
        d) stworzyć listę typu PracownikI --> List<PracownikI> listaPracownikow = new ArrayList<>();
        e) dodać do niej objekty typu Kierownik i Pracownik
        f) wypisać pętlą metody toString() wszystkich elementów listy
        */

        /* zad5 - Dla chętnych
        Stworzyć klasę która będzie implementować 2 lub 3 interfejsy następnie będzie
        dziedziczona przez inną klasę
        */
    }
}
