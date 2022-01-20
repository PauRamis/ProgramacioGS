package ExerciciCombat;
import java.util.Scanner;

//Aquest es un joc tipus pedra, paper, estisores, però més complexe i amb tematica de RPG.
public class Main {
    public static void main(String[] args) {

        //Primer cream dos jugadors, Jugador1 i Jugador2.
        Jugador Jugador1 = new Jugador("Pau", 10, 5);
        Jugador Jugador2 = new Jugador("Adversari", 5, 15);

        /*Proves
        Jugador1.MostrarEstadistiques();
        Jugador1.Penalitzacio(5);
        Jugador1.MostrarEstadistiques();

        Jugador2.MostrarEstadistiques();
        Jugador2.restarVida(5);
        Jugador2.MostrarEstadistiques();
        Jugador2.recuperaVida(5);
        Jugador2.MostrarEstadistiques();
        */

        ronda(Jugador1, Jugador2);

    }
    static void ronda(Jugador Jugador1, Jugador Jugador2){
        int estr1 = accioJugador();
        int estr2 = accioAdversari();

        if (estr1 == 1 && estr2 == 2){
            Jugador2.recuperaVida(Jugador2.TiraMonedes(Jugador2.puntsDefensa));
        }
        if (estr1 == 2 && estr2 == 1){
            Jugador1.recuperaVida(Jugador1.TiraMonedes(Jugador1.puntsDefensa));
        }

        Jugador1.MostrarEstadistiques();
        Jugador2.MostrarEstadistiques();



        //Guanya el jugador si consegueix matar a l'adverasi abans de morir ell. En el cas contrari, perd.
        if (Jugador1.puntsVida == 0){
            System.out.println("GAME OVER");
            System.out.println("Has perdut!");
        } else if (Jugador2.puntsVida == 0){
            System.out.println("FELICITATS");
            System.out.println("Has guanyat!");
        }
    }

    static int accioJugador(){
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

        return accioJug;
    }

    static int accioAdversari(){
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

        return accioAdv;
    }

}
