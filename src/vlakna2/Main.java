package vlakna2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Vlakno v1 = new Vlakno("Zdravim");
        Vlakno v2 = new Vlakno("Ahoj svete");
        Vlakno v3 = new Vlakno("Konec");

        v1.start();
        v2.start();
        v3.start();
    }
}
