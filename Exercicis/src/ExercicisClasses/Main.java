package ExercicisClasses;

public class Main {
    public static void main(String[] args) {
        //quadratMagic();
        numeros();
        //cartes();
    }

    private static void quadratMagic() {
        QuadratMagic quadratMagic = new QuadratMagic();
        quadratMagic.imprimeix(5);
    }

    private static void cartes() {
        Baralla baralla = new Baralla();
        baralla.imprimeix();
        baralla.mezclar();
    }

    static void numeros(){

        //Primer numero en int
        Nombre n1 = new Nombre(13);

        System.out.println("Primer numero en hexadecimal: ");
        System.out.println(n1.hex());

        System.out.println("Primer numero en binari: ");
        System.out.println(n1.bin());

        //String amb numero romá
        Nombre n2 = new Nombre("C");

        System.out.println("Segon numero en hexadecimal: ");
        System.out.println(n2.hex());

        System.out.println("Segon numero en binari: ");
        System.out.println(n2.bin());
    }

}
