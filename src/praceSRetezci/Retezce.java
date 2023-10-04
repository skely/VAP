package praceSRetezci;

public class Retezce {
    public static void main(String[] args){
        // Toto je řádkový komentář
        /*
        Toto je blokový komentář.
         */

        String retezec = "Střední průmyslová škola elektrotechnická.";
        System.out.println(retezec);
        String a = "ahoj";  // deklarace promenne "a" a nastaveni hodnoty na "ahoj"
        String b = "kámo";
        int c = 15;
        System.out.println(a + b);  // znaménko "+" spojuje řetězce

        int d = a.length();  // funkce length() vrací délku řetězce
        System.out.println(d);

        System.out.println(retezec.charAt(0));  // vrací znak na pozici (x)
        System.out.println(retezec.substring(8));  // vrací část řetězce od pozice (x) do konce
        System.out.println(retezec.substring(8, 9));  // vrací část řetězce od pozice (x - včetně) do pozice (y - kromě)
        System.out.println(retezec.equals(a));  // porovnává dva řetězce

        a = "ahoj ";
        b = "Karle";

        if (a.equals(b)){
            System.out.println("stejne retezce");
        } else {
            System.out.println("ruzne retezce");
        }

        System.out.println(a.concat(b));
        System.out.println(a+b);


        System.out.println(retezec);
        System.out.println(retezec.indexOf("el"));  // vrací pozici znaku v řetězci (!!! vrací pozici prvního výskytu)

        System.out.println(retezec.replace("e", "QQ"));


        String[] poleRetezcu = retezec.split("e");  // rozdělí řetězec na podřetězce a vloží je do pole řetězců
        for (int i = 0; i < poleRetezcu.length; i++) {
            System.out.println(poleRetezcu[i]);
        }
        for (String element : poleRetezcu){
            System.out.println(element);
        }

        String text = "ABABALKBAbljbljkblkbBLKBLBBbblbwlekvbqlbLBL";

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        System.out.println("Znak 'a' je znak.");
        System.out.println("Znak \"a\" \\je\\ znak.\nTohle je nová řádka.\t Znak \\n začíná novou řádku!");

    }
}
