package Matrius;
import java.util.Scanner;
//Aquest programa haura de poder sumar o restar dues matrius
public class CalcMatrius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Primer inserim les matrius, per la suma i resta, han de ser igual de grans
        int[][] ar1 = {{1, 2, 3}, {1, 2, 2}};
        int[][] ar2 = {{2, 1, 3}, {2, 4, 1}};

        System.out.println("suma (+) o resta (-) ?");
        String signe = s.nextLine();

        String resultat = "";

        if (signe == "+") resultat = suma(resultat, ar1, ar2);
        else resultat = resta(resultat, ar1, ar2);

        System.out.println(resultat);
    }

    private static String suma(String resultat, int[][] ar1, int[][] ar2) {

        return resultat;
    }


    private static String resta(String resultat, int[][] ar1, int[][] ar2) {

        return resultat;
    }

}
