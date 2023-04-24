import java.util.Objects;

/**

 Opis: Klasa opisująca uczniów
 imie : String, pole reprezentujące imię ucznia
 nazwisko : String, pole reprezentujące nazwisko ucznia
 id : int, pole reprezentujące unikalne id ucznia

 @author : Jakub Jańczuk

**/
public class Uczen {

    private String imie;
    private String nazwisko;
    private int id;
    private static int uczniowie_id = 0;

    public Uczen(String imie, String nazwisko){
        this.imie = imie;
        this.id = uczniowie_id;
        uczniowie_id++;
        this.nazwisko = nazwisko;
    }

    public Uczen(Uczen uczen){
        this.imie = uczen.imie;
        this.nazwisko = uczen.nazwisko;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Uczen uczen = (Uczen) o;
        return id == uczen.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
