package opakovani;

public class SwitchCase {
    public static void main(String[] args){
        for (int i=0; i<=3; i++) {
            switch(i) {
                case 1:
                    System.out.println("jedna");
                case 2:
                    System.out.println("dva");
                case 3:
                    System.out.println("tri");
                default:
                    System.out.println("jine");
            }
        }
    }
}
