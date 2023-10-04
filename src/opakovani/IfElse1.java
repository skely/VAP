package opakovani;

public class IfElse1 {
    public static void main(String[] args){
        boolean a = true;
        boolean b = false;
        int x = 5;
        int y = 10;

        if (a) {
            System.out.println("a je true.");
        }

        if (b) {
            System.out.println("b je true.");
        } else {
            System.out.println("b je false.");
        }

        if (!b) {
            System.out.println("b neni true.");
        }

        if (a && b){
            System.out.println("a i b je true.");
        } else {
            System.out.println("neni pravda, ze a i b je true.");
        }

        if (a || b) {
            System.out.println("a nebo b je true.");
        }

        if (x < y) {
            System.out.println("x je mensi nez y.");
        }
        if (x <= y) {
            System.out.println("x je mensi nebo rovno nez y.");
        }
        if ((x <= y) && a) {
            System.out.println("x je mensi nebo rovno nez y a soucasne a je true.");
        }

    }
}
