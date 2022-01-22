import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* zad.1
        a) stworzyć tablicę 6-cio elementową, uzupełnić przykładowymi wartościami (dowolny typ tablicy),
        b) wprowadzić z klawiatury numer indexu tablicy który chcemy wyświetlić, użyć metody next() --> scan.next();
        c) zabezpieczyć kod przed wprowadzeniem:
           - za dużej liczby (index > tab.length),
           - wprowadzeniem innego znaku niż liczba,
        d) użyć metody finally aby wyświetlić komunikat zakończenia programu
        e) wprowadzanie indeksu niech będzie zapętlone do momentu wprowadzenia poprawnego indeksu

           PODPOWIEDZI:
           scan.next() - można wprowadzać dowolny znak z klawiatury,
           index = Integer.parseInt(scan.next()); - parsowanie zmiennej do typu int (liczbowego calkowitego)

           warto stworzyć flagę np. isIndexCorrect = false, i niech pętla sie wykonuje, dopuki flaga jest false,
           boolean isIndexCorrect
           white(!isIndexCorrect) {}
        */

        System.out.println("\nZadanie 1");

        boolean isIndexCorrect = false;
        int tab[] = {1,2,3,4,5,6};
        Scanner scan = new Scanner(System.in);
        int index = -1;

        System.out.print("Podaj indeks tablicy [0 - 5], który ma zostać wyświetlony");

        try
        {
            while (!isIndexCorrect) {
                try {
                    System.out.print("\nWybieram: ");
                    index = Integer.parseInt(scan.next());
                } catch (NumberFormatException e) {
                    System.out.println("Wprowadzony znak nie jest cyfrą, spróbuj ponownie");
                    continue;
                }

                try {
                    System.out.println("Element chowający się pod indeksem nr" + index + ": " + tab[index]);
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Wprowadzony indeks jest poza przedziałem. Spróbuj między 0 a " + (tab.length - 1));
                    continue;
                }

                isIndexCorrect = true;
            }
        }
        finally
        {
            System.out.println("Koniec programu");
        }




        /* zad.2
        a) stworzyć dowolny przykład z NullPonterException,
        b) stworzyć dowolny przykład z ArithmeticException ,
        c) stworzyć dowolny przykład z 2 lub 3 blokami catch i z blokiem finally,
         */

        System.out.println("\nZadanie 2");
        System.out.println("\na)");

        try
        {
            String x = null;
            x.toString();
        }
        catch (NullPointerException e)
        {
            System.out.println("Nie można wywołać metody toString jeżeli zmienna jest = null");
        }

        System.out.println("\nb)");

        try
        {
            int y = 1/0;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Błąd działania arytmetycznego");
        }

        System.out.println("\nc)\n");

        int x = 0, y;
        Scanner scan1 = new Scanner(System.in);

        try
        {
            System.out.print("Wpisz liczbę przez którą chcesz podzielić: ");
            x = Integer.parseInt(scan1.next());
            y = 1 / x;
        }
        catch (NumberFormatException e)
        {
            System.out.println("Ten błąd wyskakuje, ponieważ miała zostać wpisana liczba całkowita");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Ten błąd wyskakuje, ponieważ nie można dzielić przez 0");
        }
        finally
        {
            System.out.println("A to się zawsze wykonuje");
        }
    }
}
