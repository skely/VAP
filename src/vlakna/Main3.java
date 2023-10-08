package vlakna;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hlavní vlákno spuštěno");
        Vlakno mojeVlakno = new Vlakno("Druhe");
        mojeVlakno.start();
        mojeVlakno.join();
        System.out.println("Hlavní vlákno ukončeno");
    }
}
