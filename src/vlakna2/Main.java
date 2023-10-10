package vlakna2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Vlakno v1 = new Vlakno("Zdravim");
        Vlakno v2 = new Vlakno("Ahoj svete");
        Vlakno v3 = new Vlakno("Konec");

        v1.start();
        // v1.join();
        v2.start();
        v3.start();
        v1.setPriority(10);
        v2.setPriority(1);
        v3.setPriority(1);
        v1.join();
        v2.join();
        v3.join();

        System.out.println("\nHlavni vlakno dokonceno.");
    }
}
