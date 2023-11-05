package opakovani;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        try {
            int cislo = scanner.nextInt();
            System.out.println("Vysledek: "+ (cislo*cislo));
        } catch (Exception e) {
            System.out.println("neni cislo");
        }
    }
}
