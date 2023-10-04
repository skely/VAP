package vap2;

public class Pivo extends Napoj{
    int stupne;
    public Pivo(String nazev){
        super(nazev);
    }
    public Pivo(String nazev, int cena, float objem, int stupne){
        super(nazev, cena, objem);
        this.stupne = stupne;
    }

    public void setStupne(int stupne) {
        this.stupne = stupne;
    }

    public int getStupne() {
        return stupne;
    }

    @Override
    public String vypis() {
        return nazev+" "+stupne+"˚ , cena: "+cena+",- Kč, objem: "+objem+" l";
    }
}
