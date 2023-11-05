package vlakna2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Vlakno v1 = new Vlakno("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
        Vlakno v2 = new Vlakno("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");
        Vlakno v3 = new Vlakno("cccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccc");
        //v1.setPriority(1);
        v1.start();
        v1.join();
        //v2.setPriority(5);
        v2.start();
        //v3.setPriority(10);
        v3.start();

        //v1.join();
        v2.join();
        v3.join();
        System.out.println("\nHlavni vlakno dokonceno.");
    }
}
