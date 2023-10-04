package praceSRetezci;

public class PrikladPraceSRetezci {
    public static void main(String[] args) {
        String retezec = "Střední průmyslová škola elektrotechnická.";

        // napište for-cyklus, který vypíše všechny pozice písmene "e"
        char hledam = 'e';
        for (int i = 0; i<retezec.length(); i++) {
            if (retezec.charAt(i) == hledam) {
                System.out.println(i);
            }
        }

        // napiste kod, ktery vypise pozici slova "škola".
        System.out.println(retezec.indexOf("škola"));





    }
}
