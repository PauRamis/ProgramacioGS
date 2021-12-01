package Matrius;

import java.util.Scanner;

//Aquest programa haura de poder sumar o restar dues matrius
public class CalcMatrius {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //Primer inserim les matrius, per la suma i resta, han de ser igual de grans
        double[][] ar1 = {{1, 2, 3}, {1, 2, 2}};
        double[][] ar2 = {{2, 1, 3}, {2, 4, 1}};
        double[][] arResultat = new double[3][3];

        //Si l'usuari vol sumar usara +, i si vol restar usara -.
        System.out.println("suma o resta?");
        String signe = s.nextLine();

        suma(ar1, ar2, arResultat);
        /*
        //Depenguent de si vol sumar o restar, anira a una funció o a una altre.
        if (signe == "suma") {resultat = suma(resultat, ar1, ar2);

            System.out.println("el resultat de la suma és: ");
        }
        else if (signe == "resta") {resultat = resta(resultat, ar1, ar2);

            System.out.println("el resultat de la resta és: ");
        }
        else resultat = "Error. Please enter suma or resta";
        */
    }

    private static double[][] suma(double[][] arResultat, double[][] ar1, double[][] ar2) {

        //En aques for, i es igual a les files
        for (int i = 0; i < 2; i++) {

            //En aquest for, j es igual a les columnes
            for (int j = 0; j < 3; j++) {
                arResultat[i][j]=ar1[i][j]+ar2[i][j];
                System.out.print(arResultat[i][j]+" ");
            }
            System.out.println();
        }
        return arResultat;
    }


    private static double[][] resta(double[][] arResultat, double[][] ar1, double[][] ar2) {
        String resultat = "";

        return arResultat;
    }

}
