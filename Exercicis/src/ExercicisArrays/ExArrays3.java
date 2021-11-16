package ExercicisArrays;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
//Escriu una funció que accepti dos vectors de longitud 2 (dos arrays) i computi la distància euclidiana entre ells
// (l'arrel quadrada de la suma del quadrat de les diferències entre els elements).

public class ExArrays3 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
//Cream els dos arrays
        int[] ar1 = new int[2];
        int[] ar2 = new int[2];

        //L'usuari triarà la longitut dels vectors.
        System.out.println("Introdueix la variable x1");
        ar1[0] = s.nextInt();
        System.out.println("Introdueix la variable y1");
        ar1[1] = s.nextInt();

        System.out.println("Introdueix la variable x2");
        ar2[0] = s.nextInt();
        System.out.println("Introdueix la variable y2");
        ar2[1] = s.nextInt();

        //Calculam la distancia dels catets que formen els vectors, x3 i y3
        int x1 = ar1[0];
        int x2 = ar2[0];
        int x3 = Math.abs(x1-x2);

        int y1 = ar1[1];
        int y2 = ar2[1];
        int y3 = Math.abs(y1-y2);


        //Calculam quina seria la hipotenusa dels dos catets
        System.out.println("La distancia es de: ");
        System.out.println(Math.hypot(y3, x3));


    }
}
