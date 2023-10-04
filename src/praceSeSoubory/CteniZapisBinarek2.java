package praceSeSoubory;
import java.io.*;
/*
cte a zapisuje binarni soubory (celé najednou)
 */
public class CteniZapisBinarek2 {
    public static void main(String[] args) {
        String vstupniSoubor = "binsoubor.bin";
        String vystupniSoubor = "binsoborout.bin";

        try (
                InputStream inputStream = new FileInputStream(vstupniSoubor);
                OutputStream outputStream = new FileOutputStream(vystupniSoubor);
        ) {
            long fileSize = new File(vstupniSoubor).length();
            byte[] allBytes = new byte[(int) fileSize];

            int bytesRead = inputStream.read(allBytes);
            outputStream.write(allBytes, 0, bytesRead);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
