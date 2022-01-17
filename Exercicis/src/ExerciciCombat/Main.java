package ExerciciCombat;

public class Main {
    public static void main(String[] args) {
        Jugador Jugador1 = new Jugador("Pau", 10, 5);
        Jugador Jugador2 = new Jugador("Adversari", 5, 15);

        int exit1 = 5;
        int exit2 = 6;

        Jugador1.restarVida(exit1);
        Jugador1.MostrarEstadistiques();
        Jugador1.recuperaVida(exit1);
        Jugador1.MostrarEstadistiques();

        Jugador2.restarVida(exit2);
        Jugador1.MostrarEstadistiques();
        Jugador2.recuperaVida(exit2);
        Jugador2.MostrarEstadistiques();

        String estr1 = "Atac";
        String estr2 = "Defensa";


    }
    static void ronda(Jugador jugador1, String estr1, int exit1, Jugador jugador2, String estr2, int exit2){
        if (estr1.equals("Atac") && estr2.equals("Defensa")){
            jugador2.recuperaVida(exit2);
        }
        if (estr1.equals("Defensa") && (estr2.equals("Atac"))){
            jugador1.recuperaVida(exit1);
        }
    }
}
