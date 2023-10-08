package praceSeSoubory;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CteniDatZeSouboru {
    public static void main(String[] args) {
        //String nazevSouboru = "/home/jedle/Projects/VAP/seznam.txt";
        String nazevSouboru = "seznam.txt";
        int maximalniPocetRadek = 20;
        String[] data = new String[maximalniPocetRadek];
        ArrayList<String> dataList = new ArrayList<String>();

        try {
            File mujSoubor = new File(nazevSouboru);
            System.out.println(mujSoubor.getAbsolutePath());
            Scanner sc = new Scanner(mujSoubor);
            for (int i=0; i<data.length; i++) {
                if (sc.hasNextLine()){
                    //data[i] = sc.nextLine();
                    dataList.add(sc.nextLine());
                } else {
                    break;
                }
            }
            sc.close();
        } catch (FileNotFoundException e){
            System.out.println("Soubor nenalezen.");
        }

        //for (String el : data){
        //    System.out.println(el);
        //}

        //String[] zkraceny = vratZkracenySeznam(data);
        //for (String el : zkraceny) {
        //    System.out.println(el);
        //}
        for (String el : dataList){
            System.out.println(el);
        }


    }


    static String[] vratZkracenySeznam(String[] data){
        int i = 0;
        for (String element : data){
            if (element == null) {
                break;
            } else {
                i++;
            }
        }
        String[] zkracenySeznam = new String[i];
        for (i=0; i<zkracenySeznam.length; i++) {
            zkracenySeznam[i] = data[i];
        }
        return zkracenySeznam;
    }
}
