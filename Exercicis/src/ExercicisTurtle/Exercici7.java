package ExercicisTurtle;

import java.util.Scanner;

public class Exercici7 {
    static Turtle turtle = new Turtle(800, 800);

    public static void main(String[] args) {
        //L'usuari defineix el nombre de fulles del dibuix
        Scanner scanner = new Scanner(System.in);
        System.out.println("nombre de fulles");
        int nFulles = Integer.parseInt(scanner.nextLine());

        cicle(nFulles, 360/nFulles);
        turtle.show();
    }

    //Fulla1 fà la primera mitat de la fulla
    private static void fulla1(){

        //Primer giram 50 graus perque ens quedi la fulla recta
        turtle.turnLeft(50);
        for (int i = 0; i < 100; i++){
            turtle.turnRight(1);
            turtle.forward(2);
        }
    }

    //Fulla2 gira i fà l'altre mitat de la fulla
    private static void fulla2(){
        turtle.turnRight(80);
        for (int i = 0; i < 100; i++){
            turtle.turnRight(1);
            turtle.forward(2);
        }
    }

    //En la  funció cicle, repetim per el nombre de fulles que volem
    private static void cicle(int repetir, int angle){
        for (int i = 0; i < repetir; i++){
            fulla1();
            fulla2();
            turtle.turnRight(130);
            turtle.turnRight(angle);

        }
    }
}
