package ExercicisTurtle;

import java.util.Scanner;

public class Exercici1 {
    static Turtle turtle = new Turtle(800, 800);

    public static void main(String[] args) {
        //L'usuari defineix el nombre de quadrats en hotitzontal i vertical i la seva longitut
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre de quadrats en horizontal:");
        int quadHorizontal = Integer.parseInt(scanner.nextLine());
        System.out.println("Nombre de quadrats en vertical:");
        int quadVertical = Integer.parseInt(scanner.nextLine());
        System.out.println("Longitut dels costats");
        int longitut = Integer.parseInt(scanner.nextLine());


        //Aquesta es la funció que crida al script fila tantes vegades com files es demani
        for (int i = 0; i < quadVertical; i++){
            //Feim una fila en horitzontal
            fila(quadHorizontal, longitut);
            //I a continuació tornam enrere i baixam per fer la seguent
            turtle.penDown = false;
            turtle.turnLeft(90);
            turtle.forward(quadHorizontal*longitut*2);
            turtle.turnLeft(90);
            turtle.forward(longitut*2);
            turtle.turnLeft(180);
            turtle.penDown = true;
        }

        //Demanam a turtle que dibuixi tot
        turtle.show();
    }

    //Definim una funció per fer un quadrat individual
    private static void quadrat(int costat) {
        for (int i = 0; i < 4; i++) {
            turtle.forward(costat);
            turtle.turnLeft(90);
        }
    }

    //Definim un funció per fer una fila de quadrats
    private static void fila(int nQuadrados, int anchura) {
        for (int i = 0; i < nQuadrados; i++) {

            //Feim el quadrat
            quadrat(anchura);

            //Desprès del quadrat, deixam un espai pel seguent
            turtle.penDown = false;
            turtle.turnRight(90);
            turtle.forward(anchura*2);
            turtle.turnLeft(90);
            turtle.penDown = true;
        }
    }
}
