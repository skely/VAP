package opakovani;

public class WhileCyklus {
    public static void main(String[] args){
        int i = 0;
        while (i < 10){
            System.out.println(i);
            i++;
        }

        do {
            System.out.println(i);
            i--;
        } while (i>=0);
    }
}
