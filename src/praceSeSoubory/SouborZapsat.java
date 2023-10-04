package praceSeSoubory;

import java.io.FileWriter;  // import tridy pro zapis se soubory
import java.io.IOException;  // import tridy pro praci s chybami

public class SouborZapsat {
    public static void main(String[] args) {
        String str = "Text pro praci se soubory.\n";  // vytvorime text

        try {
            FileWriter fw = new FileWriter("output.txt", true); // vytvorime instanci tridy FileWriter s paramterem [nazev souboru]
            fw.write(str);  // zapiseme do souboru
            fw.close();  // soubor zavreme !!!
            System.out.println("Zapis probehl uspesne.");
        } catch (IOException e) {  // pouziti IOException
            System.out.println("Do souboru nelze zapsat.");
        }
    }
}

