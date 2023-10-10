package tridy2rocnik;

public class SpousteciTrida2 {
    public static void main(String[] args){
        Predmet[] zasobaTyci = new Predmet[10];
        Predmet tyc = new Predmet();
        Predmet tyc2 = new Predmet();
        Predmet tyc3 = new Predmet("tycinka");

        Predmet tycX = new Predmet(5.5);
        zasobaTyci[0] = tyc;
        zasobaTyci[1] = tyc2;
        zasobaTyci[2] = tyc3;

        tyc.setNazev("tyc+1");
        System.out.println(tyc.getNazev());
        tyc.setNazev("nova tyc");
        System.out.println(tyc.getNazev());
        System.out.println(tyc2.getNazev());
        System.out.println(tyc3.getNazev());

        tyc.setHmotnost(5.5);
        System.out.println(tyc.getHmotnost());

        Predmet tyc8 = new Predmet("tycka8", 8.9);
        System.out.println(tyc8.getNazev() + ": " + tyc8.getHmotnost());

        zasobaTyci[3] = tyc8;

        tyc8.vypisInfo();
        tyc.vypisInfo();
        tyc2.vypisInfo();

        double hmotnostVsechTyci;
        for (int i = 0; i<zasobaTyci.length; i++){
            if (zasobaTyci[i] != null){
                zasobaTyci[i].vypisInfo();
            }
        }


    }
}
