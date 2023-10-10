package vlakna;

public class Main {
    public static void main(String[] args){
        System.out.println("Hlavní vlákno spuštěno");
        Vlakno mojeVlakno = new Vlakno("Druhe");
        mojeVlakno.start();

        for(int i = 0; i < 4; ++i) {
            System.out.println("Hlavní vlákno: " + i);
            try {
                Thread.sleep(750);
            } catch (InterruptedException ex) {
                System.out.println("Hlavní vlákno přerušeno");
                return;
            }
        }
        try {
            mojeVlakno.join();
        } catch (InterruptedException ex) {
            System.out.println("Hlavní vlákno přerušeno");
        }
        System.out.println("Hlavní vlákno ukončeno");
    }
}
