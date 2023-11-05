package tridy2rocnik;

public class SpousteciTrida3 {
    public static void main(String[] args) {
        Objekt truhlicka = new Objekt();
        Objekt krabicka = new Objekt("Krabice");

        System.out.println( truhlicka.getNazev() );
        truhlicka.setNazev("Truhla");
        System.out.println( truhlicka.getNazev() );
        truhlicka.setNazev("Truhlik");
        System.out.println( truhlicka.getNazev() );
        System.out.println( krabicka.getNazev() );

        int nova_pozice_x = 5;
        int nova_pozice_y = 6;
        int[] nova_pozice = new int[2];

        nova_pozice[0] = nova_pozice_x;
        nova_pozice[1] = nova_pozice_y;

        truhlicka.setPozice(nova_pozice);
        System.out.println(truhlicka.getPozice()[0]);
        int[] jina_pozice = {4, 5};
        truhlicka.setPozice(jina_pozice);
        System.out.println(truhlicka.getPozice()[0]);

        int[] novaBarva = {255, 255, 255};
        truhlicka.setBarva(novaBarva);
        System.out.println(truhlicka.getBarva()[0]);
        System.out.println(truhlicka.getBarva()[1]);
        System.out.println(truhlicka.getBarva()[2]);
        truhlicka.setBarva(new int []{20,30,40});
        System.out.println(truhlicka.getBarva()[0]);
        System.out.println(truhlicka.getBarva()[1]);
        System.out.println(truhlicka.getBarva()[2]);

        int soucet = truhlicka.sectiKanalyBarev();
        System.out.println(soucet);
        System.out.println(truhlicka.sectiKanalyBarev());

        String kus = truhlicka.vratKusNazvu(30);
        System.out.println(kus);
        String kusPozpatku = truhlicka.vratKusNazvuPozpatku(3);
        System.out.println(kusPozpatku);
    }
}
