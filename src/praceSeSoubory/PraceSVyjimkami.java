package praceSeSoubory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PraceSVyjimkami {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cislo;

        try {
            System.out.println("Zadej cislo: ");
            cislo = sc.nextInt();
        } catch (InputMismatchException e){
            System.out.println("Neni cislo");
            sc.nextLine();
            cislo = -1;
        }

        System.out.println("Zadane cislo: "+ cislo);
    }
}
