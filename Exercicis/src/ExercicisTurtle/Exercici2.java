package ExercicisTurtle;

import java.util.Scanner;

public class Exercici2 {
    static Turtle turtle = new Turtle(800, 800);

    public static void main(String[] args) {
        //Demanam a l'usuari les dades
        Scanner scanner = new Scanner(System.in);
        System.out.println("Distancia total en horitzontal");
        int dHoritzontal = Integer.parseInt(scanner.nextLine());
        System.out.println("Distancia toal en vertical");
        int dVertical = Integer.parseInt(scanner.nextLine());
        System.out.println("Nombre d'escalons a cada costat");
        int nEscalons = Integer.parseInt(scanner.nextLine());

        //Usam la funció escalo descendent per baixar i l'accendent per pujar
        escalaDescendent(dHoritzontal/nEscalons, dVertical/nEscalons, nEscalons);
        escalaAscendent(dHoritzontal/nEscalons, dVertical/nEscalons, nEscalons);

        //L'ultima linea es surt de la funció, aixi que la feim apart, per comoditat
        turtle.turnRight(90);
        turtle.forward(dHoritzontal/nEscalons);

        //Per ultim, turtle ens mostrara el que ha dibuixat
        turtle.show();
    }

    //La finció escalaDescendent fa la primera part del dibuix, baixant
    private static void escalaDescendent (int costatHorizontal, int costatVertical, int escalons) {
        for (int i = 0; i < escalons; i++) {
            turtle.turnRight(90);
            turtle.forward(costatHorizontal);
            turtle.turnRight(90);
            turtle.forward(costatVertical);
            turtle.turnLeft(180);

        }

    }

    //La escala ascendet, fa la segona mitat, exactament igual però cap a dalt
    private static void escalaAscendent (int costatHorizontal, int costatVertical, int escalons){
        for (int i = 0; i < escalons; i++) {
            turtle.turnRight(90);
            turtle.forward(costatHorizontal);
            turtle.turnLeft(90);
            turtle.forward(costatVertical);
        }
    }

}
