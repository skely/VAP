package tridy.abstrakce;  // package odpovida umisteni souboru v projektu

public class Main {
    public static void main(String[] args){
        Jidlo rizek = new Jidlo("Vepřový řízek", 200, 150);  // vytvorim instanci tridy Jidlo a přiřadím honotu pomoci konstruktoru
        Jidlo svickova = new Jidlo("Svíčková", 250, 140);  // vytvorim instanci tridy Jidlo a přiřadím honotu pomoci konstruktoru
        Napoj cola = new Napoj("Cola", 40, 0.33);  // vytvorim instanci tridy Jidlo a přiřadím honotu pomoci konstruktoru

        Polozka[] polePolozek = {rizek, svickova, cola};  // deklarace pole

        for (Polozka element : polePolozek){  // syntaxe for-cyklu (viz konec)
            element.vypisPolozku();
        }

        Polozka.readMe();
    }
}
/* syntaxe for-cyklu (alternativa)

int delkaPole = polePolozek.length;  // delkaPole má hodnotu počtu položek v poli
for(int i=0; i<delkaPole; i++)  // for cyklus; pocet opakovani odpovida poctu polozek
    System.out.println(polePolozek[i].vypisPolozku());  // vypise i-tou polozku (pole cislujeme od 0 - 0. polozka, 1. polozka, ...)
---------
for (Polozka element : polePolozek){  // for cyklus; pocet opakovani odpovida delce pole
            element.vypisPolozku();   // na prvky pole se odkazujeme primo - bez iteratoru
---------
rozdil je v tom, ze:
alternativní syntaxe je jednodussi, ale neobsahuje iterator

 */