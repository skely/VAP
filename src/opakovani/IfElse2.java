package opakovani;

public class IfElse2 {
    public static void main(String[] args){
        for (int i=1; i<20; i++){
            if (i%2 == 0){
                System.out.println(i+ " je sude.");
            } else {
                System.out.println(i+ " je liche.");
            }
            if (i > 5) {
                if (i < 7) {
                    System.out.println(i+ " jenom tohle je sestka!");
                }
            }
            if (i%3 == 0){
                System.out.println(i+ " je delitelne 3.");
            } else if (i%4 == 0) {
                System.out.println(i+ " je delitelne 4.");
            } else {
                System.out.println(i+ " neni delitelne ani 3, ani 4.");
            }

            // Tenhle kod nedela to, co bychom ocekavali.
            // Č. 12 je delitelne i 3 i 4 !!! kde je chyba ???
            // Napiste kod, ktery vypise vysledky spravne

            if ((i%3 == 0) && (i%4 == 0)){
                System.out.println(i+ " je 12, to je delitelne 3 i 4.");
            } else if (i%3 == 0) {
                System.out.println(i+ " je delitelne 3.");
            } else if (i%4 == 0) {
                System.out.println(i+ " je delitelne 4.");
            } else {
                System.out.println(i+ " neni delitelne ani 3, ani 4.");
            }


        }
    }
}
