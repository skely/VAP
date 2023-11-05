package vlakna;

public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hlavní vlákno spuštěno");
        Vlakno mojeVlakno = new Vlakno("Druhe");
        mojeVlakno.setDaemon(true);
        mojeVlakno.start();
        Thread.sleep(1500);
        //mojeVlakno.join();
        System.out.println("Hlavní vlákno ukončeno");
    }
}
