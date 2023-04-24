import java.util.ArrayList;
import java.util.Random;


/**

 Opis: Klasa zarządzająca listą uczniów
 uczniowie : ArrayList, odpowiada za przechowywanie uczniów

 @author : Jakub Jańczuk

**/
public class listaUczniow {

    private static ArrayList<Uczen> uczniowie = new ArrayList<>();

    public static void dodaj(String imie, String nazwisko){
        Uczen uczen = new Uczen(imie, nazwisko);
        uczniowie.add(uczen);
    }

    public static void wyswietl(){
        uczniowie.forEach(uczen -> {
            System.out.println(uczen.toString());
        });
    }

    public static void usun(String imie, String nazwisko){
        uczniowie.forEach(uczen -> {
            if(uczen.getImie().equalsIgnoreCase(imie) && uczen.getNazwisko().equalsIgnoreCase(nazwisko)){
                uczniowie.remove(uczen);
            }
        });
    }

    public static void losuj(int n){
        ArrayList<Uczen> wylosowani = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            int rng = random.nextInt(uczniowie.size());
            while (wylosowani.contains(uczniowie.get(rng))){
                rng = random.nextInt(uczniowie.size());
            }
            wylosowani.add(uczniowie.get(rng));
            System.out.println(uczniowie.get(rng).toString());
        }
    }

}
