package opakovani;
import java.util.Scanner;  // Import the Scanner class


public class DatoveTypy {
    public static void main(String[] args) {
    // Primitivní datové typy
    // celá čísla
    byte myByte = 1; // velikost: 1 byte; hodnoty: -128 až 127
    short myShort = 1; // velikost: 2 bytes; hodnoty: -32 768 až 32 767
    int myInt = 1; // velikost: 4 bytes;
    long myLong = 1; // velikost: 8 bytes;
    // reálná čísla
    float myFloat = 1.0f; // velikost: 4 bytes; hodnoty na 6 až 7 desetinných míst
    double myDouble = 1.0; // velikost: 8 bytes; hodnoty na 15 desetinných míst
    // logická proměnná
    boolean myBoolean = true, h=false; // velikost 1 bit !
    // znak
    char myChar = 'a'; // velikost 2 bytes; hodnota proměnné je jeden znak (ASCII value)
    double x = 5;
    // Neprimitivní datové typy
    // text
    String myString = "Text"; //
    // pole
    int[] myIntArray = {3, 5, 7};
    String[] myStringArray = {"a", "ab", "abc"};
    int[] myIntArrayBySize = new int[10]; // pole intu o velikosti 10 (inicializace int je 0)

    // přístup a zápis prvků pole přes []
        /*
            System.out.println(myStringArray[1]);
            myStringArray[1] = "dddd";
        */

    // třídy
    // třídy jsou neprimitivní datový typ definovaný uživatelem - později

    // výpis hodnoty proměnné: název proměnné jako argument
    // System.out.println(myInt);
    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
    System.out.println("User input");

    String userName = myObj.nextLine();  // Read user input
    System.out.println("Username is: " + userName);  // Output user input
    }

}