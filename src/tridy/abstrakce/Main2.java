package tridy.abstrakce;  // package odpovida umisteni souboru v projektu
import java.util.Scanner;  // import tridy scanner pro cteni uzivatelskeho vstupu

public class Main2 {
    public static void main(String[] args){
        int velikostPole = 2;  // pocet jidel na seznamu
        Jidlo[] poleJidel = new Jidlo[velikostPole];  // deklarace pole
        Scanner sc = new Scanner(System.in);  // deklarace instance tridy scanner s nazvem sc

        for(int i = 0; i < velikostPole; i++){  // cyklus, ktery navstivi kazdou polozku pole
            System.out.println("Zadej nazev jidla: ");  // Vypsani do konzole
            String nazevNapoje = sc.nextLine();  // Nacteni uzivatelskeho vstupu (text)
            System.out.println("Zadej cenu jidla: ");
            int cenaNapoje = sc.nextInt();  // Nacteni uzivatelskeho vstupu (cislo)
            sc.nextLine();  // TLDR: po nextInt() vždy zavolejte nextLine()
            /*
            funkce tridy scanner nextInt() a nextLine() nakládají jinak se vstupem.
            funkce nextLine() přečte celý vživatelský vstup VČETNĚ "ENTERu" na konci - znak "\n")
            funkce nextInt() přečte uživatelský vstup BEZ "ENTERu" na konci.
            To má následující efekt: další volání nextLine() přečte právě ten ponechaný znak "\n",
            který zůstal na vstupu a pokračuje dál.
            Můžete si sami zakomentováním řádky. Vyzkoušet přidáním "//" před řádky sc.nextLine()
             */
            System.out.println("Zadej hmotnost masa: ");
            int hmotmostMasa = sc.nextInt();
            sc.nextLine();  // TLDR: po nextInt() vždy zavolejte nextLine()
            poleJidel[i] = new Jidlo(nazevNapoje, cenaNapoje, hmotmostMasa);
        }
        for (Polozka element : poleJidel){
            element.vypisPolozku();
        }
    }
}
