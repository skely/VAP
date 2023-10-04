package tridy.abstrakce;

public class Jidlo extends Polozka{  // trida Jidlo dedi od predka Polozka
    int hmotnostMasa;  // deklarace atributu tridy Jidlo

    public Jidlo(String jmeno, int cena, int hmotnostMasa){  // konstruktor tridy
        super(jmeno, cena);  // musime zavolat kontruktor predka
        this.hmotnostMasa = hmotnostMasa; // "atributu tridy" priradime hodnotu "parametru kontruktoru"
    }
    @Override  // dekorátor "@" není povinný, ale zajišťuje, že kompilátor ověří, zda implementovaná funkce je opravdu abstraktní třídou předka
    void vypisPolozku() {  // implementace abstraktni funkce tridy predka "Polozka"
        System.out.println(nazev + " " + "("+hmotnostMasa+" g)\t" + cena + " Kč.");
    }
}
