package ExercicisArrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExArrays4 {
    public static void main(String[] args) {
        int[] ar = {1,3,-2,15,2};
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
