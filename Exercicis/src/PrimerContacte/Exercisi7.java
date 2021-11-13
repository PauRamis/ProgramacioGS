package PrimerContacte;//7.- Escriu un programa que solucioni una equació de segon grau.
// Els coeficients de l'equació seran els paràmetres (Ax² + Bx + C = 0)

import java.util.Scanner;

public class Exercisi7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A");
        double coefifientA = Integer.parseInt(scanner.nextLine());

        System.out.println("B");
        double coefifientB = Integer.parseInt(scanner.nextLine());

        System.out.println("C");
        double coefifientC = Integer.parseInt(scanner.nextLine());

        double discriminant = coefifientB*coefifientB - 4 * coefifientA * coefifientC;

        if (discriminant<0) {
            System.out.println("No hi ha solució");
        } else if (discriminant == 0) {
            double sol = -coefifientB / (2*coefifientA);
            System.out.printf("hi ha una solució: %.2f\n", sol);
        } else {
            double sol1 = (-coefifientB + Math.sqrt(discriminant)) / (2*coefifientA);
            double sol2 = (-coefifientB - Math.sqrt(discriminant)) / (2*coefifientA);
            System.out.printf("hi ha dues solucións: %.2f i %.2f\n", sol1, sol2);

        }

    }
}
