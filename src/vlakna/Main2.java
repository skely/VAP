package vlakna;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hlavní vlákno spuštěno");
        Vlakno mojeVlakno = new Vlakno("Druhe");
        mojeVlakno.start();
        while(mojeVlakno.isAlive()) {
            Thread.sleep(1);
        }
        System.out.println("Hlavní vlákno ukončeno");
    }
}
