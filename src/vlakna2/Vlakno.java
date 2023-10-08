package vlakna2;

public class Vlakno extends Thread {
    private final String zprava;

    public Vlakno(String zprava) {
        this.zprava = zprava;
    }

    @Override
    public void run() {
        int pozice = 0;
        while(pozice < zprava.length()) {
            System.out.print(zprava.charAt(pozice++));
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                System.out.println("Vlákno se zprávou \"" + zprava + "\" přerušeno");
                return;
            }
        }
    }
}
