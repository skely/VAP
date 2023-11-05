package tridy2rocnik;

public class Postava {
    String jmeno;
    int zdravi;
    int utok;
    String rasa;

    public Postava(){}
    public Postava(String jmeno){
        this.jmeno = jmeno;
    }
    public Postava(String jmeno, int zdravi, int utok){
        this.jmeno = jmeno;
        this.zdravi = zdravi;
        this.utok = utok;
    }

    public String getJmeno(){
        return this.jmeno;
    }
    public void setJmeno(String jmeno){
        this.jmeno = jmeno;
    }
    public int getZdravi(){
        return this.zdravi;
    }
    public void setZdravi(int zdravi){
        this.zdravi = zdravi;
    }
    public int getUtok() {
        return utok;
    }
    public void setUtok(int utok) {
        this.utok = utok;
    }
    public void dostaneZraneni(int zraneni) {
        this.zdravi = this.zdravi - zraneni;
    }
    public void zautoci(Postava cilUtoku){
        cilUtoku.dostaneZraneni(this.utok);
    }

}
