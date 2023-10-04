package opakovani;

import java.util.Scanner;

public class Opakovani {
    public static void main(String[] args){
        // poznámka pro mě: vysvětlit package - notpackage
        // deklarace proměnných
        String uzivatelskyVstupStr;
        int cislo = 1;
        float desetinneCisloFloat = 2.5f;
        double destinneCisloDouble = 2.5;
        double soucetFloatADouble = destinneCisloDouble + desetinneCisloFloat;
        boolean spustVypsatSoucetFaD = false;
        boolean spustUzivatelskyVstupInt = false;
        boolean spustUzivatelskyVstupStr = true;

        if (spustVypsatSoucetFaD) {
            System.out.println(soucetFloatADouble);
        }

        /*
        vstup z klavesnice:
        pomocí tridy Scanner:
        - importovat třídu Scanner (package java.util): import java.util.Scanner
        - vytvorit novou instanci tridy Scanner, jménem reader, s parametrem System.in
        - (vypsat hlasku pro uživatele)
        - deklarovat promennou a priradit ji hodnotu reader.nextInt() [nextLine(), ...]

        */
        if (false) {
            Scanner reader = new Scanner(System.in);

            System.out.println("Zadej cele cislo: ");
            int vstupOdUzivateleInt = reader.nextInt();

            System.out.println("Uzivatel napsal: "+vstupOdUzivateleInt);
        }
        if (true) {
            Scanner reader2 = new Scanner(System.in);

            System.out.println("Zadej String: ");
            // promennou uzivatelsky vstup jsme deklarovali na zacatku tridy main !!!
            uzivatelskyVstupStr = reader2.nextLine();

            System.out.println("Uzivatel napsal: "+uzivatelskyVstupStr);
        }



    }


}
