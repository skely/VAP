package vap2;
import java.util.Scanner;
/**
 * Ukazkovy kod pro opakovani latky VAP2
 */
public class SyntaxeProgramovacihoJazyka {
    /**
     * Spouštěcí třída (main)
     * @param args zadne vstupni parametry
     */
    public static void main(String[] args){
        int index = 5;  // deklarace promněné s inicializační hodnotou
        int index_mezery; // deklarace promněné bez inicializační hodnoty
        String jmeno = "Pepíček Novák";
        System.out.println(jmeno);  // výpis hodnoty proměnné do konzole

        // Operace s oběktem typu String
        System.out.println(jmeno.charAt(index)); // výpis znaku na pozici

        index_mezery = jmeno.indexOf(" ");
        System.out.println(index_mezery);

        String[] castiJmena = {jmeno.substring(0, index_mezery), jmeno.substring(index_mezery+1)};
        int[] delkyJmen = {castiJmena[0].length(), castiJmena[1].length()};
        for (int i=0; i<2 ;i++) {
            System.out.println(i+". jméno: "+castiJmena[i] + " má déklu "+delkyJmen[i]+" znaků.");
        }

        System.out.println("Příjmení, jméno: "+ castiJmena[0] + ", "+castiJmena[1]);

        // Příklad: Udělat kód tak, aby rozdělil jméno na části i pro více křestních jmen.

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = reader.nextInt();
        reader.close();
        System.out.println(n);
    }

}
