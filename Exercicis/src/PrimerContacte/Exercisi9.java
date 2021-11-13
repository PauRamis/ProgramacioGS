package PrimerContacte;//Escriu un programa que calculi el màxim comú divisor de dos números.

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercisi9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Donam el primer numero");
        int na = Integer.parseInt(scanner.nextLine());

        System.out.println("Donam el segon numero");
        int nb = Integer.parseInt(scanner.nextLine());
        int nna = na, nnb = nb;

        while (na != nb) {
            if (na < nb) {

                // intercanviar les variables
                int t = na;
                na = nb;
                nb = t;
            }
            na = na - nb;
        }
        System.out.printf("El MCD de %d i %d és %d\n", nna, nnb, na);
    }
}
