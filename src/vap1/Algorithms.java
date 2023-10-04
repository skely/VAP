package vap1;

public class Algorithms {
    public static void main(String[] args){
        int a = 1;
        boolean b = false;

        // Podmínky (operatory: <,>,<=,>=,==,!=)
        // if; if-else; if-else if-else if-.. ..-else;
        if (a==1){
            System.out.println(a);
        }
        if (a==1){
            System.out.println(a);
        } else {
            System.out.println(a);
        }
        if (a==1){
            System.out.println(a);
        } else if (a>1) {
            System.out.println(a);
        } else if (a>2) {
            System.out.println(a);
        } else {
            System.out.println(a);
        }
        // více podmínek (!b je to samé, jako b==false)
        if (a==1 && !b) {
            System.out.println(a);
        }
        if (a==1 || b) {
            System.out.println(a);
        }
        // Switch-case:
        switch (a) {
            case 1: System.out.println("jedna");
            case 2: System.out.println("dva");
            case 3: System.out.println("tri");
            default: System.out.println("jine");
        }

        // Cykly
        // For-cyklus: cyklus s podmínkou na začátku
        for (int i=1; i<5; i++) {
            System.out.println(i);
        }
        // For-cyklus: iterace přes prvky pole (for-each)
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
        // While-cyklus: cyklus s podmínkou na začátku
        int w = 1;
        while (w<5) {
            System.out.println(w);
            w++;
        }
        // Do-While-cyklus: cyklus s podmínkou na konci
        do {
            System.out.println(a);
            a++;
        } while (a<5);

    }
}
