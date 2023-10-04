package tridy.abstrakce;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args){
        int velikostPole;
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej pocet polozek: ");
        velikostPole = sc.nextInt();
        sc.nextLine();

        Polozka[] polePolozek = new Polozka[velikostPole];

        for(int i = 0; i < velikostPole; i++){
            System.out.println("Zadej typ polozky (1: Napoj, 2: Jidlo): ");
            int typPolozky = sc.nextInt();
            sc.nextLine();

            if (typPolozky == 1){
                System.out.println("Zadej nazev napoje: ");
                String nazevNapoje = sc.nextLine();
                System.out.println("Zadej cenu napoje: ");
                int cenaNapoje = sc.nextInt();
                sc.nextLine();
                System.out.println("Zadej hmotnost napoje: ");
                double objemNapoje = sc.nextInt();
                sc.nextLine();
                polePolozek[i] = new Napoj(nazevNapoje, cenaNapoje, objemNapoje);
            } else if (typPolozky == 2) {
                System.out.println("Zadej nazev jidla: ");
                String nazevJidla = sc.nextLine();
                System.out.println("Zadej cenu jidla: ");
                int cenaJidla = sc.nextInt();
                sc.nextLine();
                System.out.println("Zadej hmotnost jidla: ");
                int hmotnostJidla = sc.nextInt();
                sc.nextLine();
                polePolozek[i] = new Jidlo(nazevJidla, cenaJidla, hmotnostJidla);
            } else {
                System.out.println("not a");
            }


        }
        for (Polozka element : polePolozek){
            element.vypisPolozku();
        }
    }
}
