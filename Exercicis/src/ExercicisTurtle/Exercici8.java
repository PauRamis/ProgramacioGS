package ExercicisTurtle;

public class Exercici8 {
    static Turtle turtle = new Turtle(800, 800);

    public static void main(String[] args) {

        //En el main unicament usam la funció figura, sense parametres
        figura();
        turtle.show();
    }

    //La funció triangle fa un triangle simple de 60 pixels.
    private static void triangle(){
        for (int i = 0; i < 3; i++){
            turtle.forward(60);
            turtle.turnRight(360/3);
        }
    }

    //La funció figura, fa 4 triangles, i els coloca en la seva posició optima
    private static void figura(){

        //Un turnLeft per que el triangle ens surti recte
        turtle.turnLeft(30);
        for (int i = 0; i < 4; i++){
            triangle();
            turtle.turnRight(90);
        }
    }
}
