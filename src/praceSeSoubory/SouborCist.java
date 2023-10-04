package praceSeSoubory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SouborCist {
    public static void main(String[] args) {
        try {
            File mujSoubor = new File("output.txt");
            Scanner sc = new Scanner(mujSoubor);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("Soubor nenalezen.");
        }
    }
}
