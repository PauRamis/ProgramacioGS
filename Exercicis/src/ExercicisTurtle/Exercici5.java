package ExercicisTurtle;

import java.util.Scanner;

public class Exercici5 {
    static Turtle turtle = new Turtle(800, 800);

    public static void main(String[] args) {

        //Demanam a l'usuari les dades
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nombre de quadrats");
        int nQuadrats = Integer.parseInt(scanner.nextLine());
        System.out.println("Longitut de quadrat original");
        int longitutOriginal = Integer.parseInt(scanner.nextLine());


        augment(nQuadrats, longitutOriginal);

        turtle.show();
    }
        //Aquesta funció farà un quadrat
        private static void quadrat ( int costat){
            for (int i = 0; i < 4; i++) {
                turtle.penDown = true;
                turtle.forward(costat);
                turtle.turnRight(90);
            }

        }


        //Aquesta funció, augmenta la longitut del quadrat anterior, i es desplaça pel seguent
        private static void augment (int nombreQuadrats, int longitutO){
            for (int i = 0; i < nombreQuadrats; i++) {
                quadrat(longitutO);
                turtle.penDown = false;
                turtle.turnLeft(90);
                turtle.forward(15);
                turtle.turnLeft(90);
                turtle.forward(15);
                turtle.turnLeft(180);
                longitutO = longitutO+30;


            }
        }

}