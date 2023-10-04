package opakovani;

public class IfElsePriklad {
    public static void main(String[] args) {
        for (int i=1;i<=20;i++) {
            if ((i % 3 == 0) && (i % 4 == 0)) {
                System.out.println(i + " je delitelne 3 i 4.");
            } else if (i % 3 == 0) {
                System.out.println(i + " je delitelne 3.");
            } else if (i % 4 == 0) {
                System.out.println(i + " je delitelne 4.");
            } else {
                System.out.println(i + " neni delitelne ani 3, ani 4.");
            }
        }
    }

}
