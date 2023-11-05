package tridy2rocnik;

import java.util.SplittableRandom;

public class Objekt {
    private String nazev;
    private int[] pozice = new int[2];
    private int[] barva = new int[3];
    private double hmotnost;

    public Objekt(){}
    public Objekt(String nazev){
        this.nazev = nazev;
    }
    public Objekt(String nazev, int[] pozice, int[] barva, double hmotnost){
        this.nazev = nazev;
        this.pozice = pozice;
        this.barva = barva;
        this.hmotnost = hmotnost;
    }

    public void setNazev(String nazev){
        this.nazev = nazev;
    }

    public String getNazev(){
        return nazev;
    }
    public void setPozice(int[] pozice){
        this.pozice = pozice;
    }
    public int[] getPozice(){
        return this.pozice;
    }
    public void setBarva(int[] barva) {
        this.barva = barva;
    }
    public int[] getBarva() {
        return barva;
    }
    public void setHmotnost(double hmotnost) {
        this.hmotnost = hmotnost;
    }
    public double getHmotnost() {
        return hmotnost;
    }

    public int sectiKanalyBarev(){
        return barva[0]+barva[1]+barva[2];
    }
    public String vratKusNazvu(int delka){
        String navrat;
        if (delka<=nazev.length()){
            navrat = nazev.substring(0, delka);
        } else {
            navrat = nazev;
        }
        return navrat;
    }
    public String vratKusNazvuPozpatku(int delka){
        String pracovniPromenna = vratKusNazvu(delka);
        String vystupniPromenna = "";
        for (int i = pracovniPromenna.length(); i > 0; i--){
            vystupniPromenna += pracovniPromenna.charAt(i-1);
        }
        return vystupniPromenna;
    }
}
