package vlakna;

public class Main2 {
    public static void main(String[] args){
        System.out.println("Hlavní vlákno spuštěno");
        Vlakno mojeVlakno = new Vlakno("Druhe");
        try {
            mojeVlakno.start();
            while (mojeVlakno.isAlive()) {
                Thread.sleep(1);
            }
            System.out.println("Hlavní vlákno ukončeno");
        } catch (InterruptedException e){
            System.out.println("error");
        }
    }
}
