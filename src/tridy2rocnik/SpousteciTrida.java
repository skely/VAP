package tridy2rocnik;

public class SpousteciTrida {
    public static void main(String[] args){
        Postava karel = new Postava("Karel", 20, 3);
        Postava pavel = new Postava("Pavel", 15, 5);

        System.out.println(pavel.getZdravi());
        System.out.println(karel.getUtok());
        karel.zautoci(pavel);
        System.out.println(pavel.getZdravi());
        System.out.println(karel.getJmeno() + " zautocil na " + pavel.getJmeno() + " a dal mu za " + karel.getUtok() + "." );
        System.out.println(pavel.getJmeno() + " ma ted " + pavel.getZdravi() + " zivotu.");

    }
}
