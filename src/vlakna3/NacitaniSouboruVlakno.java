package vlakna3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NacitaniSouboruVlakno extends Thread{
    String jmeno;
    String data;
    String nazevSouboru;

    public NacitaniSouboruVlakno(String jmeno){super(jmeno);}
    @Override
    public void run() {
        try {
            nacti();
            //nacitani trva jakoby dlouho
            Thread.sleep(1000);
            vypisData();
        } catch (InterruptedException e){
            System.out.println("přerušeno.");
        }
    }
    public void setNazevSouboru(String nazevSouboru){
        this.nazevSouboru = nazevSouboru;
    }
    public String getNazevSouboru(){
        return nazevSouboru;
    }
    public void nacti() {
        try {
            File mujSoubor = new File(nazevSouboru);
            Scanner sc = new Scanner(mujSoubor);
            data = "";
            while (sc.hasNextLine()) {
                data += sc.nextLine();
            }
            sc.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("Soubor nenalezen.");
        }
    }
    public void vypisData() {
        System.out.println(data);
    }
}
