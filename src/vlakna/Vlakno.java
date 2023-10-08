package vlakna;

class Vlakno extends Thread {
    public Vlakno(String jmeno) {
        super(jmeno);
    }

    @Override
    public void run() {
        System.out.println("Vlákno " + getName() + " spuštěno");
        for(int i = 0; i < 4; ++i) {
            System.out.println("Vlákno " + getName() + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Vlákno " + getName() + " přerušeno");
                return;
            }
        }
        System.out.println("Vlákno " + getName() + " ukončeno");
    }
}
