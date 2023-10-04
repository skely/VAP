package praceSeSoubory;
import java.io.*;
/*
Cte a zapisuje binarni soubor
 */
public class CteniZapisBinarrek3 {
    public static void main(String[] args) {
        String vstupniSoubor = "soubor.bin";
        String vystupniSoubor = "soubor2.bin";
        int velikost_bufferu = 4096;

        try (
                InputStream inputStream = new FileInputStream(vstupniSoubor);
                OutputStream outputStream = new FileOutputStream(vystupniSoubor);
        ) {
            byte[] buffer = new byte[velikost_bufferu];
            int bytesRead = -1;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}