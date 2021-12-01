package ExercicisArrays;
import java.util.Arrays;

public class ExArrays6 {
    public static void main(String[] args) {

        //Cream els dos arrays
        boolean[] ar1 = new boolean[5];
        boolean[] ar2 = new boolean[5];

        fila(ar1);
        columna(ar2);

    }


    //TIENE QUE SER BIDIMENSIONAL, NO  2 ARRAYS.
    private static void fila(boolean[] ar1) {
        for (int i = 0; i < ar1.length ; i++) {
            Arrays.fill(ar1, Boolean.TRUE);
            System.out.println(ar1[i]);
        }

    }

    private static void columna(boolean[] ar2){
        for (int i = 0; i < ar2.length; i++) {
            while (!ar2[i]) {
                System.out.println(" ");
            }
        }
    }



/*    private static void dibuixCreu(boolean[][] ar){
        int centre = ar.length/2;
        boolean parell = (ar.length & 1) == 0;

        for (int i = 0; i < ar.length; i++) {
            ar[centre][i] = ar[i][centre] = true;
            if (parell){
                ar[centre-1][i] = ar[i][centre-1];
            }
        }
    }*/
}
