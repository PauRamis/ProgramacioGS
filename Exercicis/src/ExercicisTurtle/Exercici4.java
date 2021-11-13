package ExercicisTurtle;

import java.util.Scanner;

public class Exercici4 {
    static Turtle turtle = new Turtle(800, 800);
    public static void main(String[] args) {

        //Demanam a l'usuari les dades
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre de fulles");
        int nFulles = Integer.parseInt(scanner.nextLine());
        System.out.println("Longitut de les fulles");
        int LongitutFulles = Integer.parseInt(scanner.nextLine());

        //Començam el tronc
        turtle.forward(LongitutFulles/2);

        //Les funcions que fa les fulles, les de la dreta i les de la esquerra
        fulla1(LongitutFulles, nFulles);
        fulla2(LongitutFulles, nFulles);

        //Acabam el tronc
        turtle.turnRight(45);
        turtle.forward(LongitutFulles/2);

        //Finalment turtle ens ensenyara el dibuix
        turtle.show();
    }


//La funció que fa la primera columna de fulles
    private static void fulla1(int llargaria, int nombreFulles) {
        for (int i = 0; i < nombreFulles; i++) {
            turtle.turnLeft(90);
            turtle.forward(llargaria);
            turtle.turnRight(135);
            turtle.forward((int) Math.sqrt((llargaria*llargaria)*2));
            turtle.turnLeft(45);
        }

        punta(llargaria/3);
    }

    private static void punta(int longPunta){
        turtle.turnRight(45);
        turtle.forward(longPunta);
        turtle.turnRight(90);
        turtle.forward(longPunta);

    }

    //La funció fulla2, fa la segona mitat de les fulles creades
    private static void fulla2(int llargaria, int nombreFulles) {

        for (int i = 0; i < nombreFulles; i++) {
            turtle.forward((int) Math.sqrt((llargaria*llargaria)*2));
            turtle.turnRight(135);
            turtle.forward(llargaria);
            turtle.turnLeft(135);
        }
    }
}

