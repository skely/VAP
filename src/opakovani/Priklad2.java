package opakovani;

/**
 * Přilkad :
 * Vytvořte program, který vypíše čísla dělitelná 3 od 4 do 27 (včetně).
 */
public class Priklad2 {
    public static void main(String[] args) {
        for (int i=4; i<=27; i++) {
            if (i%3 == 0) {
                System.out.println(i);
            }
        }
    }
}
