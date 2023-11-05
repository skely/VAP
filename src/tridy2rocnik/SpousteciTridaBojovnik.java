package tridy2rocnik;

public class SpousteciTridaBojovnik {
    public static void main(String[] args) {
        String pepovoJmeno = "Pepa";
        Bojovnik pepa = new Bojovnik();

        pepa.setJmeno(pepovoJmeno);
        System.out.println(pepa.getJmeno());

        pepa.setBodyZdravi(20);
        pepa.setBrneni(2);
        pepa.setSila(8);

        Bojovnik karel = new Bojovnik("Karel", 25, 10, 1.8);
        System.out.println(karel.getJmeno());
        /*
        pepa.vypis();
        karel.vypis();
        pepa.utok(karel);
        pepa.vypis();
        karel.vypis();
        pepa.zmrzlyZubr();
        System.out.println(pepa.jeNazivu());
        pepa.vypis();
        */
        while (pepa.jeNazivu() & karel.jeNazivu()){
            pepa.ukecanyUtok(karel);
            pepa.lahvickaZdravi(1);
            karel.ukecanyUtok(pepa);
        }
    }
}
