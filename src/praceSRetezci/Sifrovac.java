package praceSRetezci;

public class Sifrovac {
    public static String zasifruj(String vstup){
        String vystup = "";
        for (int i=0; i<vstup.length(); i++){
            int charHodnota = vstup.charAt(i);
            vystup += (char)(charHodnota+1);
        }
        return vystup;
    }
    public static String desifruj(String vstup){
        String vystup = "";
        for (int i=0; i<vstup.length(); i++){
            int charHodnota = vstup.charAt(i);
            vystup += (char)(charHodnota-1);
        }
        return vystup;
    }
    public static void vypisTabulkuZnaku(){
        for (int i=0; i<10000000; i++){
            System.out.println(i + " : " + (char)(i));
        }
    }
}
