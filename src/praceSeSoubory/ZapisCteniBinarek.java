package praceSeSoubory;
import java.io.*;
/*
Zapise obseah jednoho binarniho souboru do druheho (jeden byte v kazdem kroku)
 */
public class ZapisCteniBinarek {
    public static void main(String[] args) {
        String vstupniSoubor = "binsoubor.bin";
        String vystupniSoubor = "binsoborout.bin";

        try {
            InputStream inputStream = new FileInputStream(vstupniSoubor);
            OutputStream outputStream = new FileOutputStream(vystupniSoubor);

            int byteRead = -1;

            while ((byteRead = inputStream.read()) != -1) {  // precti jeden byte a posli
                outputStream.write(byteRead);
            }
            inputStream.close();
            outputStream.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
