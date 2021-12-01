package ExercicisArrays;
import java.util.Arrays;

//INACABAT
public class ExArrays6 {
    public static void main(String[] args) {

        //Cream els dos arrays
        boolean[][] ar = new boolean[5][5];

        dibuixCreu(ar);

    }

    private static void dibuixCreu(boolean[][] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i][i]);
        }

    }

}