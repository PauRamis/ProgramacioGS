package ExerciciCombat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Primer cream dos jugadors, Jugador1 i Jugador2.
        Jugador Jugador1 = new Jugador("Pau", 10, 5);
        Jugador Jugador2 = new Jugador("Adversari", 5, 15);

        //Aleatoriament es mostra el seu exit, que sirá representat en punts
        int exit1 = 5;
        int exit2 = 4;

        /*Proves
        Jugador1.MostrarEstadistiques();
        Jugador1.Penalitzacio(exit1);
        Jugador1.MostrarEstadistiques();

        Jugador2.MostrarEstadistiques();
        Jugador2.restarVida(exit2);
        Jugador2.MostrarEstadistiques();
        Jugador2.recuperaVida(exit2);
        Jugador2.MostrarEstadistiques();
        */



        String estr1 = "Atac";
        String estr2 = "Defensa";
        ronda(Jugador1, estr1, exit1, Jugador2, estr2, exit2);


    }
    static void ronda(Jugador Jugador1, String estr1, int exit1, Jugador Jugador2, String estr2, int exit2){
        if (estr1.equals("Atac") && estr2.equals("Defensa")){
            Jugador2.recuperaVida(Jugador2.TiraMonedes(Jugador2.puntsDefensa));
        }
        if (estr1.equals("Defensa") && (estr2.equals("Atac"))){
            Jugador1.recuperaVida(Jugador1.TiraMonedes(Jugador1.puntsDefensa));
        }
        Jugador1.MostrarEstadistiques();
        Jugador2.MostrarEstadistiques();

        if (Jugador1.puntsVida == 0){
            System.out.println("GAME OVER");
            System.out.println("Guanya Jugador2");
        } else if (Jugador2.puntsVida == 0){
            System.out.println("GAME OVER");
            System.out.println("Guanya Jugador1");
        }
    }

    static void accioJugador(){
        Scanner sc = new Scanner(System.in);

        //Triem les estrategies del jugador
        System.out.println("1=Atac, 2=Defensa, 3=Engany, 4=Maniobra");
        int accioJug = sc.nextInt();
        switch (accioJug){
            case 1:

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;

        }

    }

    static void accioAdversari(){
        //Triem les estrtategies de la maquina aleatoriament
        double accioAleat = Math.random();
        int accioAdv;
        if (accioAleat < 0.25)
            accioAdv = 1;
        else if (accioAleat < 0.50)
            accioAdv = 2;
        else if (accioAleat < 0.75)
            accioAdv = 3;
        else accioAdv = 4;
    }

}
