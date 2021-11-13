package ExercicisTurtle;

public class Exercici10 {
    static Turtle turtle = new Turtle(800, 800);

    public static void main(String[] args) {

        //Activam la funció figura amb una longitut de 57 pixels
        figura(57);
        turtle.show();
    }

    //La funció cuerva simplement fara el quart de circumferencia en els dos triangles
    private static void curva(){
        for (int i = 0; i < 90; i++){
            turtle.turnRight(1);
            turtle.forward(1);
        }
    }

    //La funció triangle, farà els dos costats de cada triangle, i posara la curva enmig
    private static void triangle(int longCostat){
        turtle.forward(longCostat);
        turtle.turnRight(90);
        curva();
        turtle.turnRight(90);
        turtle.forward(longCostat);
    }

    //La funcó figura, finalment repeteix la funció triangle dues vegades, en un angle diferent
    private static void figura(int longitut){
        triangle(longitut);
        turtle.turnLeft(90);
        triangle(longitut);
    }
}
