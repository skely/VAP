package praceSeSoubory;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class PraceSeSouboryClass {
    String jmenoSouboru;
    ArrayList<String> data = new ArrayList<String>();

    public PraceSeSouboryClass(String jmenoSouboru){
        this.jmenoSouboru = jmenoSouboru;
    }

    public void readData(){
        File mujSoubor = new File(jmenoSouboru);
        try {
            Scanner sc = new Scanner(mujSoubor);
            while (sc.hasNextLine()) {
                data.add(sc.nextLine());
            }
            sc.close();
            System.out.println("Soubor načten.");
        } catch (FileNotFoundException e) {
            System.out.println("Soubor nenalezen.");
        }
    }

    private int spocitejCetnostSlova(String slovo){
        int cetnost = 0;

        for (String el : data) {
            int index = el.toLowerCase().indexOf(slovo.toLowerCase());  //str.toLowerCase();

            while (index != -1){
                cetnost += 1;
                el = el.substring(index+slovo.length());
                index = el.toLowerCase().indexOf(slovo.toLowerCase());
            }
        }
        return cetnost;
    }
    public void vypisCetnostSlova(String slovo){
        System.out.println("Četnost slova \""+slovo+"\" je: "+spocitejCetnostSlova(slovo));
    }
    public void zapisVysledekDoSouboru(String slovo, String jmenoSouboru){
        try {
            FileWriter fw = new FileWriter(jmenoSouboru, true);
            fw.write(slovo+":"+spocitejCetnostSlova(slovo)+"\n");
            fw.close();
            System.out.println("Zapis probehl uspesne.");
        } catch (IOException e) {
            System.out.println("Do souboru nelze zapsat.");
        }
    }
}
