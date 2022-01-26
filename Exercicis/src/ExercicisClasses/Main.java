package ExercicisClasses;

public class Main {
    public static void main(String[] args) {
        //Numero int
        Nombre n1 = new Nombre(10);

        //String amb numero romá
        Nombre n2 = new Nombre("III");

        System.out.println("numero hexadecimal: ");
        System.out.println(n1.hex());

        System.out.println("numero binari: ");
        System.out.println(n1.bin());

    }

}
