package tridy.abstrakce;

public abstract class Polozka {  // deklarace abstraktni tridy Polozka
    String nazev;  // deklarace atributu tridy
    int cena;  // deklarace atributu tridy

    public Polozka(String nazev, int cena){ // konstruktor tridy
        this.nazev = nazev;  // atributu prirazujeme honotu z parametru kontruktoru
        this.cena = cena;  // atributu prirazujeme honotu z parametru kontruktoru
    }
    abstract void vypisPolozku();  // deklarace abstraktni tridy - potomci musi naimplementovat
    public static void readMe(){
        System.out.println("Vypisuji readMe.");
    }
}
