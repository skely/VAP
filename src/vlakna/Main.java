package vlakna;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hlavní vlákno spuštěno");
        Vlakno mojeVlakno = new Vlakno("Druhe");
        mojeVlakno.start();

        for(int i = 0; i < 4; ++i) {
            System.out.println("Hlavní vlákno: " + i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException ex) {
                System.out.println("Hlavní vlákno přerušeno");
                return;
            }
        }
        System.out.println("Hlavní vlákno ukončeno");
    }
}
