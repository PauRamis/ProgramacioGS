package PrimerContacte;//"Escriu un programa que converteixi una temperatura en graus Celsius a Farenheit.
//Cerca a internet l'equivalència."

import java.util.Scanner;

public class Exercisi2 {
    public static void main(String[] args) {

        //Demanam els Celcius a l'usuari
        Scanner s = new Scanner(System.in);
        System.out.println("Posa la temperatura en Cº");

        //L'usuari introdueix el nombre de Celcius
        double celcius = Double.parseDouble(s.nextLine());

        //Pasam els Celcius a Farenheit
        double farenheit = celcius * (9.0 / 5.0) + 32.0;

        //Exposam el resultat
        System.out.printf("%.2f en Celcius son %.2f Farenheit:", celcius, farenheit);

    }
}
