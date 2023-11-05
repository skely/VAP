package tridy2rocnik;

public class Bojovnik {
    String jmeno;
    int bodyZdravi, sila;
    double brneni;

    public Bojovnik(){

    }
    public Bojovnik(String jmeno, int bodyZdravi, int sila, double brneni){
        this.jmeno = jmeno;
        this.bodyZdravi = bodyZdravi;
        this.sila = sila;
        this.brneni = brneni;
    }
    public String getJmeno() {
        return jmeno;
    }
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
    public int getBodyZdravi() {
        return bodyZdravi;
    }
    public void setBodyZdravi(int bodyZdravi) {
        this.bodyZdravi = bodyZdravi;
    }
    public int getSila() {
        return sila;
    }
    public void setSila(int sila) {
        this.sila = sila;
    }
    public double getBrneni() {
        return brneni;
    }
    public void setBrneni(double brneni) {
        this.brneni = brneni;
    }
    public void vypis(){
        if (this.jeNazivu()) {
            System.out.println("Jmeno: " + this.jmeno + ", Zdravi: " + this.bodyZdravi + ", Sila: " + this.sila + ", Brneni: " + this.brneni);
        } else {
            System.out.println(this.jmeno + " není naživu.");
        }
    }
    public void utok(Bojovnik cil){
        cil.obrana(this.sila);
    }
    public void ukecanyUtok(Bojovnik cil) {
        System.out.println(this.jmeno + " utočí na "+cil.jmeno+ " silou " + this.sila);
        cil.ukecanaObrana(this.sila);
    }
    public void obrana(int utok){
        int zaokrouhlenyUtok = (int)(utok/brneni);
        this.bodyZdravi = this.bodyZdravi - zaokrouhlenyUtok;
    }
    public void ukecanaObrana(int utok){
        int zaokrouhlenyUtok = (int)(utok/brneni);
        this.bodyZdravi = this.bodyZdravi - zaokrouhlenyUtok;
        System.out.println(this.jmeno + " dostal "+zaokrouhlenyUtok+" zraneni. Zbývá mu: "+this.bodyZdravi+ " zivotu.");
    }
    public void zmrzlyZubr(){
        this.bodyZdravi = 0;
    }
    public boolean jeNazivu(){
        if (this.bodyZdravi <= 0){
            return false;
        } else {
            return true;
        }
    }
    public void lahvickaZdravi(int obnoveniZdravi){
        this.bodyZdravi += obnoveniZdravi;
        //this.bodyZdravi = this.bodyZdravi + obnoveniZdravi;
    }
}
