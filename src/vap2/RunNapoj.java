package vap2;

public class RunNapoj {
    public static void main(String[] args){
        Pivo desitka = new Pivo("Gambrinus", 30, 0.5f, 10);
        Pivo dvanactka = new Pivo("Prazdroj", 40, 0.5f, 12);
        Napoj rum = new Napoj("Rum", 15, 0.04f);

        System.out.println(desitka.getCena());
        System.out.println(desitka.vypis());
        System.out.println(dvanactka.vypis());
        System.out.println(rum.vypis());
    }
}
