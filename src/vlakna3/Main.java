package vlakna3;

public class Main {
    public static void main(String[] args){
        NacitaniSouboruVlakno vlakno = new NacitaniSouboruVlakno("prvni");
        vlakno.setNazevSouboru("seznam.txt");
        vlakno.start();
        System.out.println("Tady běží nějaký dialog s uživatelem...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("preruseno");
        }
        System.out.println("Tady běží nějaký dialog s uživatelem...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("preruseno");
        }
        System.out.println("Tady běží nějaký dialog s uživatelem...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("preruseno");
        }
        System.out.println("Tady běží nějaký dialog s uživatelem...");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println("preruseno");
        }
    }
}
