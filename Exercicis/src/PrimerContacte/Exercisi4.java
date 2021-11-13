package PrimerContacte;//"Escriu un programa que imprimeixi per pantalla la taula de multiplicar d'un nombre qualsevol".

import java.util.Scanner;

public class Exercisi4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Demanam una numero al usuari.
        System.out.println("De quin nombre vol la taula de multiplicar?");
        int n = Integer.parseInt(s.nextLine());
        int m = 0;
        while (m<11){
            int r = n*m;
            System.out.println(n + " * " + m + " = " + r);
            m++;
        }
    }
}
