package praceSRetezci;

public class SirfovacSpust {
    public static void main(String[] args){
        String text = "text";
        String zasifrovanyText = Sifrovac.zasifruj(text);

        System.out.println(text);
        System.out.println(zasifrovanyText);
        String odsifrovanyText = Sifrovac.desifruj(zasifrovanyText);
        System.out.println(odsifrovanyText);
        Sifrovac.vypisTabulkuZnaku();
    }
}
