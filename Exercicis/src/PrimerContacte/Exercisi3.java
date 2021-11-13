package PrimerContacte;//"Escriu un programa que mostri per pantalla la successió de números 2, 4, 8, 16, 32..."

public class Exercisi3 {
    public static void main(String[] args) {

        //Cream les variables "n" i "s"
        int n = 1;
        int s = 0;

        //Feim un bucle on "n" es la cadena que es multiplica per 2.
        //Anirem sumant 1 a s, per poder posar fi al nostre while.
        while (s < 10) {
            n = n * 2;
            s++;

            //A cada volta, mostrarem per pantalla "n".
            System.out.println(n);
        }
    }
}
