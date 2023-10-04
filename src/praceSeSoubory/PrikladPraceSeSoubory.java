package praceSeSoubory;

public class PrikladPraceSeSoubory {
    public static void main(String[] args) {
        //PraceSeSouboryClass priklad = new PraceSeSouboryClass("skripta-uvod.txt");
        //priklad.readData();
        //priklad.vypisCetnostSlova("Kybernetika");
        //priklad.zapisVysledekDoSouboru("Kyberneti", "cetnost.txt");

        PraceSeSouboryClass2 priklad2 = new PraceSeSouboryClass2("seznamVAP3.txt");
        priklad2.readData();
        priklad2.vypisData3();
        // vypisData(String promenna);
        // vypise jen data, kde je v druhem sloupci "a" (deleni "\t")
    }
}