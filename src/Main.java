import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.function.Predicate;

/**

 Opis: Klasa główna programu

 @author : Jakub Jańczuk

**/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int uczen_i = i;
            uczen_i++;
            System.out.printf("Podaj imie %d ucznia: ", uczen_i);
            String imie = scanner.next();
            System.out.printf("Podaj nazwisko %d ucznia: ", uczen_i);
            String nazwisko = scanner.next();
            listaUczniow.dodaj(imie, nazwisko);
        }
        listaUczniow.losuj(5);
        listaUczniow.losuj(1);
        listaUczniow.losuj(3);
        ArrayList<Uczen> uczniowie = new ArrayList<>();
        uczniowie.add(new Uczen("Arek", "Azbestowski"));
        uczniowie.add(new Uczen("Cyprian", "Cypowksi"));
        uczniowie.add(new Uczen("Damian", "Dymkowski"));
        /* o Napisz wyrażenie lambda, które przyjmie obiekt klasy Uczeń a następnie zwróci true jeśli ilość liter w jego nazwisku jest parzysta */
        Predicate<Uczen> uczenPredicate = (Uczen u) -> u.getNazwisko().length()%2==0;
        System.out.println(uczenPredicate.test(new Uczen("Arek", "Arek")));
        System.out.println(uczenPredicate.test(new Uczen("Arek", "Arek1")));
    }
}