package tridy.rozhrani;

public class Krava implements Zvire{  // trida Krava implementuje rozhrani Zvire

    @Override  // dekorator "@" neni nutny - zajistuje, že kompilator kontroluje, zda implementovane rozhrani obsahuje tuto funkci
    public void zvukZvirete() {  // je nutné implementovat vsechny funkce z rozhrani
        System.out.println("Kráva dělá: Búúú!");
    }

    @Override
    public void spani() {  // je nutné implementovat vsechny funkce z rozhrani
        System.out.println("Zzz");

    }
}
