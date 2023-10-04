package vap2;

public class Napoj {
    String nazev;
    int cena;
    float objem;

    public Napoj(String nazev){
        this.nazev = nazev;
    }
    public Napoj(String nazev, int cena, float objem){
        this.nazev = nazev;
        this.cena = cena;
        this.objem = objem;
    }
    public int getCena() {
        return cena;
    }

    public float getObjem() {
        return objem;
    }

    public String getNazev() {
        return nazev;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
    public void setObjem(float objem) {
        this.objem = objem;
    }
    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public String vypis() {
        return nazev+", cena: "+cena+",- Kč, objem: "+objem+" l";
    }
}
