package praceSeSoubory;
import java.io.*;
/**
 * This program checks whether a file is of PNG image format or not,
 * by analysing its first 8 bytes.
 * @author www.codejava.net
 */
public class CteniZapisBinarekTypeCheck {
    private static int[] pngSignature = {137, 80, 78, 71, 13, 10, 26, 10};

    public static void main(String[] args) {
        String inputFile = "soubor.bin";
        try (
                InputStream inputStream = new FileInputStream(inputFile);
        ) {
            int[] headerBytes = new int[8];
            boolean isPNG = true;
            for (int i = 0; i < 8; i++) {
                headerBytes[i] = inputStream.read();

                if (headerBytes[i] != pngSignature[i]) {
                    isPNG = false;
                    break;
                }
            }

            System.out.println("Je soubor PNG? " + isPNG);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}