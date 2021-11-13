package ExercicisTurtle;

import java.util.Scanner;


//NO ACABAT

public class Exercici9 {
    static Turtle turtle = new Turtle(800, 800);

    public static void main(String[] args) {
        //L'usuari defineix el nombre de triangles i longitut dels costats
        Scanner scanner = new Scanner(System.in);
        System.out.println("nombre de triangles");
        int nTriangles = Integer.parseInt(scanner.nextLine());
        System.out.println("longitut dels costats del poligon");
        int longCostats = Integer.parseInt(scanner.nextLine());

        //Feim els calculs trigonometrics necessaris per treure les dades dels triangles
        double alfa = 360d / nTriangles;
        double beta = (180d - alfa) / 2d;
        double alfaRad = alfa * Math.PI / 180d;
        double hip = (((double) longCostats) / 2d) / (Math.sin(alfaRad / 2d));
        double angle = 360d / nTriangles;

        cicle(hip, beta, longCostats, angle);

        turtle.show();
    }

    //La funció triangle simplement fá el triangle amb l'hipotenusa
    private static void triangle(double hip, double beta, int longCostats, double angle) {
        turtle.forward((int) hip);
        turtle.turnRight(180 - (int) angle);
        turtle.forward(longCostats);
        turtle.turnRight(180 - (int) angle);
        turtle.forward((int) hip);

    }

    //Cicle repetirà el triangle les vegades necessaries.
    private static void cicle(double hip, double beta, int longCostats, double angle) {
        for (int i = 0; i < 4; i++) {
            triangle(hip, beta, longCostats, angle);
            turtle.turnRight(130);
            turtle.turnRight((int) angle);
        }

    }

}
