package opakovani;

public class ForCyklus {
    public static void main(String[] args){
        for (int i=0; i<10; i++) {
            System.out.println("Cyklus prave vykonal telo.");
            System.out.println("Hodnota iteratoru \"i\" je: "+i);
        }

        String[] poleStringu = {"a", "b", "c"};
        for (String element : poleStringu){
            System.out.println(element);
        }

        int[] poleIntu = {1, 9, 5, 7, 12};
        for (int element : poleIntu){
            System.out.println(element);
        }

        // continue a break
        for (int i=0; i<10; i++){
            if (i == 5){
                continue;
            }
            if (i == 7){
                break;
            }
            System.out.println(i);
        }
    }
}
