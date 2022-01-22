public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć klasę abstrakcyjną Figura
        b) stworzyć metody abstrakcyjne pole() i obwod()
        c) stworzyć zwykłą metodę nazwaFigury(String figura), która będzie zwracała tekst 'To jest figura: .....',
        */

        /* zad.2
        a) stworzyć klasę kwadrat i prostokat które będą dziedziczyć po klasie Figura
        b) zaimplementować metody abstrakcyjne odpowiednimi wzorami,
        c) stworzyć objekty tych klas i wyświetlić przykładowe wyliczenia
        */

        Kwadrat k = new Kwadrat();
        System.out.println("Pole kwadratu o boku 2 = " + k.getPole(2,2) + "cm2");
        System.out.println("Obwód kwadratu o boku 2 = " + k.getObwod(2,2) + "cm2");

        System.out.println("\n");

        Prostokat p = new Prostokat();
        System.out.println("Pole prostokąta o bokach 2 i 4 = " + p.getPole(2,4) + "cm2");
        System.out.println("Obwód prostokąta o bokach 2 i 4 = " + p.getObwod(2,4) + "cm2");
    }
}
