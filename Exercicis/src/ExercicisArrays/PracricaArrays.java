package ExercicisArrays;
import java.lang.reflect.Array;
import java.util.Arrays;

//Aqui intentraem ordenar els nombres de l'array de més gran a més petit.

public class PracricaArrays {
    public static void main(String[] args) {
        int[] ar = {1,3,-2,15,2};
        int n = ar.length;
        int i = 0;

        do{
            i=0;
            do {

                //Aqui esteim intercanviant el nombre i amb el de davant, si és més petit.
                if (ar[i] > ar [i+1]){
                    int t = ar[i];
                    ar[i] = ar[i+1];
                    ar[i+1] = t;
                }
                i++;

            }   while (i < n-1);
            n--;
        } while (n > 1);
        System.out.println(Arrays.toString(ar));
    }

}
