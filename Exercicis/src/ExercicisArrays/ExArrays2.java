package ExercicisArrays;
import java.lang.reflect.Array;
import java.util.Arrays;
//Escriu un programa que declara i inicialitza un array a[] de 1000 elements, i intenta accedir a l'element 1000.
// El programa compila? Funciona correctament?

public class ExArrays2 {
    public static void main(String[] args) {
        int[] ar1 = new int[1000];

        //El seguent int esta bloque    jat, ja que el resultat de l'exercici dona error, el maxim es 999 (length -1)
        //int a = ar1[ar1.length];
        int a = ar1[ar1.length-1];

        System.out.println(a);
    }
}
