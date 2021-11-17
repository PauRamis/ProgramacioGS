package ExercicisArrays;
import java.util.Arrays;

/*
Escriu una funció que inverteixi un array.
Alerta: no ha de tornar un array, ha d'invertir el que li passem.
Recordeu que tots els objectes (tipus no primitius) es passen PER REFERÈNCIA, no per valor.
 */
import java.util.Scanner;
public class ExArrays4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] ar = new int[4];

        //L'usuari introdueix els valors de l'array
        System.out.println("Introdueix el primer nombre");
        ar[0] = s.nextInt();
        System.out.println("Introdueix el segon nombre");
        ar[1] = s.nextInt();
        System.out.println("Introdueix el tercer nombre");
        ar[2] = s.nextInt();
        System.out.println("Introdueix el quart nombre");
        ar[3] = s.nextInt();

        //L'invertim i mostram a l'usuari
        inverteixArray(ar);
        System.out.println(Arrays.toString(ar));

    }

    static void inverteixArray(int[] ar){
        int[] artemporal = new int[ar.length];
        for (int i = 0; i < ar.length; i++) {
            artemporal[ar.length-i-1] = ar[i];

        }
        for (int i = 0; i < ar.length ; i++) {
            ar[i] = artemporal[i];
        }
    }
}
