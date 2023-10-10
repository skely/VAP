package tridy2rocnik;

public class Predmet {
    String nazev;  // atribut tridy
    double hmotnost;  //atribut tridy

    public Predmet(){  // konstruktor
        this.nazev = "nevyplneno";
    }
    public Predmet(String nazev){  // konstruktor
        this.nazev = nazev;
    }
    public Predmet(double hmotnost){  // konstruktor  (musí se lišit alespoň typen parametru)
        this.hmotnost = hmotnost;
    }
    public Predmet(String nazev, double hmotnost){  // konstruktor (nebo poctem parametru)
        this.nazev = nazev;
        this.hmotnost = hmotnost;
    }
    public void vypisInfo(){  // metoda - navratový typ void - nevrací nic
        System.out.println("Název: " + this.getNazev() + ", hmotnost: "+ this.getHmotnost());
    }

    public void setNazev(String nazev){
        this.nazev = nazev;
    }
    public String getNazev(){
        return this.nazev;
    }
    public void setHmotnost(double hmotnost){
        this.hmotnost = hmotnost;
    }
    public double getHmotnost(){
        return hmotnost;
    }
}
