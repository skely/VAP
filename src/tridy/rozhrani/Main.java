package tridy.rozhrani;

public class Main {
    public static void main(String[] args){
        Prase mojePrasatko = new Prase();  // vytvorime instanci tridy Prase
        mojePrasatko.zvukZvirete();  // zavolame funkci (metodu) zvukZvirete()
        mojePrasatko.spani();  // zavolame funkci (metodu) spani()

        Krava mojeKravicka = new Krava();
        mojeKravicka.zvukZvirete();
        mojeKravicka.spani();
    }
}
