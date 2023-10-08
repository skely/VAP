package praceSeSoubory;

public class PrikladPraceSeSoubory {
    public static void main(String[] args) {
        PraceSeSouboryClass priklad = new PraceSeSouboryClass("/home/jedle/Projects/VAP/skripta-uvod.txt");
        priklad.readData();
        priklad.vypisCetnostSlova("Kybernetika");
        //priklad.zapisVysledekDoSouboru("Kyberneti", "cetnost.txt");

        PraceSeSouboryClass2 priklad2 = new PraceSeSouboryClass2("/home/jedle/Projects/VAP/seznamVAP3.txt");
        priklad2.readData();
        priklad2.vypisData2();
        //vypisData(String promenna);
        //vypise jen data, kde je v druhem sloupci "a" (deleni "\t")
    }
}