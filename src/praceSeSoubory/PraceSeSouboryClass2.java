package praceSeSoubory;

public class PraceSeSouboryClass2 extends PraceSeSouboryClass{

    public PraceSeSouboryClass2(String jmenoSouboru) {
        super(jmenoSouboru);
    }

    public void vypisData(String promenna){
        for (String radek : data){
            if (radek.split("\t")[1].equals(promenna)){
                System.out.println(radek);
            } else {

            }
        }
    }
    public void vypisData2(){
        for (String radek : data){
            String[] rozdelenyRadek = radek.split("\t");
            //System.out.println(rozdelenyRadek[3]);
            String cisloZaAckemString = rozdelenyRadek[3].substring(1);
            //System.out.println(cisloZaAckemString);
            int cisloZaAckemInt = Integer.valueOf(cisloZaAckemString);

            if (cisloZaAckemInt > 10){
                System.out.println(radek);
            }
        }
    }
    public void vypisData3(){
        for (String radek: data){
            String[] rozdelenyRadek = radek.split("\t");
            String jmeno = rozdelenyRadek[0];
            //System.out.println(jmeno.charAt(jmeno.length()-1));
            //System.out.println(Character.isDigit(jmeno.charAt(jmeno.length()-1)));
            if (!Character.isDigit(jmeno.charAt(jmeno.length()-1))){
                System.out.println(radek);
            } else {
                System.out.println(jmeno.substring(0, jmeno.length()-1) + "\t" + rozdelenyRadek[1] + "\t" +rozdelenyRadek[2] + "\t" +rozdelenyRadek[3]);
            }
        }
    }



}
