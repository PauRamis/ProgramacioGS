package ExercicisTurtle;

import java.util.Scanner;

public class Exercici6 {
    static Turtle turtle = new Turtle(800, 800);

    public static void main(String[] args) {
        //L'usuari defineix el nombre de costats del poligon i el seu nombre de voltes
        Scanner scanner = new Scanner(System.in);
        System.out.println("nombre de voltes");
        int nVoltes = Integer.parseInt(scanner.nextLine());
        System.out.println("nombre de costats del poligon base");
        int nCostats = Integer.parseInt(scanner.nextLine());

        espiral(nVoltes, nCostats, 15);

        turtle.show();
    }

    //Aquesta funció es l'encarregada de fer l'espiral, es a dir, la curva mentre incrementa
    private static void espiral(int repeticio, int costats, int longitut){
        //El bucle es repeteix el doble de vegades que costats volem
        for (int i = 0; i < repeticio*2; i++){

            //Per calcular l'angle, dividim 360 (cercle complet) entre els costats que volem
            curva( costats/2, longitut, 360/costats);
            longitut= longitut+5;
        }
    }
    //Perque quedi millor, dividim el nombre de costats que volem per repetició, però duplicam aquestes

    //Aquesta funció simplement avança el llapis i gira cap a la dreta la longitut i graus que li diuen.
    private static void curva( int voltes, int longitut, int angle){
        for (int i = 0; i < voltes; i++) {
            turtle.forward(longitut);
            turtle.turnRight(angle);
        }
    }
}
