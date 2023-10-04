package tridy.abstrakce;

public class Napoj extends Polozka{  // trida Napoj dedi od predka Polozka
    double objem;  // deklarace atributu tridy Napoj

    public Napoj(String jmeno, int cena, double objem){  // konstruktor tridy napoj
        super(jmeno, cena);  // musime zavolat kontruktor predka
        this.objem = objem;  // "atributu tridy" priradime hodnotu "parametru kontruktoru"
    }
    public void vypisPolozku(){  // implementace abstraktni tridy predka
        System.out.println(nazev + " " + "("+objem+" l)\t" + cena + " Kč.");
    }
}
